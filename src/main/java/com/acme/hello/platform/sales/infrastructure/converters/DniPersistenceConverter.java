package com.acme.hello.platform.sales.infrastructure.converters;

import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class DniPersistenceConverter implements AttributeConverter<Dni, String> {
    @Override
    public String convertToDatabaseColumn(Dni attribute) {
        return attribute == null ? null : attribute.dni();
    }

    @Override
    public Dni convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Dni(dbData);
    }
}

