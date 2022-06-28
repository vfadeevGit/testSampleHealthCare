package com.company.testsamplehealthcare.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTACT_DATA", indexes = {
        @Index(name = "IDX_CONTACTDATA_TYPE_ID", columnList = "TYPE_ID"),
        @Index(name = "IDX_CONTACTDATA_CITIZEN_ID", columnList = "CITIZEN_ID")
})
@Entity
public class ContactData {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ContactType type;

    @NotNull
    @Column(name = "VALUE_", nullable = false, length = 500)
    private String value;

    @JoinColumn(name = "CITIZEN_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Citizen citizen;

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}