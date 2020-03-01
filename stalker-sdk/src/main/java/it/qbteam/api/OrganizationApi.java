/**
 * Stalker API
 * API di Stalker di Imola Informatica sviluppato da qbteam
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: qbteamswe@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.qbteam.api;

import it.qbteam.ApiInvoker;
import it.qbteam.ApiException;
import it.qbteam.Pair;

import it.qbteam.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import it.qbteam.model.Organization;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrganizationApi {
  String basePath = "http://localhost:8080";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Gets the data of a single organization.
  * Gets the data of a single organization.
   * @param organizationId ID of an organization.
   * @return Organization
  */
  public Organization getOrganizationById (Long organizationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling getOrganizationById",
        new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationById"));
    }

    // create path and map variables
    String path = "/organization/{organizationId}".replaceAll("\\{" + "organizationId" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Organization) ApiInvoker.deserialize(localVarResponse, "", Organization.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Gets the data of a single organization.
   * Gets the data of a single organization.
   * @param organizationId ID of an organization.
  */
  public void getOrganizationById (Long organizationId, final Response.Listener<Organization> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling getOrganizationById",
        new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationById"));
    }

    // create path and map variables
    String path = "/organization/{organizationId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organizationId" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Organization) ApiInvoker.deserialize(localVarResponse,  "", Organization.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Returns the list of all organizations.
  * Returns the list of all organizations.
   * @return List<Organization>
  */
  public List<Organization> getOrganizationList () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/organization";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Organization>) ApiInvoker.deserialize(localVarResponse, "array", Organization.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Returns the list of all organizations.
   * Returns the list of all organizations.

  */
  public void getOrganizationList (final Response.Listener<List<Organization>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/organization".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Organization>) ApiInvoker.deserialize(localVarResponse,  "array", Organization.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Updates one or more properties of a single organization.
  * Updates one or more properties of a single organization.
   * @param organizationId ID of an organization.
   * @param organization 
   * @return Organization
  */
  public Organization updateOrganization (Long organizationId, Organization organization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = organization;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling updateOrganization",
        new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrganization"));
    }
    // verify the required parameter 'organization' is set
    if (organization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organization' when calling updateOrganization",
        new ApiException(400, "Missing the required parameter 'organization' when calling updateOrganization"));
    }

    // create path and map variables
    String path = "/organization/{organizationId}".replaceAll("\\{" + "organizationId" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Organization) ApiInvoker.deserialize(localVarResponse, "", Organization.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Updates one or more properties of a single organization.
   * Updates one or more properties of a single organization.
   * @param organizationId ID of an organization.   * @param organization 
  */
  public void updateOrganization (Long organizationId, Organization organization, final Response.Listener<Organization> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = organization;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling updateOrganization",
        new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrganization"));
    }
    // verify the required parameter 'organization' is set
    if (organization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organization' when calling updateOrganization",
        new ApiException(400, "Missing the required parameter 'organization' when calling updateOrganization"));
    }

    // create path and map variables
    String path = "/organization/{organizationId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organizationId" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Organization) ApiInvoker.deserialize(localVarResponse,  "", Organization.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}