package com.company.testsamplehealthcare.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "PLANNED_VISIT", indexes = {
        @Index(name = "IDX_PLANNEDVISIT_PATIENT_ID", columnList = "PATIENT_ID"),
        @Index(name = "IDX_PLANNEDVISIT_DOCTOR_ID", columnList = "DOCTOR_ID")
})
@Entity
public class PlannedVisit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_VISIT", nullable = false)
    @NotNull
    private LocalDate dateVisit;

    @JoinColumn(name = "PATIENT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Citizen patient;

    @JoinColumn(name = "DOCTOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User doctor;

    @Column(name = "REQUEST")
    @Lob
    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Citizen getPatient() {
        return patient;
    }

    public void setPatient(Citizen patient) {
        this.patient = patient;
    }

    public LocalDate getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(LocalDate dateVisit) {
        this.dateVisit = dateVisit;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}