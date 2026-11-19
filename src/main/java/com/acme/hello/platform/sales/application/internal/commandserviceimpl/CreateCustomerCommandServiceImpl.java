package com.acme.hello.platform.sales.application.internal.commandserviceimpl;

import com.acme.hello.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.hello.platform.sales.application.commandservices.CreateCustomerCommandService;
import com.acme.hello.platform.sales.domain.model.aggregates.Customer;
import com.acme.hello.platform.sales.domain.model.valueobjects.Address;
import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import com.acme.hello.platform.sales.domain.model.valueobjects.EMail;
import com.acme.hello.platform.sales.domain.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerCommandServiceImpl implements CreateCustomerCommandService {
    private final ICustomerRepository customerRepository;
    public CreateCustomerCommandServiceImpl(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer handle(CreateCustomerCommand command) {
        Customer customer = new Customer(
                command.name(),
                command.lastName(),
                new Dni(command.dni()),
                new Address(command.street(),
                        command.city(),
                        command.state(),
                        command.zipCode()),
                new EMail(command.email())
        );
        return customerRepository.save(customer);
    }
}
