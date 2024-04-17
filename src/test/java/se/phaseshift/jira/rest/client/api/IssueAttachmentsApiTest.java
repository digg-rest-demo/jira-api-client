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

import se.phaseshift.jira.rest.client.model.Attachment;
import se.phaseshift.jira.rest.client.model.AttachmentArchiveImpl;
import se.phaseshift.jira.rest.client.model.AttachmentArchiveMetadataReadable;
import se.phaseshift.jira.rest.client.model.AttachmentMetadata;
import se.phaseshift.jira.rest.client.model.AttachmentSettings;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueAttachmentsApi
 */
@Ignore
public class IssueAttachmentsApiTest {

    private final IssueAttachmentsApi api = new IssueAttachmentsApi();

    /**
     * Add attachment
     *
     * Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).  Note that:   *  The request must have a &#x60;X-Atlassian-Token: no-check&#x60; header, if not it is blocked. See [Special headers](#special-request-headers) for more information.  *  The name of the multipart/form-data parameter that contains the attachments must be &#x60;file&#x60;.  The following examples upload a file called *myfile.txt* to the issue *TEST-123*:  #### curl ####      curl --location --request POST &#x27;https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#x27;      -u &#x27;email@example.com:&lt;api_token&gt;&#x27;      -H &#x27;X-Atlassian-Token: no-check&#x27;      --form &#x27;file&#x3D;@\&quot;myfile.txt\&quot;&#x27;  #### Node.js ####      // This code sample uses the &#x27;node-fetch&#x27; and &#x27;form-data&#x27; libraries:      // https://www.npmjs.com/package/node-fetch      // https://www.npmjs.com/package/form-data      const fetch &#x3D; require(&#x27;node-fetch&#x27;);      const FormData &#x3D; require(&#x27;form-data&#x27;);      const fs &#x3D; require(&#x27;fs&#x27;);           const filePath &#x3D; &#x27;myfile.txt&#x27;;      const form &#x3D; new FormData();      const stats &#x3D; fs.statSync(filePath);      const fileSizeInBytes &#x3D; stats.size;      const fileStream &#x3D; fs.createReadStream(filePath);           form.append(&#x27;file&#x27;, fileStream, {knownLength: fileSizeInBytes});           fetch(&#x27;https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#x27;, {          method: &#x27;POST&#x27;,          body: form,          headers: {              &#x27;Authorization&#x27;: &#x60;Basic ${Buffer.from(                  &#x27;email@example.com:&#x27;              ).toString(&#x27;base64&#x27;)}&#x60;,              &#x27;Accept&#x27;: &#x27;application/json&#x27;,              &#x27;X-Atlassian-Token&#x27;: &#x27;no-check&#x27;          }      })          .then(response &#x3D;&gt; {              console.log(                  &#x60;Response: ${response.status} ${response.statusText}&#x60;              );              return response.text();          })          .then(text &#x3D;&gt; console.log(text))          .catch(err &#x3D;&gt; console.error(err));  #### Java ####      // This code sample uses the  &#x27;Unirest&#x27; library:      // http://unirest.io/java.html      HttpResponse response &#x3D; Unirest.post(\&quot;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments\&quot;)              .basicAuth(\&quot;email@example.com\&quot;, \&quot;\&quot;)              .header(\&quot;Accept\&quot;, \&quot;application/json\&quot;)              .header(\&quot;X-Atlassian-Token\&quot;, \&quot;no-check\&quot;)              .field(\&quot;file\&quot;, new File(\&quot;myfile.txt\&quot;))              .asJson();                   System.out.println(response.getBody());  #### Python ####      # This code sample uses the &#x27;requests&#x27; library:      # http://docs.python-requests.org      import requests      from requests.auth import HTTPBasicAuth      import json           url &#x3D; \&quot;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments\&quot;           auth &#x3D; HTTPBasicAuth(\&quot;email@example.com\&quot;, \&quot;\&quot;)           headers &#x3D; {         \&quot;Accept\&quot;: \&quot;application/json\&quot;,         \&quot;X-Atlassian-Token\&quot;: \&quot;no-check\&quot;      }           response &#x3D; requests.request(         \&quot;POST\&quot;,         url,         headers &#x3D; headers,         auth &#x3D; auth,         files &#x3D; {              \&quot;file\&quot;: (\&quot;myfile.txt\&quot;, open(\&quot;myfile.txt\&quot;,\&quot;rb\&quot;), \&quot;application-type\&quot;)         }      )           print(json.dumps(json.loads(response.text), sort_keys&#x3D;True, indent&#x3D;4, separators&#x3D;(\&quot;,\&quot;, \&quot;: \&quot;)))  #### PHP ####      // This code sample uses the &#x27;Unirest&#x27; library:      // http://unirest.io/php.html      Unirest\\Request::auth(&#x27;email@example.com&#x27;, &#x27;&#x27;);           $headers &#x3D; array(        &#x27;Accept&#x27; &#x3D;&gt; &#x27;application/json&#x27;,        &#x27;X-Atlassian-Token&#x27; &#x3D;&gt; &#x27;no-check&#x27;      );           $parameters &#x3D; array(        &#x27;file&#x27; &#x3D;&gt; File::add(&#x27;myfile.txt&#x27;)      );           $response &#x3D; Unirest\\Request::post(        &#x27;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments&#x27;,        $headers,        $parameters      );           var_dump($response)  #### Forge ####      // This sample uses Atlassian Forge and the &#x60;form-data&#x60; library.      // https://developer.atlassian.com/platform/forge/      // https://www.npmjs.com/package/form-data      import api from \&quot;@forge/api\&quot;;      import FormData from \&quot;form-data\&quot;;           const form &#x3D; new FormData();      form.append(&#x27;file&#x27;, fileStream, {knownLength: fileSizeInBytes});           const response &#x3D; await api.asApp().requestJira(&#x27;/rest/api/2/issue/{issueIdOrKey}/attachments&#x27;, {          method: &#x27;POST&#x27;,          body: form,          headers: {              &#x27;Accept&#x27;: &#x27;application/json&#x27;,              &#x27;X-Atlassian-Token&#x27;: &#x27;no-check&#x27;          }      });           console.log(&#x60;Response: ${response.status} ${response.statusText}&#x60;);      console.log(await response.json());  Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**    *  *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addAttachmentTest() throws Exception {
        String issueIdOrKey = null;
        List<Attachment> response = api.addAttachment(issueIdOrKey);

        // TODO: test validations
    }
    /**
     * Get all metadata for an expanded attachment
     *
     * Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.  Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment&#x27;s ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-raw-get), which only returns the metadata for the attachment&#x27;s contents.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void expandAttachmentForHumansTest() throws Exception {
        String id = null;
        AttachmentArchiveMetadataReadable response = api.expandAttachmentForHumans(id);

        // TODO: test validations
    }
    /**
     * Get contents metadata for an expanded attachment
     *
     * Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.  Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment&#x27;s ID and name.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void expandAttachmentForMachinesTest() throws Exception {
        String id = null;
        AttachmentArchiveImpl response = api.expandAttachmentForMachines(id);

        // TODO: test validations
    }
    /**
     * Get attachment metadata
     *
     * Returns the metadata for an attachment. Note that the attachment itself is not returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAttachmentTest() throws Exception {
        String id = null;
        AttachmentMetadata response = api.getAttachment(id);

        // TODO: test validations
    }
    /**
     * Get attachment content
     *
     * Returns the contents of an attachment. A &#x60;Range&#x60; header can be set to define a range of bytes within the attachment to download. See the [HTTP Range header standard](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range) for details.  To return a thumbnail of the attachment, use [Get attachment thumbnail](#api-rest-api-3-attachment-thumbnail-id-get).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAttachmentContentTest() throws Exception {
        String id = null;
        Boolean redirect = null;
        List<Object> response = api.getAttachmentContent(id, redirect);

        // TODO: test validations
    }
    /**
     * Get Jira attachment settings
     *
     * Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.  Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAttachmentMetaTest() throws Exception {
        AttachmentSettings response = api.getAttachmentMeta();

        // TODO: test validations
    }
    /**
     * Get attachment thumbnail
     *
     * Returns the thumbnail of an attachment.  To return the attachment contents, use [Get attachment content](#api-rest-api-3-attachment-content-id-get).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAttachmentThumbnailTest() throws Exception {
        String id = null;
        Boolean redirect = null;
        Boolean fallbackToDefault = null;
        Integer width = null;
        Integer height = null;
        List<Object> response = api.getAttachmentThumbnail(id, redirect, fallbackToDefault, width, height);

        // TODO: test validations
    }
    /**
     * Delete attachment
     *
     * Deletes an attachment from an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:   *  *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.  *  *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeAttachmentTest() throws Exception {
        String id = null;
        api.removeAttachment(id);

        // TODO: test validations
    }
}
