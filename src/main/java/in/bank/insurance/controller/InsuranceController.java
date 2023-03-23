package in.bank.insurance.controller;

import in.bank.insurance.model.Customer;
import in.bank.insurance.model.Insurance;
import in.bank.insurance.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceController {

    @Autowired
    private InsuranceRepository insuranceRepository;

    @PostMapping("/insurance")
    public List<Insurance> getInsuranceDetails(@RequestBody Customer customer){
        List<Insurance> insuranceList =insuranceRepository.findByCustomerId(customer.getCustomerId());
        return insuranceList;
    }

}
