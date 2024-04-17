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

import se.phaseshift.jira.rest.client.model.ErrorCollection;
import se.phaseshift.jira.rest.client.model.FoundUsers;
import se.phaseshift.jira.rest.client.model.PageBeanUser;
import se.phaseshift.jira.rest.client.model.PageBeanUserKey;
import se.phaseshift.jira.rest.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserSearchApi
 */
@Ignore
public class UserSearchApiTest {

    private final UserSearchApi api = new UserSearchApi();

    /**
     * Find users assignable to issues
     *
     * Returns a list of users that can be assigned to an issue. Use this operation to find the list of users who can be assigned to:   *  a new issue, by providing the &#x60;projectKeyOrId&#x60;.  *  an updated issue, by providing the &#x60;issueKey&#x60;.  *  to an issue during a transition (workflow action), by providing the &#x60;issueKey&#x60; and the transition id in &#x60;actionDescriptorId&#x60;. You can obtain the IDs of an issue&#x27;s valid transitions using the &#x60;transitions&#x60; option in the &#x60;expand&#x60; parameter of [ Get issue](#api-rest-api-3-issue-issueIdOrKey-get).  In all these cases, you can pass an account ID to determine if a user can be assigned to an issue. The user is returned in the response if they can be assigned to the issue or issue transition.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned the issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned the issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Assign issues* [project permission](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findAssignableUsersTest() throws Exception {
        String query = null;
        String sessionId = null;
        String username = null;
        String accountId = null;
        String project = null;
        String issueKey = null;
        Integer startAt = null;
        Integer maxResults = null;
        Integer actionDescriptorId = null;
        Boolean recommend = null;
        List<User> response = api.findAssignableUsers(query, sessionId, username, accountId, project, issueKey, startAt, maxResults, actionDescriptorId, recommend);

        // TODO: test validations
    }
    /**
     * Find users assignable to projects
     *
     * Returns a list of users who can be assigned issues in one or more projects. The list may be restricted to users whose attributes match a string.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned issues in the projects. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned issues in the projects, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findBulkAssignableUsersTest() throws Exception {
        String projectKeys = null;
        String query = null;
        String username = null;
        String accountId = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<User> response = api.findBulkAssignableUsers(projectKeys, query, username, accountId, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Find user keys by query
     *
     * Finds users with a structured query and returns a [paginated](#pagination) list of user keys.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUserKeysByQueryTest() throws Exception {
        String query = null;
        Long startAt = null;
        Integer maxResult = null;
        PageBeanUserKey response = api.findUserKeysByQuery(query, startAt, maxResult);

        // TODO: test validations
    }
    /**
     * Find users
     *
     * Returns a list of active users that match the search string and property.  This operation first applies a filter to match the search string and property, and then takes the filtered users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user. To get all the users who match the search string and property, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls or calls by users without the required permission return empty search results.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUsersTest() throws Exception {
        String query = null;
        String username = null;
        String accountId = null;
        Integer startAt = null;
        Integer maxResults = null;
        String property = null;
        List<User> response = api.findUsers(query, username, accountId, startAt, maxResults, property);

        // TODO: test validations
    }
    /**
     * Find users by query
     *
     * Finds users with a structured query and returns a [paginated](#pagination) list of user details.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUsersByQueryTest() throws Exception {
        String query = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanUser response = api.findUsersByQuery(query, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Find users for picker
     *
     * Returns a list of users whose attributes match the query term. The returned object includes the &#x60;html&#x60; field where the matched query term is highlighted with the HTML strong tag. A list of account IDs can be provided to exclude users from the results.  This operation takes the users in the range defined by &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the query term. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the query term, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return search results for an exact name match only.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUsersForPickerTest() throws Exception {
        String query = null;
        Integer maxResults = null;
        Boolean showAvatar = null;
        List<String> exclude = null;
        List<String> excludeAccountIds = null;
        String avatarSize = null;
        Boolean excludeConnectUsers = null;
        FoundUsers response = api.findUsersForPicker(query, maxResults, showAvatar, exclude, excludeAccountIds, avatarSize, excludeConnectUsers);

        // TODO: test validations
    }
    /**
     * Find users with permissions
     *
     * Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have a set of permissions for a project or issue.  If no search string is provided, a list of all users with the permissions is returned.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission for the project or issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission for the project or issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get users for any project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project, to get users for that project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUsersWithAllPermissionsTest() throws Exception {
        String permissions = null;
        String query = null;
        String username = null;
        String accountId = null;
        String issueKey = null;
        String projectKey = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<User> response = api.findUsersWithAllPermissions(permissions, query, username, accountId, issueKey, projectKey, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Find users with browse permission
     *
     * Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have permission to browse issues.  Use this resource to find users who can browse:   *  an issue, by providing the &#x60;issueKey&#x60;.  *  any issue in a project, by providing the &#x60;projectKey&#x60;.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission to browse issues. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission to browse issues, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  Privacy controls are applied to the response based on the users&#x27; preferences. This could mean, for example, that the user&#x27;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return empty search results.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUsersWithBrowsePermissionTest() throws Exception {
        String query = null;
        String username = null;
        String accountId = null;
        String issueKey = null;
        String projectKey = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<User> response = api.findUsersWithBrowsePermission(query, username, accountId, issueKey, projectKey, startAt, maxResults);

        // TODO: test validations
    }
}
