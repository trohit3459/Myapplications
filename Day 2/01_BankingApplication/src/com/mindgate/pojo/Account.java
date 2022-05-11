package com.mindgate.pojo;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("default constuctor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		System.out.println("Overloaded construor of Account");

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean withdraw(double ammount) {
		if (ammount > 0 && balance > ammount) {
			balance = balance - ammount;
			return true;
		}
		return false;

	}

	public boolean deposit(double ammount) {
		if (ammount > 0) {
			balance = balance + ammount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
