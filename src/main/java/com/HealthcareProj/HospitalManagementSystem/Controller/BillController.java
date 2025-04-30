package com.HealthcareProj.HospitalManagementSystem.Controller;

import com.HealthcareProj.HospitalManagementSystem.Service.BillService;
import com.HealthcareProj.HospitalManagementSystem.model.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Bill")
public class BillController {

    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills(){
        return null;
    }

    @PostMapping
    public Bill createBill(Bill bill){
        System.out.println("Billing details created");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Billing details returned");
        return billService.getBillById(id);
    }

    public void updateBill(@PathVariable Long id){
        System.out.println("Details updated");
        billService.updateBill();

    }

    @DeleteMapping
    public void deleteBill(@PathVariable Long id){
        billService.deleteBill();

    }

}
