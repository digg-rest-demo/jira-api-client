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
import se.phaseshift.jira.rest.client.model.NotificationScheme;
import se.phaseshift.jira.rest.client.model.NotificationSchemeId;
import se.phaseshift.jira.rest.client.model.PageBeanNotificationScheme;
import se.phaseshift.jira.rest.client.model.PageBeanNotificationSchemeAndProjectMappingJsonBean;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueNotificationSchemesApi
 */
@Ignore
public class IssueNotificationSchemesApiTest {

    private final IssueNotificationSchemesApi api = new IssueNotificationSchemesApi();

    /**
     * Add notifications to notification scheme
     *
     * Adds notifications to a notification scheme. You can add up to 1000 notifications per request.  *Deprecated: The notification type &#x60;EmailAddress&#x60; is no longer supported in Cloud. Refer to the [changelog](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1031) for more details.*  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addNotificationsTest() throws Exception {
        Map<String, Object> body = null;
        String id = null;
        Object response = api.addNotifications(body, id);

        // TODO: test validations
    }
    /**
     * Create notification scheme
     *
     * Creates a notification scheme with notifications. You can create up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createNotificationSchemeTest() throws Exception {
        Map<String, Object> body = null;
        NotificationSchemeId response = api.createNotificationScheme(body);

        // TODO: test validations
    }
    /**
     * Delete notification scheme
     *
     * Deletes a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationSchemeTest() throws Exception {
        String notificationSchemeId = null;
        Object response = api.deleteNotificationScheme(notificationSchemeId);

        // TODO: test validations
    }
    /**
     * Get notification scheme
     *
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationSchemeTest() throws Exception {
        Long id = null;
        String expand = null;
        NotificationScheme response = api.getNotificationScheme(id, expand);

        // TODO: test validations
    }
    /**
     * Get projects using notification schemes paginated
     *
     * Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don&#x27;t provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don&#x27;t have a concept of a default notification scheme. The mappings are ordered by projectId.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationSchemeToProjectMappingsTest() throws Exception {
        String startAt = null;
        String maxResults = null;
        List<String> notificationSchemeId = null;
        List<String> projectId = null;
        PageBeanNotificationSchemeAndProjectMappingJsonBean response = api.getNotificationSchemeToProjectMappings(startAt, maxResults, notificationSchemeId, projectId);

        // TODO: test validations
    }
    /**
     * Get notification schemes paginated
     *
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationSchemesTest() throws Exception {
        String startAt = null;
        String maxResults = null;
        List<String> id = null;
        List<String> projectId = null;
        Boolean onlyDefault = null;
        String expand = null;
        PageBeanNotificationScheme response = api.getNotificationSchemes(startAt, maxResults, id, projectId, onlyDefault, expand);

        // TODO: test validations
    }
    /**
     * Remove notification from notification scheme
     *
     * Removes a notification from a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeNotificationFromNotificationSchemeTest() throws Exception {
        String notificationSchemeId = null;
        String notificationId = null;
        Object response = api.removeNotificationFromNotificationScheme(notificationSchemeId, notificationId);

        // TODO: test validations
    }
    /**
     * Update notification scheme
     *
     * Updates a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateNotificationSchemeTest() throws Exception {
        Map<String, Object> body = null;
        String id = null;
        Object response = api.updateNotificationScheme(body, id);

        // TODO: test validations
    }
}
