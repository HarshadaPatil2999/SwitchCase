package switchcasedemo;

import java.util.Scanner;

public class Switchcasedemo7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1-Maharashtrian Thali   2-Gujarati Thali  3-Rajasthani Thali  4-panjabi Thali ");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Maharashtrian Thali");
			int a = sc.nextInt();

			int rs = 200;
			System.out.println("enter total:" + (a * rs));
			break;
		case 2:
			System.out.println("Gujarati Thali 200");
			int b = sc.nextInt();

			int c = 250;
			System.out.println("enter total:" + (b * c));
			break;
		case 3:
			System.out.println("Rajasthani Thali 200");
			int d = sc.nextInt();

			int e = 300;
			System.out.println("enter total:" + (d * e));
			break;
		case 4:
			System.out.println("panjabi Thali 200");
			int f = sc.nextInt();

			int g = 350;
			System.out.println("enter total:" + (f * g));
			break;
		default:
			System.out.println("invalid choice");
			sc.close();
		}
	}
}