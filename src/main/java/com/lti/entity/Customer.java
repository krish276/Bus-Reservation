package com.lti.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name="CUSTOMER_DETAILS")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="CUSTOMER_ID")
	private int customerId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="GENDER")
	private String gender;
	
	@Transient
	private String dob;

	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name="PHONE_NO",unique=true)
	private double phoneNo;
	
	@Column(name="EMAIL", unique=true)
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	
	public void setDob(String dob) {
		this.dob = dob;
		try {
			this.dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
		}
		catch (Exception e) {
			//ignoring the catch block assuming we will be validating the date input before submission
		}
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
