package com.acme.hello.platform.sales.infrastructure.repositories;

import com.acme.hello.platform.sales.infrastructure.entities.CustomerPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICustomerJpaRepository extends JpaRepository<
        CustomerPersistenceEntity, Long> {
    Optional<CustomerPersistenceEntity> findByDni(String dni);
}
