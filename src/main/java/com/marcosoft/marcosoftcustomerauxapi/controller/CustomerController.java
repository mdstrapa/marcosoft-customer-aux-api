package com.marcosoft.marcosoftcustomerauxapi.controller;

import com.marcosoft.marcosoftcustomerauxapi.model.Customer;
import com.marcosoft.marcosoftcustomerauxapi.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@AllArgsConstructor
public class CustomerController {

    CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer newCustomer){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.save(newCustomer));
    }

}
