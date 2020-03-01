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

package it.qbteam.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Access to an organization made with the authenticated trackingMode.
 **/
@ApiModel(description = "Access to an organization made with the authenticated trackingMode.")
public class OrganizationAuthenticatedAccess extends Access {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("accessDiscriminator")
  private String accessDiscriminator = null;
  @SerializedName("entranceTimestamp")
  private Date entranceTimestamp = null;
  @SerializedName("exitTimestamp")
  private Date exitTimestamp = null;
  @SerializedName("organizationId")
  private Long organizationId = null;
  @SerializedName("ldapId")
  private Long ldapId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessDiscriminator() {
    return accessDiscriminator;
  }
  public void setAccessDiscriminator(String accessDiscriminator) {
    this.accessDiscriminator = accessDiscriminator;
  }

  /**
   * Date and time of the moment in which the user entered the place.
   **/
  @ApiModelProperty(required = true, value = "Date and time of the moment in which the user entered the place.")
  public Date getEntranceTimestamp() {
    return entranceTimestamp;
  }
  public void setEntranceTimestamp(Date entranceTimestamp) {
    this.entranceTimestamp = entranceTimestamp;
  }

  /**
   * Date and time of the moment in which the user left the place.
   **/
  @ApiModelProperty(required = true, value = "Date and time of the moment in which the user left the place.")
  public Date getExitTimestamp() {
    return exitTimestamp;
  }
  public void setExitTimestamp(Date exitTimestamp) {
    this.exitTimestamp = exitTimestamp;
  }

  /**
   * Unique identifier of the organization in which the user had access.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the organization in which the user had access.")
  public Long getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Organization LDAP server's user unique identifier.
   **/
  @ApiModelProperty(required = true, value = "Organization LDAP server's user unique identifier.")
  public Long getLdapId() {
    return ldapId;
  }
  public void setLdapId(Long ldapId) {
    this.ldapId = ldapId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAuthenticatedAccess organizationAuthenticatedAccess = (OrganizationAuthenticatedAccess) o;
    return (this.id == null ? organizationAuthenticatedAccess.id == null : this.id.equals(organizationAuthenticatedAccess.id)) &&
        (this.accessDiscriminator == null ? organizationAuthenticatedAccess.accessDiscriminator == null : this.accessDiscriminator.equals(organizationAuthenticatedAccess.accessDiscriminator)) &&
        (this.entranceTimestamp == null ? organizationAuthenticatedAccess.entranceTimestamp == null : this.entranceTimestamp.equals(organizationAuthenticatedAccess.entranceTimestamp)) &&
        (this.exitTimestamp == null ? organizationAuthenticatedAccess.exitTimestamp == null : this.exitTimestamp.equals(organizationAuthenticatedAccess.exitTimestamp)) &&
        (this.organizationId == null ? organizationAuthenticatedAccess.organizationId == null : this.organizationId.equals(organizationAuthenticatedAccess.organizationId)) &&
        (this.ldapId == null ? organizationAuthenticatedAccess.ldapId == null : this.ldapId.equals(organizationAuthenticatedAccess.ldapId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.accessDiscriminator == null ? 0: this.accessDiscriminator.hashCode());
    result = 31 * result + (this.entranceTimestamp == null ? 0: this.entranceTimestamp.hashCode());
    result = 31 * result + (this.exitTimestamp == null ? 0: this.exitTimestamp.hashCode());
    result = 31 * result + (this.organizationId == null ? 0: this.organizationId.hashCode());
    result = 31 * result + (this.ldapId == null ? 0: this.ldapId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAuthenticatedAccess {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  accessDiscriminator: ").append(accessDiscriminator).append("\n");
    sb.append("  entranceTimestamp: ").append(entranceTimestamp).append("\n");
    sb.append("  exitTimestamp: ").append(exitTimestamp).append("\n");
    sb.append("  organizationId: ").append(organizationId).append("\n");
    sb.append("  ldapId: ").append(ldapId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}