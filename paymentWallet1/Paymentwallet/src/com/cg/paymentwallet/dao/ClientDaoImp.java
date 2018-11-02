package com.cg.paymentwallet.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTransactions;
import com.cg.paymentwallet.db.ClientDb;
import com.cg.paymentwallet.exception.ClientException;
import com.cg.paymentwallet.exception.ClientExceptionMessages;

public class ClientDaoImp implements IClientDao {
	private static ArrayList<ClientBean> list = new ArrayList<ClientBean>();
	ClientDb clientDb = new ClientDb();
	ClientBean clientbean = new ClientBean();

	boolean isValid = false;

	@Override
	public boolean createAccount(ClientBean cb) {

		return list.add(cb);

	}

	@Override
	public double showBalance(BigInteger mobileNumber) throws ClientException {
		double balance = ClientDb.getClientDb().get(0).getBalance();

		return balance;

	}

	@Override
	public double withdraw(BigInteger mobileNumber, double amount)
			throws ClientException {
		double balance = 0.0;
		if (ClientDb.getClientDb().get(0).getBalance() > amount) 
		{

			balance = ClientDb.getClientDb().get(0).getBalance() - amount;

			ClientDb.getClientDb().get(0).setBalance(balance);

		} else 
		{

			throw new ClientException(ClientExceptionMessages.ERRORWITHDRAW);
		}

		return balance;
	}

	@Override
	public double fundTransfer(BigInteger mobileNumber, double amount)
			throws ClientException {
		double balance = 0.0;
		if (ClientDb.getClientDb().get(0).getMobileNumber()
				.equals(mobileNumber)) 
		{
			if (ClientDb.getClientDb().get(0).getBalance() > amount) 
			{
				balance = ClientDb.getClientDb().get(0).getBalance() - amount;
				ClientDb.getClientDb().get(0).setBalance(balance);
				double balance1 = ClientDb.getClientDb().get(1).getBalance()
						+ amount;
				ClientDb.getClientDb().get(1).setBalance(balance1);
			} else 
			{
				throw new ClientException(ClientExceptionMessages.ERRORWITHDRAW);
			}
		}

		return balance;
	}

	@Override
	public double deposit(BigInteger mobileNumber, double amount) {
		double balance = 0.0;

		if (ClientDb.getClientDb().get(0).getMobileNumber()
				.equals(mobileNumber)) {

			balance = ClientDb.getClientDb().get(0).getBalance() + amount;
			ClientDb.getClientDb().get(0).setBalance(balance);

		}

		return balance;
	}

	@Override
	public ArrayList<ClientTransactions> printTransactions(
			LocalDateTime fromDate, LocalDateTime toDate, String type) {
		ArrayList<ClientTransactions> result = new ArrayList<>();

		for (ClientTransactions clientTran : result) {
			if (clientTran.gettDate().isAfter(fromDate)
					&& clientTran.gettDate().isBefore(toDate)
					&& clientTran.gettType() == type) {
				result.add(clientTran);
			}
		}
		return result;

	}

}
