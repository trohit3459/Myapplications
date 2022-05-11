package com.mindgate.pojo;

import java.util.Scanner;

import com.mindgate.main.EmailNotification;
import com.mindgate.service.Notification;

public class NotificationUpdate {
	public static Notification getNotification(int choice) {

		Notification notification = null;
		switch (choice) {
		case 1:
			notification = new SMSNotification();
			break;

		case 2:
			notification = new EmailNotification();
			break;
		case 3:
			notification = new WhatsAppNotification();

		}
		return notification;

	}
}
