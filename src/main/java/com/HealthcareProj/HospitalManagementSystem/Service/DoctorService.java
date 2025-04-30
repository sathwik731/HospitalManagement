package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {

    public List<Doctor> getDoctor(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }
    public Doctor getDoctorById(Long id){
        try{
            System.out.println("into Doctor Service");
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
