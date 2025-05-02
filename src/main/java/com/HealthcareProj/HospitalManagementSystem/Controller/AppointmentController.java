package com.HealthcareProj.HospitalManagementSystem.Controller;

import com.HealthcareProj.HospitalManagementSystem.Service.AppointmentService;
import com.HealthcareProj.HospitalManagementSystem.model.Appointment;
import com.HealthcareProj.HospitalManagementSystem.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAppointment(){
        System.out.println("Appointment Details Returned");
        return appointmentService.getAppointment();
    }

    @PostMapping
    public Appointment createAppointment(Appointment appointment){
        System.out.println("Appointment details created");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        System.out.println("Appointment details returned");
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        appointmentService.deleteAppointment();

    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id,@RequestBody Doctor doctor){
        appointmentService.updateAppointment();

    }
}
