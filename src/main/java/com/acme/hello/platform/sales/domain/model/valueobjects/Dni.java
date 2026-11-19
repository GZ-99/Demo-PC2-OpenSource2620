package com.acme.hello.platform.sales.domain.model.valueobjects;

public record Dni(String dni) {
    public Dni {
        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("DNI cannot be null or blank");
        }
        if (!dni.matches("[0-9]{8}$")) {
            throw new IllegalArgumentException("DNI must be 8 digits");
        }
    }
}
