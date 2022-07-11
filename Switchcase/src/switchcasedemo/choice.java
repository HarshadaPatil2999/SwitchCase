package switchcasedemo;

import java.util.Scanner;

public class choice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String input = sc.next();
		switch (input) {
		case "happy":
			System.out.println("Happy");
			break;
		case "new":
			System.out.println("New");
			break;
		case " year":
			System.out.println("Year");
		default:
			System.out.println("invalid input");

		}

	}
}
