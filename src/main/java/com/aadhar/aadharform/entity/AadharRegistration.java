package com.aadhar.aadharform.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "aadhar_registration")
public class AadharRegistration implements Serializable{

	@Id
	@GenericGenerator(name = "user_auto", strategy = "increment")
	@GeneratedValue(generator = "user_auto")
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="aadhar_no")
	private long aadharno;
	
	@Column(name="age")
	private int age;
	
	@Column(name="phone_no")
	private String phoneno;
	
	@Column(name="state")
	private String state;
	
	
	@Column(name="country")
	private String country;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String string) {
		this.phoneno = string;
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
	
	@Override
	public String toString() {
		return "AadharRegistration [id=" + id + ", name=" + name + ", aadharno=" + aadharno + ", age=" + age
				+ ", phoneno=" + phoneno + ", state=" + state + ", country=" + country + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
