package com.gal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryProvider {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    // Create EntityManagerFactory (Singleton)
    public static EntityManagerFactory getEntityManagerFactory() {

        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("company_db_pu");
        }

        return emf;
    }

    // Create EntityManager
    public static EntityManager getEntityManager() {

        if (emf == null || !emf.isOpen()) {
            getEntityManagerFactory();
        }

        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
        }

        return em;
    }
}