package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double overdraftBalanceTemp;

	public Current() {
		System.out.println("default constructor of Current ");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		overdraftBalanceTemp=overdraftBalance;
		System.out.println("Overloaded Constructor of Current");

	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean withdraw(double ammount) {
		if (ammount >= 0 && ammount <= getBalance() + overdraftBalance) {
			if (ammount < getBalance()) {
				setBalance(getBalance() - ammount);
				System.out.println(1);
			} else {
				System.out.println(2);
				double temp;
				temp = getBalance() - ammount;
				setBalance(temp);
				if (getBalance() < 0) {
					setBalance(0);
					setOverdraftBalance(getOverdraftBalance() + temp);
				}
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double ammount) {
		double temp=0;
		if (overdraftBalance != overdraftBalanceTemp) {
			setOverdraftBalance(getOverdraftBalance()+ammount);
			if (getOverdraftBalance()>overdraftBalanceTemp) {
				
				temp=getOverdraftBalance()-overdraftBalanceTemp;
				setOverdraftBalance(overdraftBalanceTemp);
				
				
			}if (temp!= 0) {
				setBalance(temp);
				
			}
			
		}
		return false;
	}

}
