package com.jnit;

import javax.persistence.*;
 
@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="aid")
	private int aid;
	@Column(name="place")
	private String place;
	@Column(name="pincode")
	private int pincode;
	@OneToOne(targetEntity=College.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ctid", referencedColumnName="cid")
	private  College st;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public College getSt() {
		return st;
	}
	public void setSt(College st) {
		this.st = st;
	}

}
