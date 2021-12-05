package com.myminiproject.demo.config;

import com.myminiproject.demo.model.Customer;
import com.myminiproject.demo.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CustomerConfig {

  @Bean
  /**
   * CommandLineRunner is an interface used to indicate that a bean should run when it is contained within a SpringApplication
   */
  CommandLineRunner commandLineRunner(CustomerRepository repository) {
    return args -> {
      Customer michel = new Customer(
          "Michel",
          "Nguyen",
          5000l,
          200l
      );


      Customer alex = new Customer(
          "Alex",
          "LeGrand",
          10000l,
          500l
      );

      List<Customer> customersList = new ArrayList<>();
      customersList.add(michel);
      customersList.add(alex);
      repository.saveAll(customersList);//hibernate is running when we invoque saveAll
    };
  }
}
