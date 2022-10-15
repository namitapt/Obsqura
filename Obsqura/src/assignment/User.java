package assignment;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		System.out.println("Enter the pin");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		Bank obj = new Bank();
		switch(pin) {
		case 1001: obj.setValidation(1001);
		break;
		case 1234: obj.setValidation(1234);
		break;
		case 1212: obj.setValidation(1212);
		break;
		default: System.out.println("Invalid pin");
		}
	}

}
