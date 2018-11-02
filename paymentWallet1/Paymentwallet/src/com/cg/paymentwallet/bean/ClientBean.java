package com.cg.paymentwallet.bean;

import java.math.BigInteger;

public class ClientBean {
	private String firstName;
	private String lastName;
	private BigInteger mobileNumber;
	private String emailId;
	private BigInteger alternateMobileNumber;
	private double balance;
	private String address;

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

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger bigInteger) {
		this.mobileNumber = bigInteger;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigInteger getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(BigInteger alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
