package com.HealthcareProj.HospitalManagementSystem.Controller;
import com.HealthcareProj.HospitalManagementSystem.Service.DoctorService;
import com.HealthcareProj.HospitalManagementSystem.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    private DoctorService doctorService;


    @GetMapping
    public List<Doctor> cretcreateDoctor(){
        return doctorService.getDoctor();

    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return doctorService.getDoctorById(id);

    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("doctor list returned");
        return doctorService.createDoctor(doctor);
    }

    @PutMapping
    public void updateDoctor(@PathVariable Long id,@RequestBody Doctor doctor){

        doctorService.updateDoctor();
    }

    public void deleteDoctor(@PathVariable Long id){
        doctorService.deleteDoctor();
        System.out.println("Doctor details deleted");
    }

}
