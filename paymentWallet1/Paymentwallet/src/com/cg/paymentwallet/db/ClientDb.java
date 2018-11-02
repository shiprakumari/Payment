package com.cg.paymentwallet.db;

import java.math.BigInteger;
import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTransactions;

public class ClientDb {
	private static ArrayList<ClientBean> clientDb = new ArrayList<ClientBean>();
	private static ArrayList<ClientTransactions> printList = new ArrayList<ClientTransactions>();

	static {

		ClientBean customer = new ClientBean();
		customer.setFirstName("niharika");
		customer.setLastName("thoutam");
		customer.setMobileNumber(new BigInteger("8976543210"));
		customer.setEmailId("gt@gmail.com");
		customer.setAddress("chennai");
		customer.setBalance(9000.00);
		clientDb.add(customer);
		ClientBean customer2 = new ClientBean();
		customer2.setFirstName("ramya");
		customer2.setLastName("dasari");
		customer2.setMobileNumber(new BigInteger("9087654321"));
		customer2.setEmailId("ramya@gmail.com");
		customer2.setAddress("pune");
		customer2.setBalance(1000.00);
		clientDb.add(customer2);

	}

	public static ArrayList<ClientBean> getClientDb() {
		return clientDb;
	}

	public static void setClientDb(ArrayList<ClientBean> clientDb) {
		ClientDb.clientDb = clientDb;
	}

	public static ArrayList<ClientTransactions> getPrintList() {
		return printList;
	}

	public static void setPrintList(ArrayList<ClientTransactions> printList) {
		ClientDb.printList = printList;
	}

}
