package com.marcosoft.marcosoftcustomerauxapi.repository;

import com.marcosoft.marcosoftcustomerauxapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
