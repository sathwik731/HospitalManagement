package com.HealthcareProj.HospitalManagementSystem.Repository;

import com.HealthcareProj.HospitalManagementSystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}
