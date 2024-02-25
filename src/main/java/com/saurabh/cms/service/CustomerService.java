package com.saurabh.cms.service;

import com.saurabh.cms.dao.CustomerDAO;
import com.saurabh.cms.expection.CustomerNotFoundException;
import com.saurabh.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;
    private int customerId=1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer){
//        customer.setCustomerId(customerId++);
//        customerList.add(customer);
        return customerDAO.save(customer);
        //return customer;
    }
    public List<Customer> getCustomerList() {
        return (List<Customer>) customerDAO.findAll();
        //return customerList;
    }
    public Customer getCustomer(int customerId){
//       return customerList
//               .stream()
//               .filter((c) -> c.getCustomerId() == customerId)
//               .findFirst().get();
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if(!optionalCustomer.isPresent()){
            throw new CustomerNotFoundException("This customer is not present");
        }
        return optionalCustomer.get();
    }
    public Customer updateCustomer(int customerId, Customer customer){
//        customerList.stream()
//                .forEach(c -> {
//                    if(c.getCustomerId() == customerId){
//                        c.setFirstName(customer.getFirstName());
//                        c.setLastName(customer.getLastName());
//                        c.setEmail(customer.getEmail());
//                    }
//                });
//        return customerList
//                .stream()
//                .filter((c) -> c.getCustomerId() == customerId)
//                .findFirst().get();
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }
    public void deleteCustomer(int customerId){
//        customerList.stream().forEach(c -> {
//            if(c.getCustomerId() == customerId){
//                customerList.remove(c);
//            }
//        });
        customerDAO.deleteById(customerId);
    }
}
