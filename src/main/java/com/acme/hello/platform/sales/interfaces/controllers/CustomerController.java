package com.acme.hello.platform.sales.interfaces.controllers;

import com.acme.hello.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.hello.platform.sales.application.commandservices.CreateCustomerCommandService;
import com.acme.hello.platform.sales.domain.model.aggregates.Customer;
import com.acme.hello.platform.sales.interfaces.resources.CustomerRequestResource;
import com.acme.hello.platform.sales.interfaces.resources.CustomerResponseResource;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CreateCustomerCommandService createCustomerCommandService;
    public CustomerController(CreateCustomerCommandService createCustomerCommandService) {
        this.createCustomerCommandService = createCustomerCommandService;
    }

    @PostMapping
    public ResponseEntity<CustomerResponseResource> createCustomer
            (@Valid @RequestBody CustomerRequestResource resource) {
        var command = new CreateCustomerCommand(
                resource.name(),
                resource.lastName(),
                resource.dni(),
                resource.street(),
                resource.city(),
                resource.state(),
                resource.zipCode(),
                resource.email()
        );

        Customer customer = createCustomerCommandService.handle(command);

        var response = new CustomerResponseResource(
                customer.getName(),
                customer.getLastName(),
                customer.getDni().dni(),
                customer.getAddress().street(),
                customer.getAddress().city(),
                customer.getAddress().state(),
                customer.getAddress().zipCode(),
                customer.getEmail().email()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
