package com.acme.hello.platform.sales.infrastructure.assemblers;

import com.acme.hello.platform.sales.domain.model.aggregates.Customer;
import com.acme.hello.platform.sales.domain.model.valueobjects.Address;
import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import com.acme.hello.platform.sales.domain.model.valueobjects.EMail;
import com.acme.hello.platform.sales.infrastructure.entities.CustomerPersistenceEntity;

public class CustomerPersistenceAssembler {
    public static Customer toDomain(CustomerPersistenceEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Customer(
                entity.getName(),
                entity.getLastName(),
                new Dni(entity.getDni().dni()),
                new Address(entity.getAddress().street(),
                        entity.getAddress().city(),
                        entity.getAddress().state(),
                        entity.getAddress().zipCode()),
                new EMail(entity.getEmail().email())

        );
    }

    public static CustomerPersistenceEntity toEntity(Customer customer) {
        if (customer == null) {
            return null;
        }
        return CustomerPersistenceEntity.builder()
                .name(customer.getName())
                .lastName(customer.getLastName())
                .dni(new Dni(customer.getDni().dni()))
                .address(new Address(customer.getAddress().street(),
                        customer.getAddress().city(),
                        customer.getAddress().state(),
                        customer.getAddress().zipCode()))
                .email(new EMail(customer.getEmail().email()))
                .build();
    }
}
