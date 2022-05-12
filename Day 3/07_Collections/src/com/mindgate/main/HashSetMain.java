package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("Kiran");
		nameSet.add("Rohit");
		nameSet.add("Laila");
		nameSet.add("Rohit");
		nameSet.add("Kiran");

		System.out.println(nameSet);
		System.out.println("-".repeat(50));

		Employee employee1 = new Employee(101, "Viviek", 1000);
		Employee employee2 = new Employee(102, "Rohit", 1000);
		Employee employee3 = new Employee(103, "Sakila", 1000);
		Employee employee4 = new Employee(101, "Viviek", 1000);
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());

		for (Employee employee : employeeSet) {
			System.out.println(employee);

		}
	}
}
