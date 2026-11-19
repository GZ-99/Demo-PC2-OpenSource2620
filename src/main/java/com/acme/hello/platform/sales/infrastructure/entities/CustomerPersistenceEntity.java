package com.acme.hello.platform.sales.infrastructure.entities;

import com.acme.hello.platform.sales.domain.model.valueobjects.Address;
import com.acme.hello.platform.sales.domain.model.valueobjects.Dni;
import com.acme.hello.platform.sales.domain.model.valueobjects.EMail;
import com.acme.hello.platform.sales.infrastructure.converters.DniPersistenceConverter;
import com.acme.hello.platform.sales.infrastructure.converters.EMailPersistenceConverter;
import com.acme.hello.platform.shared.infrastructure.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Convert(converter = DniPersistenceConverter.class)
    @Column(name = "dni", nullable = false)
    private Dni dni;

    @Embedded
    @Column(name = "address", nullable = false)
    private Address address;

    @Convert(converter = EMailPersistenceConverter.class)
    @Column(name = "email", nullable = false)
    private EMail email;
}
