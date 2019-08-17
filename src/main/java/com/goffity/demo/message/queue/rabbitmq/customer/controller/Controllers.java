package com.goffity.demo.message.queue.rabbitmq.customer.controller;

import com.goffity.demo.message.queue.rabbitmq.customer.object.Customer;
import com.goffity.demo.message.queue.rabbitmq.customer.services.CustomerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class Controllers {

    @Autowired
    CustomerServices customerServices;

    @PostMapping()
    public ResponseEntity<?> postCustomer(@RequestBody Customer body) {
        Customer customer = customerServices.createCustomer(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}
