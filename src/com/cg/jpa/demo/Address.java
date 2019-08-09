package com.cg.jpa.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int aid;
	@Column(name = "houseno", length = 10)
	private int hno;
	@Column(length = 10)
	private String colony;
	@Column(length = 10)
	private String city;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String string) {
		this.city = string;
	}
}