package com.foodorder.dao;

import com.foodorder.entity.Restaurant;
import jakarta.persistence.*;

public class RestaurantDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
    private EntityManager em = emf.createEntityManager();

    public void save(Restaurant r){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(r);
        tx.commit();
    }
}
