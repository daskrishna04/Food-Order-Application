package com.foodorder.main;

import com.foodorder.entity.*;
import com.foodorder.service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        RestaurantService rs = new RestaurantService();
        MenuItemService ms = new MenuItemService();
        CustomerService cs = new CustomerService();
        OrderService os = new OrderService();

        Restaurant r = new Restaurant();
        r.setName("Test Restaurant");
        rs.saveRestaurant(r);

        MenuItem m = new MenuItem();
        m.setName("Pizza");
        m.setPrice(300);
        m.setRestaurant(r);
        ms.save(m);

        Customer c = new Customer();
        c.setName("John");
        cs.save(c);

        Order o = new Order();
        o.setCustomer(c);
        o.setMenuItems(Arrays.asList(m));
        os.save(o);
    }
}
