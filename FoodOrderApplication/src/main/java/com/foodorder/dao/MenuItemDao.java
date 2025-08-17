package com.foodorder.dao;

import com.foodorder.entity.MenuItem;
import jakarta.persistence.*;

public class MenuItemDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
    private EntityManager em = emf.createEntityManager();
    public void save(MenuItem m){ EntityTransaction tx = em.getTransaction(); tx.begin(); em.persist(m); tx.commit(); }
    public MenuItem get(int id){ return em.find(MenuItem.class,id);}
    public void update(MenuItem m){ EntityTransaction tx = em.getTransaction(); tx.begin(); em.merge(m); tx.commit(); }
    public void delete(int id){ EntityTransaction tx = em.getTransaction(); tx.begin(); MenuItem m=em.find(MenuItem.class,id); em.remove(m); tx.commit(); }
}
