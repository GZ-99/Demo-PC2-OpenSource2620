package com.acme.hello.platform.sales.infrastructure.converters;

import com.acme.hello.platform.sales.domain.model.valueobjects.EMail;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class EMailPersistenceConverter implements AttributeConverter<EMail, String> {
    @Override
    public String convertToDatabaseColumn(EMail attribute) {
        return attribute == null ? null : attribute.email();
    }

    @Override
    public EMail convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new EMail(dbData);
    }
}
