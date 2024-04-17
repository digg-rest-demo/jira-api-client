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

import se.phaseshift.jira.rest.client.model.TimeTrackingConfiguration;
import se.phaseshift.jira.rest.client.model.TimeTrackingProvider;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TimeTrackingApi
 */
@Ignore
public class TimeTrackingApiTest {

    private final TimeTrackingApi api = new TimeTrackingApi();

    /**
     * Get all time tracking providers
     *
     * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAvailableTimeTrackingImplementationsTest() throws Exception {
        List<TimeTrackingProvider> response = api.getAvailableTimeTrackingImplementations();

        // TODO: test validations
    }
    /**
     * Get selected time tracking provider
     *
     * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSelectedTimeTrackingImplementationTest() throws Exception {
        TimeTrackingProvider response = api.getSelectedTimeTrackingImplementation();

        // TODO: test validations
    }
    /**
     * Get time tracking settings
     *
     * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSharedTimeTrackingConfigurationTest() throws Exception {
        TimeTrackingConfiguration response = api.getSharedTimeTrackingConfiguration();

        // TODO: test validations
    }
    /**
     * Select time tracking provider
     *
     * Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void selectTimeTrackingImplementationTest() throws Exception {
        TimeTrackingProvider body = null;
        Object response = api.selectTimeTrackingImplementation(body);

        // TODO: test validations
    }
    /**
     * Set time tracking settings
     *
     * Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setSharedTimeTrackingConfigurationTest() throws Exception {
        TimeTrackingConfiguration body = null;
        TimeTrackingConfiguration response = api.setSharedTimeTrackingConfiguration(body);

        // TODO: test validations
    }
}
