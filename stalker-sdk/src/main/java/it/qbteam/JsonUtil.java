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

package it.qbteam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import it.qbteam.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Access".equalsIgnoreCase(className)) {
      return new TypeToken<List<Access>>(){}.getType();
    }
    
    if ("Administrator".equalsIgnoreCase(className)) {
      return new TypeToken<List<Administrator>>(){}.getType();
    }
    
    if ("AuthResponseAdmin".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthResponseAdmin>>(){}.getType();
    }
    
    if ("AuthResponseUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthResponseUser>>(){}.getType();
    }
    
    if ("AuthenticationDataAdmin".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticationDataAdmin>>(){}.getType();
    }
    
    if ("AuthenticationDataUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticationDataUser>>(){}.getType();
    }
    
    if ("Favorite".equalsIgnoreCase(className)) {
      return new TypeToken<List<Favorite>>(){}.getType();
    }
    
    if ("Movement".equalsIgnoreCase(className)) {
      return new TypeToken<List<Movement>>(){}.getType();
    }
    
    if ("Organization".equalsIgnoreCase(className)) {
      return new TypeToken<List<Organization>>(){}.getType();
    }
    
    if ("OrganizationAnonymousAccess".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganizationAnonymousAccess>>(){}.getType();
    }
    
    if ("OrganizationAnonymousMovement".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganizationAnonymousMovement>>(){}.getType();
    }
    
    if ("OrganizationAuthenticatedAccess".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganizationAuthenticatedAccess>>(){}.getType();
    }
    
    if ("OrganizationAuthenticatedMovement".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganizationAuthenticatedMovement>>(){}.getType();
    }
    
    if ("Permission".equalsIgnoreCase(className)) {
      return new TypeToken<List<Permission>>(){}.getType();
    }
    
    if ("Place".equalsIgnoreCase(className)) {
      return new TypeToken<List<Place>>(){}.getType();
    }
    
    if ("PlaceAnonymousAccess".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlaceAnonymousAccess>>(){}.getType();
    }
    
    if ("PlaceAnonymousMovement".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlaceAnonymousMovement>>(){}.getType();
    }
    
    if ("PlaceAuthenticatedAccess".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlaceAuthenticatedAccess>>(){}.getType();
    }
    
    if ("PlaceAuthenticatedMovement".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlaceAuthenticatedMovement>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Access".equalsIgnoreCase(className)) {
      return new TypeToken<Access>(){}.getType();
    }
    
    if ("Administrator".equalsIgnoreCase(className)) {
      return new TypeToken<Administrator>(){}.getType();
    }
    
    if ("AuthResponseAdmin".equalsIgnoreCase(className)) {
      return new TypeToken<AuthResponseAdmin>(){}.getType();
    }
    
    if ("AuthResponseUser".equalsIgnoreCase(className)) {
      return new TypeToken<AuthResponseUser>(){}.getType();
    }
    
    if ("AuthenticationDataAdmin".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticationDataAdmin>(){}.getType();
    }
    
    if ("AuthenticationDataUser".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticationDataUser>(){}.getType();
    }
    
    if ("Favorite".equalsIgnoreCase(className)) {
      return new TypeToken<Favorite>(){}.getType();
    }
    
    if ("Movement".equalsIgnoreCase(className)) {
      return new TypeToken<Movement>(){}.getType();
    }
    
    if ("Organization".equalsIgnoreCase(className)) {
      return new TypeToken<Organization>(){}.getType();
    }
    
    if ("OrganizationAnonymousAccess".equalsIgnoreCase(className)) {
      return new TypeToken<OrganizationAnonymousAccess>(){}.getType();
    }
    
    if ("OrganizationAnonymousMovement".equalsIgnoreCase(className)) {
      return new TypeToken<OrganizationAnonymousMovement>(){}.getType();
    }
    
    if ("OrganizationAuthenticatedAccess".equalsIgnoreCase(className)) {
      return new TypeToken<OrganizationAuthenticatedAccess>(){}.getType();
    }
    
    if ("OrganizationAuthenticatedMovement".equalsIgnoreCase(className)) {
      return new TypeToken<OrganizationAuthenticatedMovement>(){}.getType();
    }
    
    if ("Permission".equalsIgnoreCase(className)) {
      return new TypeToken<Permission>(){}.getType();
    }
    
    if ("Place".equalsIgnoreCase(className)) {
      return new TypeToken<Place>(){}.getType();
    }
    
    if ("PlaceAnonymousAccess".equalsIgnoreCase(className)) {
      return new TypeToken<PlaceAnonymousAccess>(){}.getType();
    }
    
    if ("PlaceAnonymousMovement".equalsIgnoreCase(className)) {
      return new TypeToken<PlaceAnonymousMovement>(){}.getType();
    }
    
    if ("PlaceAuthenticatedAccess".equalsIgnoreCase(className)) {
      return new TypeToken<PlaceAuthenticatedAccess>(){}.getType();
    }
    
    if ("PlaceAuthenticatedMovement".equalsIgnoreCase(className)) {
      return new TypeToken<PlaceAuthenticatedMovement>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
