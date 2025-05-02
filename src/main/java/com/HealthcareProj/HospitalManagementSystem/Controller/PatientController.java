package com.HealthcareProj.HospitalManagementSystem.Controller;

import com.HealthcareProj.HospitalManagementSystem.Service.PatientService;
import com.HealthcareProj.HospitalManagementSystem.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patients")
public class PatientController {


    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){

        return patientService.getAllPatients();
    }

    @PostMapping
    public ResponseEntity<Patient> createPatients(@RequestBody Patient patient){
        System.out.println("creating patients");
        Patient savedPatient= patientService.createPatient(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public Patient getPatientbyId(@PathVariable Long id){
        System.out.println("get by id");
        return patientService.getPatientbyId(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
         patientService.deletePatient(id);

    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id,@RequestBody Patient patient){
        return patientService.updatePatient(id,patient);

    }





}
