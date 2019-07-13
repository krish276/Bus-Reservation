package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSPORT_COMPANY")
public class TransportCompany {

	@Id
	@Column(name="COMPANY_ID")
	@GeneratedValue
	private int companyID;
	
	@Override
	public String toString() {
		return "TransportCompany [companyID=" + companyID + ", companyName=" + companyName + "]";
	}

	@Column(name="COMPANY_NAME")
	private String companyName;

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}
