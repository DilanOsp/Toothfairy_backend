package com.example.Toothfairy.service;

import com.example.Toothfairy.entity.Appointment;
import com.example.Toothfairy.repository.AppointmentRepository;

import java.util.List;

public interface AppointmentService {
    void saveAppointment(Appointment appointment);
    Appointment getAppointment(String idAppointment);
    void approvedAppointment(String idAppointment);
    void deleteAppointment(String idAppointment);
    List<Appointment> getAppointments();

}
