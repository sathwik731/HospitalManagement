package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.Repository.DoctorRepository;
import com.HealthcareProj.HospitalManagementSystem.model.Doctor;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {

    private DoctorRepository doctorRepository;

    public List<Doctor> getDoctor(){
        try{
            System.out.println("into Doctor Service");
            return doctorRepository.findAll();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor){
        try{
            System.out.println("into Doctor Service");
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }
    public Doctor getDoctorById(Long id){
        try{
            System.out.println("into Doctor Service");
            return doctorRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Doctor not found"));
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public void updateDoctor(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteDoctor(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
