package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.Repository.PatientRepository;
import com.HealthcareProj.HospitalManagementSystem.model.Patient;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;
    


    public List<Patient> getAllPatients(){
        try{
            System.out.println("Into the service layer");
            return patientRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error message: " +e.getMessage());
            logger.error("An error occured while fetching all the patients :{}",  e.getMessage());
        }
        return null;

    }

    public Patient getPatientbyId(Long id){
        try{
            return patientRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Patient not found with ID: " + id));
        }catch (Exception e){
            System.out.println(e.getMessage());
            logger.error("An error occured while fetching patient with ID {}: {}", id,e.getMessage());
            throw new RuntimeException("Failed to fetch patient",e);

        }
    }


    public Patient createPatient(Patient patient){
        try{
            return patientRepository.save(patient);

        } catch (Exception e) {
            logger.error("Failed to create patient: {}", e.getMessage(), e);
            throw new RuntimeException("Error creating patient");
        }
    }

    @Transactional
    public Patient updatePatient(Long id,Patient updatedPatient){
        try{
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()){
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                Patient savedPatient= patientRepository.save(p);

                return savedPatient;

            }else{
                logger.error("patient with ID {} not found", id);
                return null;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            logger.error("An error occured while fetching patient with ID {}:{}",  id,e.getMessage());

        }
        return null;

    }

    public void deletePatient(Long id){
        try{
            logger.info("Deleting patient by id {}: {}", id);
            patientRepository.deleteById(id);
        } catch (Exception e) {

            System.out.println(e.getMessage());
            logger.error("An error occured while fetching patient with ID: {}", e.getMessage());
        }

    }


}
