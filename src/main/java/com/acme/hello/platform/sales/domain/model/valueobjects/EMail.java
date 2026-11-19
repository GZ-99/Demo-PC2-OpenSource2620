package com.acme.hello.platform.sales.domain.model.valueobjects;

import com.acme.hello.platform.sales.domain.exceptions.EMailInvalidException;

public record EMail(String email) {
    public EMail {
        if(email==null || email.isBlank()) {
            throw new IllegalArgumentException("EMail cannot be null or blank");
        }

        if(email.matches("ˆ[uU][0-9]{8}@(upc.edu.pe)$")) {
            throw new EMailInvalidException("EMail must be a valid email address");
        }
    }
}
