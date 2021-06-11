package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="aadhar_registration")
public class Registration implements Serializable {
	
	@Id
	@GenericGenerator(name = "r_auto", strategy = "increment")
	@GeneratedValue(generator ="r_auto")
	
	@Column(name="id")
	private int id;
	
	@Column(name="aadhar_no")
	private long aadharno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone_no")
	private String phoneno;
	
	@Column(name="age")
	private int age;
	
	@Column(name="state")
	private String state;
	
	
	@Column(name="country")
	private String country;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
