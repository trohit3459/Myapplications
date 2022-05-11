package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.NotificationUpdate;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		int choice;
		System.out.println(
				"Menu\n 1. SMS Notification \n 2.E-Mail Notification\n 3.WhatsApp\n Enter which type of message you want to send ");

		choice = scanner.nextInt();
		Notification notification = NotificationUpdate.getNotification(choice);
		System.out.println("Enter Contact no ::");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Message::");
		message = scanner.nextLine();

		notification.sendNotification(to, message);
	}
}
