package com.mindgate.pojo;

import java.util.Scanner;

public class UserDetails {
	private String userId;
	private String name;
	private int age;

	public void acceptUserDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter User Details\nEnter User ID:: ");
			userId = scanner.next();
			System.out.println("Enter User Name:: ");
			name = scanner.next();
			System.out.println("Enter User age:: ");
			age = scanner.nextInt();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid input from user");
			System.out.println("Please Enter valid Input");

		}
	}

	public void displayUserDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}

}
