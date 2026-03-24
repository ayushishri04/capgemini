package com.gal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gal.model.Anorder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Component
public class AnorderDaoImple implements AnorderDao {

	@Autowired
	EntityManagerFactory emf;

	@Override
	public Anorder find(int orderid) {
		EntityManager em = emf.createEntityManager();
		return em.find(Anorder.class, orderid);
	}

	@Override
	public List<Anorder> findAll() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Anorder", Anorder.class).getResultList();
	}

	@Transactional
	@Override
	public void add(Anorder anorder) {
		EntityManager em = emf.createEntityManager();
		em.persist(anorder);
	}

	@Transactional
	@Override
	public void delete(int orderid) {
		EntityManager em = emf.createEntityManager();
		Anorder anorder = em.find(Anorder.class, orderid);
		if (anorder != null) {
			em.remove(anorder);
		}
	}

	@Transactional
	@Override
	public void update(Anorder anorder) {
		EntityManager em = emf.createEntityManager();
		em.merge(anorder);
	}
}