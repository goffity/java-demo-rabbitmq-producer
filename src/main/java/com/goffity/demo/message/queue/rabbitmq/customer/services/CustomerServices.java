package com.goffity.demo.message.queue.rabbitmq.customer.services;

import com.goffity.demo.message.queue.rabbitmq.customer.object.Customer;
import com.goffity.demo.message.queue.rabbitmq.customer.persist.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
    @Autowired
    MessageSender sender;

    CustomerRepository customerRepository;

    @Autowired
    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        Customer result = customerRepository.save(customer);
        sender.sendEmail(customer);
        return result;
    }

}