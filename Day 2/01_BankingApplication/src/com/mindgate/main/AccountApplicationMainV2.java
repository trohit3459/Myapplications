package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account = new Account(103, "Rohit Thakur", 1000);
		boolean result = account.withdraw(300);
		if (result) {
			System.out.println("Transaction Completeed Successfuly ");
			System.out.println("Balance :: " + account.getBalance());
		} else {

			System.out.println("Transaction Failed ");
			System.out.println("Balance :: " + account.getBalance());
		}
		result = account.deposit(250);
		if (result) {
			System.out.println("Deposit Completeed Successfuly ");
			System.out.println("Balance :: " + account.getBalance());
		} else {

			System.out.println("Deposit Failed ");
			System.out.println("Balance :: " + account.getBalance());
		}
	}
}
