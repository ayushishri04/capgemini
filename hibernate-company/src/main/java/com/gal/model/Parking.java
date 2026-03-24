package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parking {

    @Id
    @Column(name = "parking_id")
    private int parkingid;

    @Column(name = "floor_no")
    private int floorno;

    @Column(name = "slot_number")
    private String slotnumber;

    // Default Constructor (REQUIRED)
    public Parking() {
    }

    // Parameterized Constructor
    public Parking(int parkingid, int floorno, String slotnumber) {
        this.parkingid = parkingid;
        this.floorno = floorno;
        this.slotnumber = slotnumber;
    }

    // Getters and Setters

    public int getParkingid() {
        return parkingid;
    }

    public void setParkingid(int parkingid) {
        this.parkingid = parkingid;
    }

    public int getFloorno() {
        return floorno;
    }

    public void setFloorno(int floorno) {
        this.floorno = floorno;
    }

    public String getSlotnumber() {
        return slotnumber;
    }

    public void setSlotnumber(String slotnumber) {
        this.slotnumber = slotnumber;
    }

    @Override
    public String toString() {
        return parkingid + " | Floor: " + floorno + " | Slot: " + slotnumber;
    }
}