package com.practicaldime.common.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class SimpleJson {

    public static ObjectMapper provideObjectMapper() {
        return new ObjectMapper();
    }

    public static <T> String toJson(T value) {
        try {
            ObjectMapper mapper = provideObjectMapper();
            try {
                return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
            } catch (NoSuchMethodError e) {
                return mapper.writeValueAsString(value);
            }
        } catch (Exception cause) {
            throw new AppException(1, cause.getMessage());
        }
    }

    public static <T> T fromJson(String json, Class<T> type) {
        try {
            ObjectMapper mapper = provideObjectMapper();
            return mapper.readValue(json, type);
        } catch (Exception cause) {
            throw new AppException(1, cause.getMessage());
        }
    }

    public static <T> T fromJson(String json, TypeReference<T> type) {
        try {
            ObjectMapper mapper = provideObjectMapper();
            return mapper.readValue(json, type);
        } catch (Exception cause) {
            throw new AppException(1, cause.getMessage());
        }
    }

    public static <T> T convertMap(Map<String, Object> map, Class<T> type) {
        try {
            ObjectMapper mapper = provideObjectMapper();
            return mapper.convertValue(map, type);
        } catch (Exception cause) {
            throw new AppException(1, cause.getMessage());
        }
    }

    public static <T> T convertMap(Map<String, Object> map, TypeReference<T> type) {
        try {
            ObjectMapper mapper = provideObjectMapper();
            return mapper.convertValue(map, type);
        } catch (Exception cause) {
            throw new AppException(1, cause.getMessage());
        }
    }

    public static void main(String... args) {
        System.err.println("for testing purposes");
    }
}
