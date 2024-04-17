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

import se.phaseshift.jira.rest.client.model.PageBeanIssueSecurityLevelMember;
import se.phaseshift.jira.rest.client.model.SecurityLevel;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueSecurityLevelApi
 */
@Ignore
public class IssueSecurityLevelApiTest {

    private final IssueSecurityLevelApi api = new IssueSecurityLevelApi();

    /**
     * Get issue security level
     *
     * Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIssueSecurityLevelTest() throws Exception {
        String id = null;
        SecurityLevel response = api.getIssueSecurityLevel(id);

        // TODO: test validations
    }
    /**
     * Get issue security level members by issue security scheme
     *
     * Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIssueSecurityLevelMembersTest() throws Exception {
        Long issueSecuritySchemeId = null;
        Long startAt = null;
        Integer maxResults = null;
        List<String> issueSecurityLevelId = null;
        String expand = null;
        PageBeanIssueSecurityLevelMember response = api.getIssueSecurityLevelMembers(issueSecuritySchemeId, startAt, maxResults, issueSecurityLevelId, expand);

        // TODO: test validations
    }
}
