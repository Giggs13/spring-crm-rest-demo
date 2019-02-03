package com.giggs13.crm.rest.controller;

import com.giggs13.crm.rest.entity.Customer;
import com.giggs13.crm.rest.error.CustomerNotFoundException;
import com.giggs13.crm.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerApiController {

    private CustomerService customerService;

    @Autowired
    public CustomerApiController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> getAll() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer getById(@PathVariable int id) {
        Customer customer = customerService.getCustomer(id);
        if (customer == null) {
            throw new CustomerNotFoundException(id);
        }
        return customer;
    }
}
