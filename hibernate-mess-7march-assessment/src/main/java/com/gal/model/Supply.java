package com.gal.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="Supply")
public class Supply {

    @Id
    private int billno;

    @ManyToOne
    @JoinColumn(name="sid")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name="itemid")
    private Item item;

    @Temporal(TemporalType.DATE)
    private Date datesupply;

    private double price;
    private int qty;

    public Supply() {
    }

    public Supply(int billno, Supplier supplier, Item item, Date datesupply, double price, int qty) {
        this.billno = billno;
        this.supplier = supplier;
        this.item = item;
        this.datesupply = datesupply;
        this.price = price;
        this.qty = qty;
    }

    public int getBillno() {
        return billno;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getDatesupply() {
        return datesupply;
    }

    public void setDatesupply(Date datesupply) {
        this.datesupply = datesupply;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}