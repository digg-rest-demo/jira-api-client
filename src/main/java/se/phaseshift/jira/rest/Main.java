package se.phaseshift.jira.rest;

import java.util.Map;
import java.util.HashMap;

import se.phaseshift.jira.rest.client.*;
import se.phaseshift.jira.rest.client.api.*;
import se.phaseshift.jira.rest.client.model.*;
import se.phaseshift.jira.rest.client.auth.*;

public class Main {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername("digg@phaseshift.se");
        apiClient.setPassword("ATATT3xFfGF0DGZcv8oRyUtIPJljms_dLEI6YaFro-OTWTB5PTeeOoG6SYPZ6ULn0sfeTRhcX8olkxrgS7eUsgL0JoqJ3_51N2qqecAlLKuN5z6wHKvfIxIrZq3lauwpLrYRUgX7uDRVF9F0HZi0kFTlkXqvxrCkSI-dzN7xcGOAmdtafb4Ku1Y=EEF3A577");
        apiClient.setDebugging(false);
        apiClient.setBasePath("https://digg-demo.atlassian.net");

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
            fields.put("summary", "Create a test issue");
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

            System.out.println("Created an issue with key: " + createdIssue.getKey() + ", and assigned it to " + user.getDisplayName());
        }
    }
}
