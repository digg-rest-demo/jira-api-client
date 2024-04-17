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

import se.phaseshift.jira.rest.client.model.StatusDetails;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WorkflowStatusesApi
 */
@Ignore
public class WorkflowStatusesApiTest {

    private final WorkflowStatusesApi api = new WorkflowStatusesApi();

    /**
     * Get status
     *
     * Returns a status. The status must be associated with an active workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws Exception {
        String idOrName = null;
        StatusDetails response = api.getStatus(idOrName);

        // TODO: test validations
    }
    /**
     * Get all statuses
     *
     * Returns a list of all statuses associated with active workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStatusesTest() throws Exception {
        List<StatusDetails> response = api.getStatuses();

        // TODO: test validations
    }
}