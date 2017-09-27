package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Service//("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Value("${dbUsername}")
    private String dbUsername;

    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public List<Customer> findAll() {
        System.out.println("dbUsername = " + dbUsername);
        return customerRepository.findAll();
    }
            
}
