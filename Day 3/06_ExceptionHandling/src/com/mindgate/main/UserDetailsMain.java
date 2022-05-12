package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
		System.out.println("Main End");
		UserDetails userDetails = new UserDetails();
		userDetails.acceptUserDetails();
		userDetails.displayUserDetails();
		System.out.println("Main End");

	}
}
