package com.acme.hello.platform.sales.interfaces.resources;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CustomerRequestResource(
        @NotNull(message = "Name is required")
        @NotBlank(message = "Name is required")
        String name,

        @NotNull(message = "Last name is required")
        @NotBlank(message = "Last name is required")
        String lastName,

        @NotNull
        @NotBlank(message = "DNI is required")
        @Pattern(regexp = "^[0-9]{8}[A-Z]$",
                message = "DNI must be 8 digits followed by an uppercase letter")
        String dni,

        @NotNull(message = "Street is required")
        @NotBlank(message = "Street is required")
        String street,

        @NotNull(message = "City is required")
        @NotBlank(message = "City is required")
        String city,

        @NotNull(message = "State is required")
        @NotBlank(message = "State is required")
        String state,

        @NotNull(message = "Zip Code is required")
        @NotBlank(message = "Zip Code is required")
        String zipCode,

        @NotNull(message = "Email is required")
        @NotBlank(message = "Email is required")
        @Pattern(regexp = "^[a-zA-Z0-9._%t-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
                message = "Email must be valid")
        String email
) {
}
