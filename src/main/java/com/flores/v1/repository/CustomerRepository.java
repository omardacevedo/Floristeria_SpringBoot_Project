package com.flores.v1.repository;

import com.flores.v1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
