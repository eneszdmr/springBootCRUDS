package com.testdemosu.demo.controller;

import com.testdemosu.demo.entity.Customer;
import com.testdemosu.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> getCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/getOne/{id}")
    public Customer getOneCustomer(@PathVariable int id) {
        return customerService.getOneCustomer(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable int id){
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
        return "this guy deleted : "+id;
    }
}
