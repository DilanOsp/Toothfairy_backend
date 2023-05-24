package com.example.Toothfairy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.util.UUID;

@Data
@Entity

public class Appointment {

    @Id
    private String idAppointment;
    private String name;
    private String lastName;
    private String sex;
    private String addres;
    private String mail;
    private String cell;
    private Integer age;
    private String scheduleAppointment;
    private boolean approved;





    @PrePersist
    private void generateId() {
        this.idAppointment = UUID.randomUUID().toString().substring(0, 9);
        this.approved = false;
    }








}
