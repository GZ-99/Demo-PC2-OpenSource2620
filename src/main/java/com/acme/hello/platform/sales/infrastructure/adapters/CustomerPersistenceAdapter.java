package com.acme.hello.platform.sales.infrastructure.adapters;

import com.acme.hello.platform.sales.domain.model.aggregates.Customer;
import com.acme.hello.platform.sales.domain.repositories.ICustomerRepository;
import com.acme.hello.platform.sales.infrastructure.assemblers.CustomerPersistenceAssembler;
import com.acme.hello.platform.sales.infrastructure.repositories.ICustomerJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerPersistenceAdapter implements ICustomerRepository {
    private final ICustomerJpaRepository customerJpaRepository;

    public CustomerPersistenceAdapter(ICustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }

    @Override
    public Customer save(Customer entity) {
        var customerEntity = CustomerPersistenceAssembler.toEntity(entity);
        var customerSaved = customerJpaRepository.save(customerEntity);
        return CustomerPersistenceAssembler.toDomain(customerSaved);

    }

    @Override
    public Customer update(Customer entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Customer findById(Long aLong) {
        return null;
    }

    @Override
    public Optional<Customer> findByDni(String dni) {
        return customerJpaRepository.findByDni(dni)
                .map(CustomerPersistenceAssembler::toDomain);
    }
}
