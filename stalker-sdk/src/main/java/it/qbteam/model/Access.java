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
 * Generic access to an organization or a place of it.
 **/
@ApiModel(description = "Generic access to an organization or a place of it.")
public abstract class Access {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("accessDiscriminator")
  private String accessDiscriminator = null;
  @SerializedName("entranceTimestamp")
  private Date entranceTimestamp = null;
  @SerializedName("exitTimestamp")
  private Date exitTimestamp = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Access access = (Access) o;
    return (this.id == null ? access.id == null : this.id.equals(access.id)) &&
        (this.accessDiscriminator == null ? access.accessDiscriminator == null : this.accessDiscriminator.equals(access.accessDiscriminator)) &&
        (this.entranceTimestamp == null ? access.entranceTimestamp == null : this.entranceTimestamp.equals(access.entranceTimestamp)) &&
        (this.exitTimestamp == null ? access.exitTimestamp == null : this.exitTimestamp.equals(access.exitTimestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.accessDiscriminator == null ? 0: this.accessDiscriminator.hashCode());
    result = 31 * result + (this.entranceTimestamp == null ? 0: this.entranceTimestamp.hashCode());
    result = 31 * result + (this.exitTimestamp == null ? 0: this.exitTimestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Access {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  accessDiscriminator: ").append(accessDiscriminator).append("\n");
    sb.append("  entranceTimestamp: ").append(entranceTimestamp).append("\n");
    sb.append("  exitTimestamp: ").append(exitTimestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
