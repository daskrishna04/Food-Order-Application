package com.foodorder.service;
import com.foodorder.dao.OrderDao;
import com.foodorder.entity.Order;

public class OrderService {
 private OrderDao dao=new OrderDao();
 public void save(Order o){dao.save(o);} 
 public Order get(int id){ return dao.get(id);} 
 public void update(Order o){dao.update(o);} 
 public void delete(int id){dao.delete(id);} 
}
