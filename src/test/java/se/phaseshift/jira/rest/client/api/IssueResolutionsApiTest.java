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
import se.phaseshift.jira.rest.client.model.PageBeanResolutionJsonBean;
import se.phaseshift.jira.rest.client.model.ReorderIssueResolutionsRequest;
import se.phaseshift.jira.rest.client.model.Resolution;
import se.phaseshift.jira.rest.client.model.ResolutionId;
import se.phaseshift.jira.rest.client.model.SetDefaultResolutionRequest;
import se.phaseshift.jira.rest.client.model.TaskProgressBeanObject;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueResolutionsApi
 */
@Ignore
public class IssueResolutionsApiTest {

    private final IssueResolutionsApi api = new IssueResolutionsApi();

    /**
     * Create resolution
     *
     * Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createResolutionTest() throws Exception {
        Map<String, Object> body = null;
        ResolutionId response = api.createResolution(body);

        // TODO: test validations
    }
    /**
     * Delete resolution
     *
     * Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteResolutionTest() throws Exception {
        String id = null;
        String replaceWith = null;
        api.deleteResolution(id, replaceWith);

        // TODO: test validations
    }
    /**
     * Get resolution
     *
     * Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getResolutionTest() throws Exception {
        String id = null;
        Resolution response = api.getResolution(id);

        // TODO: test validations
    }
    /**
     * Get resolutions
     *
     * Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getResolutionsTest() throws Exception {
        List<Resolution> response = api.getResolutions();

        // TODO: test validations
    }
    /**
     * Move resolutions
     *
     * Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void moveResolutionsTest() throws Exception {
        ReorderIssueResolutionsRequest body = null;
        Object response = api.moveResolutions(body);

        // TODO: test validations
    }
    /**
     * Search resolutions
     *
     * Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchResolutionsTest() throws Exception {
        String startAt = null;
        String maxResults = null;
        List<String> id = null;
        Boolean onlyDefault = null;
        PageBeanResolutionJsonBean response = api.searchResolutions(startAt, maxResults, id, onlyDefault);

        // TODO: test validations
    }
    /**
     * Set default resolution
     *
     * Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setDefaultResolutionTest() throws Exception {
        SetDefaultResolutionRequest body = null;
        Object response = api.setDefaultResolution(body);

        // TODO: test validations
    }
    /**
     * Update resolution
     *
     * Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateResolutionTest() throws Exception {
        Map<String, Object> body = null;
        String id = null;
        Object response = api.updateResolution(body, id);

        // TODO: test validations
    }
}
