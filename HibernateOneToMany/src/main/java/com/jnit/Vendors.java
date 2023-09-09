package com.jnit;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="vendor")
public class Vendors {
	
	@Id
	@Column(name="vendor_id")
	private int vendor_id;
	@Column(name="vendor_name")
	private String vendor_name;
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="vnid",referencedColumnName="vendor_id")
	private Set Customer;
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public Set getCustomer() {
		return Customer;
	}
	public void setCustomer(Set customer) {
		Customer = customer;
	}
	
}
