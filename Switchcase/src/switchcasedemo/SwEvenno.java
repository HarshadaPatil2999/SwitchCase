package switchcasedemo;

import java.util.Scanner;

public class SwEvenno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		switch (n % 2) {
		case 0:
			System.out.println("it is even number");
			break;
		default:
			System.out.println("it is odd number");
		}
	}
}
