package com.myminiproject.demo.controller;

import com.myminiproject.demo.model.Customer;
import com.myminiproject.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  /**
   * Get the customer by his id.
   *
   * @param customerId the customer's id
   * @return a response entity which is the code status ok
   */
  @GetMapping("{customerId}")
  public ResponseEntity <Customer> getCustomerById(@PathVariable Long customerId){
    Customer customer = customerService.getCustomerById(customerId);

    return ResponseEntity.ok(customer);
  }

  @GetMapping()
  public List<Customer> getAllCustomer(){
    return customerService.getAllCustomers();
  }
}
