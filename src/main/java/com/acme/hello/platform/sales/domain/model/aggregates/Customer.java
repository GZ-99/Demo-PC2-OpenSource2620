package com.acme.hello.platform.sales.domain.model.aggregates;

import com.acme.hello.platform.sales.domain.model.valueobjects.Address;
import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import com.acme.hello.platform.sales.domain.model.valueobjects.Email;

import java.time.Instant;

public class Customer {
    private Long id;
    private String name;
    private String lastName;
    private Dni dni;
    private Address address;
    private Email email;
    private Instant createdAt;
    private Instant updatedAt;

    public Customer(String name, String lastName, Dni dni, Address address, Email email) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Dni getDni() {
        return dni;
    }

    public Address getAddress() {
        return address;
    }

    public Email getEmail() {
        return email;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
