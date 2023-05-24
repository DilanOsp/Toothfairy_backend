package com.example.Toothfairy.repository;

import com.example.Toothfairy.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {

}
