package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {
	public static void main(String[] args) {
		Current current = new Current(101, "Rohit Thakur", 10000, 50000);
		
		System.out.println(current);
		System.out.println("Withdraw : 5000");
		current.withdraw(5000); //overdraft 50,000 and balace 5000
		System.out.println(current);
		
		System.out.println();
		
		System.out.println("Withdraw : 20,000");
		current.withdraw(20000); //overdraft 35,000 and balace 0
		System.out.println(current);
		
		System.out.println();
		
		System.out.println("deposit : 5000");
		current.deposit(5000); //overdraft 40,000 and balace 0
		System.out.println(current);
		
		System.out.println();
		
		System.out.println("deposit : 15000");
		current.deposit(15000); //overdraft 50,000 and balace 5000
		System.out.println(current);
		
	}
}
