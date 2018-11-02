package com.cg.paymentwallet.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class ClientTransactions implements Serializable {
	private static final long serialVersionUID = 1L;
	private LocalDateTime tDate;
	private String tType;
	private String transactionType;
	private BigInteger mobileNumberOther;
	private double amount;
	private double balance;

	public LocalDateTime gettDate() {
		return tDate;
	}

	public void settDate(LocalDateTime tDate) {
		this.tDate = tDate;
	}

	public String gettType() {
		return tType;
	}

	public void settType(String tType) {
		this.tType = tType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BigInteger getMobileNumberOther() {
		return mobileNumberOther;
	}

	public void setMobileNumberOther(BigInteger mobileNumberOther) {
		this.mobileNumberOther = mobileNumberOther;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
