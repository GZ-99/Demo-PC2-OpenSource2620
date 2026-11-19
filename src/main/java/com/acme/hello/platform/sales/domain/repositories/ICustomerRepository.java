package com.acme.hello.platform.sales.domain.repositories;

import com.acme.hello.platform.sales.domain.model.aggregates.Customer;

import java.util.Optional;

public interface ICustomerRepository extends ICrudService<Customer, Long> {
    Optional<Customer> findByDni(String dni);
}
