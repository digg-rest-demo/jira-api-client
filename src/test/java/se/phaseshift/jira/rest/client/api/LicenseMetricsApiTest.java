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
import se.phaseshift.jira.rest.client.model.ErrorCollections;
import se.phaseshift.jira.rest.client.model.License;
import se.phaseshift.jira.rest.client.model.LicenseMetric;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LicenseMetricsApi
 */
@Ignore
public class LicenseMetricsApiTest {

    private final LicenseMetricsApi api = new LicenseMetricsApi();

    /**
     * Get approximate application license count
     *
     * Returns the total approximate number of user accounts for a single Jira license. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getApproximateApplicationLicenseCountTest() throws Exception {
        String applicationKey = null;
        LicenseMetric response = api.getApproximateApplicationLicenseCount(applicationKey);

        // TODO: test validations
    }
    /**
     * Get approximate license count
     *
     * Returns the approximate number of user accounts across all Jira licenses. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getApproximateLicenseCountTest() throws Exception {
        LicenseMetric response = api.getApproximateLicenseCount();

        // TODO: test validations
    }
    /**
     * Get license
     *
     * Returns licensing information about the Jira instance.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLicenseTest() throws Exception {
        License response = api.getLicense();

        // TODO: test validations
    }
}
