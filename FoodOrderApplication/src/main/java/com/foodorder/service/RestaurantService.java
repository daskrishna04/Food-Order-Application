package com.foodorder.service;

import com.foodorder.dao.RestaurantDao;
import com.foodorder.entity.Restaurant;

public class RestaurantService {
    private RestaurantDao dao = new RestaurantDao();
    public void saveRestaurant(Restaurant r){ dao.save(r);} 
}
