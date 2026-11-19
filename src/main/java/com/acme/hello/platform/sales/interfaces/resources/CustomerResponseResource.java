package com.acme.hello.platform.sales.interfaces.resources;

public record CustomerResponseResource(
        String name,
        String lastName,
        String dni,
        String street,
        String city,
        String state,
        String zipCode,
        String email
) {
}
