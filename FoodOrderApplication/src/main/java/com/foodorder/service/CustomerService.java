package com.foodorder.service;
import com.foodorder.dao.CustomerDao;
import com.foodorder.entity.Customer;

public class CustomerService {
 private CustomerDao dao=new CustomerDao();
 public void save(Customer c){dao.save(c);} 
 public Customer get(int id){ return dao.get(id);} 
 public void update(Customer c){dao.update(c);} 
 public void delete(int id){dao.delete(id);} 
}
