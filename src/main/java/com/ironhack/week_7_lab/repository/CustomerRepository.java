package com.ironhack.week_7_lab.repository;

import com.ironhack.week_7_lab.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
