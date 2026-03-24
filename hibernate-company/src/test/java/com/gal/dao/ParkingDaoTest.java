package com.gal.dao;

import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Parking;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingDaoTest {

    @BeforeAll
    public static void openConnections() {
        System.out.println("opening connections");
        EntityManagerFactoryProvider.getEntityManager();
    }

    @Test
    void testGetParking() {

        ParkingDao dao = new ParkingDao();

        Parking parking = dao.getParking(1);

        assertNotNull(parking);
        System.out.println(parking);

        assertEquals("A1", parking.getSlotnumber());
    }

    @AfterAll
    public static void closeConnection() {
        System.out.println("closing connections");
        EntityManagerFactoryProvider.getEntityManagerFactory().close();
    }
}