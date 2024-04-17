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

import se.phaseshift.jira.rest.client.model.IssueLinkType;
import se.phaseshift.jira.rest.client.model.IssueLinkTypes;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueLinkTypesApi
 */
@Ignore
public class IssueLinkTypesApiTest {

    private final IssueLinkTypesApi api = new IssueLinkTypesApi();

    /**
     * Create issue link type
     *
     * Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#x27;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createIssueLinkTypeTest() throws Exception {
        IssueLinkType body = null;
        IssueLinkType response = api.createIssueLinkType(body);

        // TODO: test validations
    }
    /**
     * Delete issue link type
     *
     * Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteIssueLinkTypeTest() throws Exception {
        String issueLinkTypeId = null;
        api.deleteIssueLinkType(issueLinkTypeId);

        // TODO: test validations
    }
    /**
     * Get issue link type
     *
     * Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIssueLinkTypeTest() throws Exception {
        String issueLinkTypeId = null;
        IssueLinkType response = api.getIssueLinkType(issueLinkTypeId);

        // TODO: test validations
    }
    /**
     * Get issue link types
     *
     * Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIssueLinkTypesTest() throws Exception {
        IssueLinkTypes response = api.getIssueLinkTypes();

        // TODO: test validations
    }
    /**
     * Update issue link type
     *
     * Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateIssueLinkTypeTest() throws Exception {
        IssueLinkType body = null;
        String issueLinkTypeId = null;
        IssueLinkType response = api.updateIssueLinkType(body, issueLinkTypeId);

        // TODO: test validations
    }
}
