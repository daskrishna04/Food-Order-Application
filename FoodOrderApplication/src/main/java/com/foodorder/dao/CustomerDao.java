package com.foodorder.dao;

import com.foodorder.entity.Customer;
import jakarta.persistence.*;

public class CustomerDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
    private EntityManager em = emf.createEntityManager();

    public void save(Customer c){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(c);
        tx.commit();
    }

    public Customer get(int id){
        return em.find(Customer.class,id);
    }

    public void update(Customer c){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(c);
        tx.commit();
    }

    public void delete(int id){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer c = em.find(Customer.class,id);
        em.remove(c);
        tx.commit();
    }
}
