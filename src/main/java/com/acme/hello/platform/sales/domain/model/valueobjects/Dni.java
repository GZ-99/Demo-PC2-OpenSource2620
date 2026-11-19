package com.acme.hello.platform.sales.domain.model.valueobjects;

public record Dni(String dni) {
    public Dni {
        if (dni == null || !dni.matches("^[0-9]{8}[A-Z]$")) {
            throw new IllegalArgumentException(
                    "DNI must be 8 digits followed by an uppercase letter"
            );
        }
    }
}
