package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Anorder {

	@Id
	private int orderid;

	private int custid;

	private int paymentid;

	@Column(name = "number_items")
	private Integer numberItems; 

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public Integer getNumberItems() {
		return numberItems;
	}

	public void setNumberItems(Integer numberItems) {
		this.numberItems = numberItems;
	}

	@Override
	public String toString() {
		return "Anorder [orderid=" + orderid + ", paymentid=" + paymentid + ", custid=" + custid + ", numberItems="
				+ numberItems + "]";
	}
}