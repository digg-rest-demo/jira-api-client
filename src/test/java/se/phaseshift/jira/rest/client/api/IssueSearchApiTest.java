/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT-d2bbf99a611e8c219fc0b1362289195366130541
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package se.phaseshift.jira.rest.client.api;

import se.phaseshift.jira.rest.client.model.IdSearchRequestBean;
import se.phaseshift.jira.rest.client.model.IdSearchResults;
import se.phaseshift.jira.rest.client.model.IssueMatches;
import se.phaseshift.jira.rest.client.model.IssuePickerSuggestions;
import se.phaseshift.jira.rest.client.model.IssuesAndJQLQueries;
import se.phaseshift.jira.rest.client.model.SearchRequestBean;
import se.phaseshift.jira.rest.client.model.SearchResults;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueSearchApi
 */
@Ignore
public class IssueSearchApiTest {

    private final IssueSearchApi api = new IssueSearchApi();

    /**
     * Get issue picker suggestions
     *
     * Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.  This operation returns two lists:   *  &#x60;History Search&#x60; which includes issues from the user&#x27;s history of created, edited, or viewed issues that contain the string in the &#x60;query&#x60; parameter.  *  &#x60;Current Search&#x60; which includes issues that match the JQL expression in &#x60;currentJQL&#x60; and contain the string in the &#x60;query&#x60; parameter.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIssuePickerResourceTest() throws Exception {
        String query = null;
        String currentJQL = null;
        String currentIssueKey = null;
        String currentProjectId = null;
        Boolean showSubTasks = null;
        Boolean showSubTaskParent = null;
        IssuePickerSuggestions response = api.getIssuePickerResource(query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent);

        // TODO: test validations
    }
    /**
     * Check issues against JQL
     *
     * Checks whether one or more issues would be returned by one or more JQL queries.  **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void matchIssuesTest() throws Exception {
        IssuesAndJQLQueries body = null;
        IssueMatches response = api.matchIssues(body);

        // TODO: test validations
    }
    /**
     * Search issue IDs using JQL
     *
     * Searches for IDs of issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  Use the [Search](#api-rest-api-3-search-post) endpoint if you need to fetch more than just issue IDs. The Search endpoint returns more information, but may take much longer to respond to requests. This is because it uses a different mechanism for ordering results than this endpoint and doesn&#x27;t provide the total number of results for your query.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchForIssuesIdsTest() throws Exception {
        IdSearchRequestBean body = null;
        IdSearchResults response = api.searchForIssuesIds(body);

        // TODO: test validations
    }
    /**
     * Search for issues using JQL (GET)
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchForIssuesUsingJqlTest() throws Exception {
        String jql = null;
        Integer startAt = null;
        Integer maxResults = null;
        String validateQuery = null;
        List<String> fields = null;
        String expand = null;
        List<String> properties = null;
        Boolean fieldsByKeys = null;
        SearchResults response = api.searchForIssuesUsingJql(jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys);

        // TODO: test validations
    }
    /**
     * Search for issues using JQL (POST)
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  There is a [GET](#api-rest-api-3-search-get) version of this resource that can be used for smaller JQL query expressions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchForIssuesUsingJqlPostTest() throws Exception {
        SearchRequestBean body = null;
        SearchResults response = api.searchForIssuesUsingJqlPost(body);

        // TODO: test validations
    }
}