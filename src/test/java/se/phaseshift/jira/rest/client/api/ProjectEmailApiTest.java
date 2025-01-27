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

import se.phaseshift.jira.rest.client.model.ProjectEmailAddress;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectEmailApi
 */
@Ignore
public class ProjectEmailApiTest {

    private final ProjectEmailApi api = new ProjectEmailApi();

    /**
     * Get project&#x27;s sender email
     *
     * Returns the [project&#x27;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectEmailTest() throws Exception {
        Long projectId = null;
        ProjectEmailAddress response = api.getProjectEmail(projectId);

        // TODO: test validations
    }
    /**
     * Set project&#x27;s sender email
     *
     * Sets the [project&#x27;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProjectEmailTest() throws Exception {
        ProjectEmailAddress body = null;
        Long projectId = null;
        Object response = api.updateProjectEmail(body, projectId);

        // TODO: test validations
    }
}
