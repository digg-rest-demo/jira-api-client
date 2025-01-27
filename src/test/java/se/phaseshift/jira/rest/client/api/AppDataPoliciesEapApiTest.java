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
import se.phaseshift.jira.rest.client.model.ProjectDataPolicies;
import se.phaseshift.jira.rest.client.model.WorkspaceDataPolicy;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AppDataPoliciesEapApi
 */
@Ignore
public class AppDataPoliciesEapApiTest {

    private final AppDataPoliciesEapApi api = new AppDataPoliciesEapApi();

    /**
     * Get data policy for projects (EAP)
     *
     * Returns data policies for the projects specified in the request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPoliciesTest() throws Exception {
        String ids = null;
        ProjectDataPolicies response = api.getPolicies(ids);

        // TODO: test validations
    }
    /**
     * Get data policy for the workspace (EAP)
     *
     * Returns data policy for the workspace.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPolicyTest() throws Exception {
        WorkspaceDataPolicy response = api.getPolicy();

        // TODO: test validations
    }
}
