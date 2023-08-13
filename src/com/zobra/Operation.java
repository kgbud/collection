package com.zobra;
import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();

		switch (num) {

		case 10: //if (num == 10 && num > 20)
			System.out.println("10 rupees dispatched");
			break;

		case 100://else if (num == 100)
			System.out.println("100 rupees dispatched");
			break;

		case 200://else if (num ==200)
			System.out.println("100 rupees dispatched");
			break;

		default://else
			System.out.println("incorrect selection");
			System.out.println("Hello Java");
		}
		

	}



}
