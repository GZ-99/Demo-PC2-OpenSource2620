package com.acme.hello.platform.sales.infrastructure.converters;

import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import com.acme.hello.platform.sales.domain.model.valueobjects.Email;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class EMailPersistenceConverter implements AttributeConverter<Email, String> {
    @Override
    public String convertToDatabaseColumn(Email attribute) {
        return attribute == null ? null : attribute.email();
    }

    @Override
    public Email convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Email(dbData);
    }
}
