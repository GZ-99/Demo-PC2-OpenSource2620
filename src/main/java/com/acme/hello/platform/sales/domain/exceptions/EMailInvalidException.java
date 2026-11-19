package com.acme.hello.platform.sales.domain.exceptions;

public class EMailInvalidException extends RuntimeException {
    public EMailInvalidException(String message) {
        super(message);
    }
}
