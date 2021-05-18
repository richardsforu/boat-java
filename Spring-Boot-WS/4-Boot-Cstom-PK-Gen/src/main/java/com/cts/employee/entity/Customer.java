package com.cts.employee.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.GenericGenerator;
@Entity
@GenericGenerator(name = "gen1",strategy = "com.cts.employee.utils.CustPkGen")

public class Customer {

	@Id
	@GeneratedValue(generator = "gen1")
	private String custId;
	private String custName;
	private LocalDate dob;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
