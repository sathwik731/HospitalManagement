package com.HealthcareProj.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.HealthcareProj.HospitalManagementSystem.model.Bill;
import org.springframework.stereotype.Repository;


@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {
}
