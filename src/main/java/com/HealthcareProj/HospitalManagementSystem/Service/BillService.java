package com.HealthcareProj.HospitalManagementSystem.Service;

import com.HealthcareProj.HospitalManagementSystem.model.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getBill(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Bill getBillById(Long id){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Bill createBill(Bill bill){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public void updateBill(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }

    }
    public void deleteBill(){
        try{
            System.out.println("into Doctor Service");
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
