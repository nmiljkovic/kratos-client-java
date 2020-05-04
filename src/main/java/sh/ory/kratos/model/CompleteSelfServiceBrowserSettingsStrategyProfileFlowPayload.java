/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-04T14:27:47.887712Z[GMT]")
public class CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;


  public CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * RequestID is request ID.  in: query
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestID is request ID.  in: query")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits contains all of the identity&#39;s traits.  type: string format: binary
   * @return traits
  **/
  @ApiModelProperty(required = true, value = "Traits contains all of the identity's traits.  type: string format: binary")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload completeSelfServiceBrowserSettingsStrategyProfileFlowPayload = (CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload) o;
    return Objects.equals(this.requestId, completeSelfServiceBrowserSettingsStrategyProfileFlowPayload.requestId) &&
        Objects.equals(this.traits, completeSelfServiceBrowserSettingsStrategyProfileFlowPayload.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, traits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

