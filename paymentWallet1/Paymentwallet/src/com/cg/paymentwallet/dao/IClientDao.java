package com.cg.paymentwallet.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTransactions;
import com.cg.paymentwallet.exception.ClientException;

public interface IClientDao {

	public boolean createAccount(ClientBean client);

	public double showBalance(BigInteger mobileNumber) throws ClientException;

	public double withdraw(BigInteger mobileNumber, double amount)
			throws ClientException;

	public ArrayList<ClientTransactions> printTransactions(
			LocalDateTime fromDate, LocalDateTime toDate, String type);

	public double deposit(BigInteger mobileNumber, double amount);

	public double fundTransfer(BigInteger mobileNumber, double amount) throws ClientException;

}
