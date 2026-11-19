package com.acme.hello.platform.sales.application.commandservices;

import com.acme.hello.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.hello.platform.sales.domain.model.aggregates.Customer;

public interface CreateCustomerCommandService {
    Customer handle(CreateCustomerCommand command);
}
