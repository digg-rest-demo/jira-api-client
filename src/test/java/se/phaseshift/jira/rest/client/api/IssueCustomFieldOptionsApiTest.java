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

import se.phaseshift.jira.rest.client.model.BulkCustomFieldOptionCreateRequest;
import se.phaseshift.jira.rest.client.model.BulkCustomFieldOptionUpdateRequest;
import se.phaseshift.jira.rest.client.model.CustomFieldCreatedContextOptionsList;
import se.phaseshift.jira.rest.client.model.CustomFieldOption;
import se.phaseshift.jira.rest.client.model.CustomFieldUpdatedContextOptionsList;
import se.phaseshift.jira.rest.client.model.OrderOfCustomFieldOptions;
import se.phaseshift.jira.rest.client.model.PageBeanCustomFieldContextOption;
import se.phaseshift.jira.rest.client.model.TaskProgressBeanRemoveOptionFromIssuesResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueCustomFieldOptionsApi
 */
@Ignore
public class IssueCustomFieldOptionsApiTest {

    private final IssueCustomFieldOptionsApi api = new IssueCustomFieldOptionsApi();

    /**
     * Create custom field options (context)
     *
     * Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCustomFieldOptionTest() throws Exception {
        BulkCustomFieldOptionCreateRequest body = null;
        String fieldId = null;
        Long contextId = null;
        CustomFieldCreatedContextOptionsList response = api.createCustomFieldOption(body, fieldId, contextId);

        // TODO: test validations
    }
    /**
     * Delete custom field options (context)
     *
     * Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCustomFieldOptionTest() throws Exception {
        String fieldId = null;
        Long contextId = null;
        Long optionId = null;
        api.deleteCustomFieldOption(fieldId, contextId, optionId);

        // TODO: test validations
    }
    /**
     * Get custom field option
     *
     * Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomFieldOptionTest() throws Exception {
        String id = null;
        CustomFieldOption response = api.getCustomFieldOption(id);

        // TODO: test validations
    }
    /**
     * Get custom field options (context)
     *
     * Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOptionsForContextTest() throws Exception {
        String fieldId = null;
        Long contextId = null;
        Long optionId = null;
        Boolean onlyOptions = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanCustomFieldContextOption response = api.getOptionsForContext(fieldId, contextId, optionId, onlyOptions, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Reorder custom field options (context)
     *
     * Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void reorderCustomFieldOptionsTest() throws Exception {
        OrderOfCustomFieldOptions body = null;
        String fieldId = null;
        Long contextId = null;
        Object response = api.reorderCustomFieldOptions(body, fieldId, contextId);

        // TODO: test validations
    }
    /**
     * Replace custom field options
     *
     * Replaces the options of a custom field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect or Forge apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void replaceCustomFieldOptionTest() throws Exception {
        String fieldId = null;
        Long optionId = null;
        Long contextId = null;
        Long replaceWith = null;
        String jql = null;
        api.replaceCustomFieldOption(fieldId, optionId, contextId, replaceWith, jql);

        // TODO: test validations
    }
    /**
     * Update custom field options (context)
     *
     * Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#x27;t updated and aren&#x27;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldOptionTest() throws Exception {
        BulkCustomFieldOptionUpdateRequest body = null;
        String fieldId = null;
        Long contextId = null;
        CustomFieldUpdatedContextOptionsList response = api.updateCustomFieldOption(body, fieldId, contextId);

        // TODO: test validations
    }
}
