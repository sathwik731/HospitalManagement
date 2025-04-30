package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients(){
        try{
            System.out.println("Into the service layer");
        } catch (Exception e) {
            System.out.println("The message is" +e.getMessage());
        }
        return null;
    }

    public Patient getPatientbyId(Long id){
        try{
            System.out.println("Into the service layer");
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }
    public Patient createPatient(Patient patient){
        try{
            System.out.println("accessing the service layer");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public void updatePatient(){
        try{
            System.out.println("updating the patients info");
        }catch(Exception e){
            e.getMessage();
        }

    }

    public void deletePatient(){
        try{
            System.out.println("Into patient service");
        } catch (Exception e) {

            e.getMessage();
        }

    }


}
