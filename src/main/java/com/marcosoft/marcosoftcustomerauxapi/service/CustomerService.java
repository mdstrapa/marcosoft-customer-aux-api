package com.marcosoft.marcosoftcustomerauxapi.service;

import com.marcosoft.marcosoftcustomerauxapi.model.Customer;
import com.marcosoft.marcosoftcustomerauxapi.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;

    public Customer save(Customer newCustomer){
        newCustomer.setFirstName(newCustomer.getFirstName().toUpperCase());
        newCustomer.setSurname(newCustomer.getSurname().toUpperCase());
        return customerRepository.save(newCustomer);
    }
}
