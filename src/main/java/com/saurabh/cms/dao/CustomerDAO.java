package com.saurabh.cms.dao;

import com.saurabh.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    Iterable<Customer> findAll();
}
