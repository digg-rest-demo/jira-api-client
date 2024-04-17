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

import se.phaseshift.jira.rest.client.model.UpdateDefaultProjectClassificationBean;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectClassificationLevelsApi
 */
@Ignore
public class ProjectClassificationLevelsApiTest {

    private final ProjectClassificationLevelsApi api = new ProjectClassificationLevelsApi();

    /**
     * Get the default data classification level of a project
     *
     * Returns the default data classification for a project.  **[Permissions](#permissions) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDefaultProjectClassificationTest() throws Exception {
        String projectIdOrKey = null;
        Object response = api.getDefaultProjectClassification(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Remove the default data classification level from a project
     *
     * Remove the default data classification level for a project.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDefaultProjectClassificationTest() throws Exception {
        String projectIdOrKey = null;
        Object response = api.removeDefaultProjectClassification(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Update the default data classification level of a project
     *
     * Updates the default data classification level for a project.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDefaultProjectClassificationTest() throws Exception {
        UpdateDefaultProjectClassificationBean body = null;
        String projectIdOrKey = null;
        Object response = api.updateDefaultProjectClassification(body, projectIdOrKey);

        // TODO: test validations
    }
}