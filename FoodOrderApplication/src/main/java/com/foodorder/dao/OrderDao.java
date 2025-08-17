package com.foodorder.dao;

import com.foodorder.entity.Order;
import jakarta.persistence.*;

public class OrderDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
    private EntityManager em = emf.createEntityManager();
    public void save(Order o){ EntityTransaction tx = em.getTransaction(); tx.begin(); em.persist(o); tx.commit(); }
    public Order get(int id){ return em.find(Order.class,id);} 
    public void update(Order o){ EntityTransaction tx = em.getTransaction(); tx.begin(); em.merge(o); tx.commit(); }
    public void delete(int id){ EntityTransaction tx = em.getTransaction(); tx.begin(); Order o=em.find(Order.class,id); em.remove(o); tx.commit(); }
}
