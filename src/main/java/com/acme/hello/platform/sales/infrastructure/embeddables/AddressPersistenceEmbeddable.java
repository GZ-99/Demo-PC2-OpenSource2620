package com.acme.hello.platform.sales.infrastructure.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AddressPersistenceEmbeddable {
    @Column(name = "street", nullable = false,updatable = true)
    private String street;

    @Column(name = "city", nullable = false,updatable = true)
    private String city;

    @Column(name = "state", nullable = false,updatable = true)
    private String state;

    @Column(name = "zip_code", nullable = false,updatable = true)
    private String zipCode;
}
