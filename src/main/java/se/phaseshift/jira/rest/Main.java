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
        apiClient.setUsername("myemail@mycompany.com");
        apiClient.setPassword("abcde My app token abcde");
        apiClient.setDebugging(true);
        apiClient.setBasePath("https://myjira.atlassian.net");

        // Look up my user
        MyselfApi myselfApi = new MyselfApi(apiClient);
        User user = myselfApi.getCurrentUser(null);

        // Find the project called "BUGS"
        /*
        ProjectsApi projectsApi = new ProjectsApi(apiClient);
        PageBeanProject projects = projectsApi.searchProjects(
                null, // startAt
                null, // maxResults
                null, // orderBy
                "BUGS", // query
                null,  // typeKey
                null,  // categoryId
                null,  // searchBy
                null, // action
                "issueTypes", // expand issue types
                null  // status
        );

        if (projects.getValues().size() > 0) {
            // Find the first project
            Project project = projects.getValues().get(0);

            String issueTypeId = "0";
            // Find the bug issue type
            for (IssueTypeDetails issueTypeDetails : project.getIssueTypes()) {
                if (issueTypeDetails.getName().equalsIgnoreCase("bug")) {
                    issueTypeId = issueTypeDetails.getId();
                }
            }

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

            System.out.println("Created an issue, and assigned it to " + user.getDisplayName());
            System.out.println("The issue key is " + createdIssue.getKey());
        }
         */
    }
}
