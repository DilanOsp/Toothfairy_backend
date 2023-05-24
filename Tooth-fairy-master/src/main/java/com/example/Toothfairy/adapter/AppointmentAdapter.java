package com.example.Toothfairy.adapter;

import com.example.Toothfairy.entity.Appointment;
import com.example.Toothfairy.repository.AppointmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class AppointmentAdapter {

    private final AppointmentRepository appointmentRepository;

    public void saveAppointment(Appointment appointment){

        appointmentRepository.save(appointment);

    }
    public Appointment getAppointment(String idAppointment){
        Optional<Appointment> appointment = appointmentRepository.findById(idAppointment);

        return appointment.get();

    }
    public void approvedAppointment(String idAppointment){
        Optional<Appointment> appointmentOptional = appointmentRepository.findById(idAppointment);
        Appointment appointment = appointmentOptional.get();
        appointment.setApproved(true);
        appointmentRepository.save(appointment);



    }



    public List<Appointment> getAppointments(){

        return appointmentRepository.findAll();





    }







}
