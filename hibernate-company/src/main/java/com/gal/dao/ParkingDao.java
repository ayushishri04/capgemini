package com.gal.dao;

import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Parking;
import jakarta.persistence.EntityManager;

public class ParkingDao {

    public Parking getParking(int id) {

        EntityManager em =
                EntityManagerFactoryProvider.getEntityManager();

        Parking parking = em.find(Parking.class, id);

        return parking;
    }
}