package com.myminiproject.demo.service;

import com.myminiproject.demo.model.Customer;
import com.myminiproject.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  /**
   * This method allows to get the customer by his id.
   *
   * @param customerId the customer's id
   * @return the customer
   */
  public Customer getCustomerById(Long customerId){
    Customer customer = customerRepository.findById(customerId).
        orElseThrow(() -> new IllegalStateException("student with id " + customerId + " does not exist"));;

        return customer;
  }

  public List<Customer> getAllCustomers(){
    return customerRepository.findAll();
  }
}
