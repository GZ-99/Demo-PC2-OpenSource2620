package com.acme.hello.platform.sales.domain.model.valueobjects;

import com.acme.hello.platform.sales.domain.exceptions.EMailInvalidException;

public record Email(String email) {
    public Email {
        if(email==null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }

        if(email.matches("ˆ[uU][0-9]{8}@(upc.edu.pe)$")) {
            throw new EMailInvalidException("Email must be a valid email address");
        }
    }
}
