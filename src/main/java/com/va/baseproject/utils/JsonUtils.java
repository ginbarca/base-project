package com.va.baseproject.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author anhnv
 * @version 1.0
 */
public class JsonUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

  private JsonUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Convert object to json
   *
   * @param object Object
   * @return json
   */
  public static String toJson(Object object) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    String jsonString = "";
    try {
      jsonString = mapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      LOGGER.error("Can't build json from object");
    }
    return jsonString;
  }

  /**
   * Gets the json by binding to the specified object.
   *
   * @param valueType Type to bind json (any class)
   * @param json String json
   * @param <T> Type to bind json
   * @return Object
   */
  public static <T> T fromJson(String json, Class<T> valueType) {
    if (json == null) {
      return null;
    }

    T object = null;
    try {
      object = new ObjectMapper().readValue(json, valueType);
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
    }

    return object;
  }

  public static String toJsonDateAsTimestamps(final Object object) {
    final ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    String jsonString = "";
    try {
      jsonString = mapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      jsonString = "Can't build json from object";
    }
    return jsonString;
  }

  public static Class<?> typeToClass(final Type type) {
    if (type instanceof Class) {
      return (Class<?>) type;
    }
    if (type instanceof ParameterizedType) {
      final ParameterizedType parameterizedType = (ParameterizedType) type;
      return (Class<?>) parameterizedType.getRawType();
    }
    return null;
  }
}
