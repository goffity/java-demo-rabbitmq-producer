package com.goffity.demo.message.queue.rabbitmq.customer.persist;

import com.goffity.demo.message.queue.rabbitmq.customer.object.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
