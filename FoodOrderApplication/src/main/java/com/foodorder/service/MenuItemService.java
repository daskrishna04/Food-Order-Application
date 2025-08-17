package com.foodorder.service;
import com.foodorder.dao.MenuItemDao;
import com.foodorder.entity.MenuItem;

public class MenuItemService {
 private MenuItemDao dao=new MenuItemDao();
 public void save(MenuItem m){dao.save(m);} 
 public MenuItem get(int id){ return dao.get(id);} 
 public void update(MenuItem m){dao.update(m);} 
 public void delete(int id){dao.delete(id);} 
}
