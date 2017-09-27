package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Scope("singleton") // default
//@Scope("prototype")
@Repository//("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        final Customer customer = new Customer();
        customer.setFirstname("name");
        return Arrays.asList(customer);
    }
}
