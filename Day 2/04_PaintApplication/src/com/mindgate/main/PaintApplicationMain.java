package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class PaintApplicationMain {
	public static void main(String[] args) {
		int choice;
		String continuueChoice;

		System.out.println("Welcome to Paint");
		System.out.println("Menu \n 1.Circle \n 2. Triangele\n 3.Square\n Enter your Choice ");

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		Shapes shapes = ShapesFactory.getShapes(choice);
		if (shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid Shape Choice");
		System.out.println("Do you want to Continue");
		//continuueChoice = 

	}
}
