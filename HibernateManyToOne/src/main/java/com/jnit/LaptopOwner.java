package com.jnit;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="owner")
public class LaptopOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="owner_id")
	private int owner_id;
	@Column(name="owner_name")
	private String owner_name;
	@OneToOne(targetEntity=LaptopUsers.class,cascade=CascadeType.ALL)
	@JoinColumn(name="laptop_id", referencedColumnName="laptop_id")
	private LaptopUsers lu;
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public LaptopUsers getLu() {
		return lu;
	}
	public void setLu(LaptopUsers lu) {
		this.lu = lu;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	
	
}
