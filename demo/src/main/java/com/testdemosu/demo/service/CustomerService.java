package com.testdemosu.demo.service;

import com.testdemosu.demo.dao.CustomerRepository;
import com.testdemosu.demo.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){

        return customerRepository.findAll();
    }

    public Customer getOneCustomer(int id){
        return customerRepository.findById(id).orElse(null);
    }

    @Transactional
    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Transactional
    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }
}
