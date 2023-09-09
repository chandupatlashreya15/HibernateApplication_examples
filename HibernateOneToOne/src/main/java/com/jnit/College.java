package com.jnit;

import javax.persistence.*;
//import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="name")
	private String name;
	@Column(name="marks")
	private int marks;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
