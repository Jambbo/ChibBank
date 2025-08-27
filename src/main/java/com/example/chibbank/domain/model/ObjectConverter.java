package com.example.chibbank.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object attribute) {
        return objectMapper.writeValueAsString(attribute);
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        return objectMapper.convertValue(dbData, Object.class);
    }
}
