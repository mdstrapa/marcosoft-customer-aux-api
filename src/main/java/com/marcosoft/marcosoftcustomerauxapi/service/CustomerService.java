package com.marcosoft.marcosoftcustomerauxapi.service;

import com.marcosoft.marcosoftcustomerauxapi.model.Customer;
import com.marcosoft.marcosoftcustomerauxapi.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;

    public Customer save(Customer newCustomer){
        newCustomer.setFirstName(newCustomer.getFirstName().toUpperCase());
        newCustomer.setSurname(newCustomer.getSurname().toUpperCase());
        return customerRepository.save(newCustomer);
    }

    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

    public Customer update(Customer customer){
        return customerRepository.save(customer);
    }

}
