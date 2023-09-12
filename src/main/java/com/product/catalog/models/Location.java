package com.product.catalog.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	
	@Id
	private int pincode;
	private String deliverytime;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(String deliverytime) {
		this.deliverytime = deliverytime;
	}

	

}
