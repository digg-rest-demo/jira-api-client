package se.phaseshift.jira.rest;

import java.lang.ClassLoader;

import java.io.*;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import com.google.gson.*;

import se.phaseshift.jira.rest.client.*;
import se.phaseshift.jira.rest.client.api.*;
import se.phaseshift.jira.rest.client.model.*;
import se.phaseshift.jira.rest.client.auth.*;

class Quote {
    // Utility funciton to create a short form of the Quote
    public static String shortQuote(Quote quote, int count) {
        String result = quote.getAuthor() + " -> ";
        String[] words = quote.getQuote().split("\\s+");

        int N = Math.min(count, words.length);

        for (int n = 0; n < N; n++) {
            result += words[n] + " ";
        }

        return result.trim();
    }

    private String quote;
    private String author;

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getQuote() {
        return this.quote;
    }
}

class Quotes {
     // List storing the quotes (in the future)
    private Quote[] quotes = null;

    //
    private Random random = new Random();

    public Quotes(String fileName) throws IOException, UnsupportedEncodingException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        Reader jsonReader = new InputStreamReader(inputStream);

        // Using Google Gson as it's already needed by the REST client
        Gson gson = new Gson();

        // Generate Quote list from json embedded in .jar file
        this.quotes = gson.fromJson(jsonReader, Quote[].class);
    }

    public Quote getRandomQuote() {
        return this.quotes[random.nextInt(this.quotes.length)];
    }
}

public class Main {
    public static void main(String[] args) throws ApiException, IOException {
        String token = "ATATT3xFfGF0DGZcv8oRyUtIPJljms_dLEI6YaFro-OTWTB5PTeeOoG6SYPZ6ULn0sfeTRhcX8olkxrg"
                     + "S7eUsgL0JoqJ3_51N2qqecAlLKuN5z6wHKvfIxIrZq3lauwpLrYRUgX7uDRVF9F0HZi0kFTlkXqvxrCkSI"
                     + "-dzN7xcGOAmdtafb4Ku1Y=EEF3A577";

        ApiClient apiClient = new ApiClient();
        apiClient.setUsername("digg@phaseshift.se");
        apiClient.setPassword(token);
        apiClient.setDebugging(true);
        apiClient.setBasePath("https://digg-demo.atlassian.net");

        // Load quotes
        Quotes quotes = new Quotes("clever-quotes.json");

        // Get random quote to generate ticket topic and text
        Quote quote = quotes.getRandomQuote();
        String summary = Quote.shortQuote(quote, 3);
        String description = quote.getQuote();

        // Look up my user
        MyselfApi myselfApi = new MyselfApi(apiClient);
        User user = myselfApi.getCurrentUser(null);

        System.out.println("Got user " + user.getDisplayName() + " with email " + user.getEmailAddress());

        // Find the project called "DIGG"
        ProjectsApi projectsApi = new ProjectsApi(apiClient);
        PageBeanProject projects = projectsApi.searchProjects(
                null, // startAt
                null, // maxResults
                null, // orderBy
                null, // id
                null, // keys
                "Support", // query
                null,  // typeKey
                null,  // categoryId
                null, // action
                "issueTypes", // expand
                null,  // status
                null,  // properties
                null   // propertyQuery
        );

        if (projects.getValues().size() > 0) {
            // Find the first project
            Project project = projects.getValues().get(0);

            String issueTypeId = "0";
            // Find the system type "Incident"
            for (IssueTypeDetails issueTypeDetails : project.getIssueTypes()) {
                if (issueTypeDetails.getName().equalsIgnoreCase("[System] Incident")) {
                    issueTypeId = issueTypeDetails.getId();
                }
            }

            System.out.println("Found issue type '[System] Incident': " + issueTypeId);

            // Create an issue
            IssuesApi issuesApi = new IssuesApi(apiClient);
            Map<String, Object> issueCreateParams = new HashMap<>();

            Map<String, Object> fields = new HashMap<>();
            fields.put("summary", summary);

            ArrayList<Map<String, Object>> contentFieldList = new ArrayList<>();
            Map<String, Object> contentContentField = new HashMap<>();
            contentFieldList.add(contentContentField);

            ArrayList<Map<String, Object>> contentTextList = new ArrayList<>();
            Map<String, Object> contentTextField = new HashMap<>();
            contentTextList.add(contentTextField);
            contentTextField.put("text", description);
            contentTextField.put("type", "text");

            contentContentField.put("content", contentTextList);
            contentContentField.put("type", "paragraph");

            Map<String, Object> contentTypeField = new HashMap<>();
            contentTypeField.put("content", contentFieldList);
            contentTypeField.put("type", "doc");
            contentTypeField.put("version", 1);

            fields.put("description", contentTypeField);

            Map<String, Object> issueTypeField = new HashMap<>();
            issueTypeField.put("id", issueTypeId);
            fields.put("issuetype", issueTypeField);

            Map<String, Object> projectField = new HashMap<>();
            projectField.put("id", project.getId());
            fields.put("project", projectField);

            // Assign to me
            Map<String, Object> assigneeField = new HashMap<>();
            assigneeField.put("accountId", user.getAccountId());
            fields.put("assignee", assigneeField);

            issueCreateParams.put("fields", fields);

            CreatedIssue createdIssue = issuesApi.createIssue(issueCreateParams, true);

            System.out.println("Created an Incident with key: " + createdIssue.getKey()
                                + ", and assigned it to " + user.getDisplayName());
        }
    }
}
