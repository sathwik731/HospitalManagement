package com.HealthcareProj.HospitalManagementSystem.Controller;

import com.HealthcareProj.HospitalManagementSystem.Service.PatientService;
import com.HealthcareProj.HospitalManagementSystem.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patients")
public class PatientController {

    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatients(@RequestBody Patient patient){
        System.out.println("creating patients");
        return patientService.createPatient(patient);

    }

    @GetMapping("/{id}")
    public Patient getPatientbyId(@PathVariable Long id){
        System.out.println("get by id");
        return patientService.getPatientbyId(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient();

    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){
        patientService.updatePatient();

    }





}
