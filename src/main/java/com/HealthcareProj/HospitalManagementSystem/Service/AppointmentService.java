package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAppointment(){
        try{
            System.out.println("into the Appointment service ");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Appointment createAppointment(Appointment appointment){
        try{
            System.out.println("into the Appointment service ");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Appointment getAppointmentById(Long id){
        try{
            System.out.println("into the Appointment service ");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public void updateAppointment(){
        try{
            System.out.println("into the Appointment service ");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteAppointment(){
        try{
            System.out.println("into the Appointment service ");
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
