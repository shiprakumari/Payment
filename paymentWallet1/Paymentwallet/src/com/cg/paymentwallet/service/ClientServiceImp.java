package com.cg.paymentwallet.service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTransactions;
import com.cg.paymentwallet.dao.IClientDao;
import com.cg.paymentwallet.dao.ClientDaoImp;
import com.cg.paymentwallet.exception.ClientException;
import com.cg.paymentwallet.exception.ClientExceptionMessages;

public class ClientServiceImp implements IClientService {

	IClientDao dao = new ClientDaoImp();

	@Override
	public boolean createAccount(ClientBean cb) throws ClientException {
		boolean isAdded = false;
		if (validate(cb)) {
			isAdded = dao.createAccount(cb);
		}
		return isAdded;

	}

	@Override
	public boolean validate(ClientBean cbean) throws ClientException {
		boolean isValid = false;
		if (cbean.getLastName().trim().length() < 4) {
			throw new ClientException(ClientExceptionMessages.ERRORNAME);
		}
		if (cbean.getFirstName().length() < 4) {
			throw new ClientException(ClientExceptionMessages.ERRORNAME);
		}
		if (cbean.getAddress() == "") {
			throw new ClientException(ClientExceptionMessages.ERRORADDRESS);
		}
		if (!(((Object) cbean.getAlternateMobileNumber()).toString()
				.matches("(0)?[6-9][0-9]{9}"))) {
			throw new ClientException(ClientExceptionMessages.ERRORPHONE);
		}
		if (!(cbean.getEmailId()
				.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"))) {
			throw new ClientException(ClientExceptionMessages.ERROREMAIL);
		}

		if (!(cbean.getMobileNumber().toString().matches("(0)?[6-9][0-9]{9}"))) {
			throw new ClientException(ClientExceptionMessages.ERRORPHONE);
		}
		return isValid;
	}

	@Override
	public boolean validateAmount(double amount) {
		boolean isvalidate = false;
		if (amount > 0) {
			isvalidate = true;
		}
		return isvalidate;
	}

	@Override
	public double showBalance(BigInteger mobileNumber) throws ClientException {
		return dao.showBalance(mobileNumber);
	}

	@Override
	public double deposit(BigInteger mobileNumber, double amount) {
		return dao.deposit(mobileNumber, amount);
	}

	@Override
	public double withdraw(BigInteger mobileNumber, double amount) throws ClientException {
		return dao.withdraw(mobileNumber, amount);
	}

	@Override
	public double fundTransfer(BigInteger mobileNumber, double amount) throws ClientException {
		return dao.fundTransfer(mobileNumber, amount);
	}

	@Override
	public ArrayList<ClientTransactions> printTransactions(
			LocalDateTime fromDate, LocalDateTime toDate, String type) {
		return null;
	}

	@Override
	public boolean validatePhoneNumber(BigInteger mobileNumber) {
		boolean isvalidate = false;
		if (String.valueOf(mobileNumber).matches("(0/91)?[7-9][0-9]{9}")) {
			isvalidate = true;
		}
		return isvalidate;
	}

}
