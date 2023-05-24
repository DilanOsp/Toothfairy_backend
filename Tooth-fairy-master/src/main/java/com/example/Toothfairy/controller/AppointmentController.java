package com.example.Toothfairy.controller;

import com.example.Toothfairy.adapter.AppointmentAdapter;
import com.example.Toothfairy.entity.Appointment;
import com.example.Toothfairy.repository.AppointmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AppointmentController {

    private final AppointmentAdapter appointmentAdapter;
    @PostMapping("/save_appointment")
    void saveAppointment(@RequestBody Appointment appointment){

        appointmentAdapter.saveAppointment(appointment);


    }
    @GetMapping("/get_appointment/{idAppointment}")
    Appointment getAppointment(@PathVariable String idAppointment){

        return appointmentAdapter.getAppointment(idAppointment);



    }
    @PutMapping("/approved_appointment/{idAppointment}")
    void approvedAppointment(@PathVariable String idAppointment){

        appointmentAdapter.approvedAppointment(idAppointment);



    }
    @GetMapping("/get_appointments")

    List<Appointment> getAppointments(){

        return appointmentAdapter.getAppointments();





    }


}
