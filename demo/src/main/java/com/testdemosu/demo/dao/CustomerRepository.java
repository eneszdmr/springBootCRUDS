package com.testdemosu.demo.dao;

import com.testdemosu.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
