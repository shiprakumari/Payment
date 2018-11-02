package com.cg.paymentwallet.service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTransactions;
import com.cg.paymentwallet.exception.ClientException;

public interface IClientService {

	public boolean createAccount(ClientBean cb) throws ClientException;

	public double showBalance(BigInteger mobileNumber) throws ClientException;

	public double deposit(BigInteger mobileNumber, double amount);

	public double withdraw(BigInteger mobileNumber, double amount) throws ClientException;

	public double fundTransfer(BigInteger mobileNumber, double amount) throws ClientException;

	public boolean validate(ClientBean cbean) throws ClientException;

	public boolean validatePhoneNumber(BigInteger mobileNumber);

	public boolean validateAmount(double amount);

	public ArrayList<ClientTransactions> printTransactions(
			LocalDateTime fromDate, LocalDateTime toDate, String type);
}
