package switchcasedemo;
import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("press 1-area of rectangle 2-area of circle 3-area of triangle");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("find area of rectangle");
			int l=sc.nextInt();
			int w=sc.nextInt();
			System.out.println(" area of rectangle:"+(l*w));
			break;
		case 2:
			System.out.println("find area of circle");
			int r=sc.nextInt();
			System.out.println("area of circle:"+(3.14*r*r));
			break;
		case 3:
			System.out.println("find area of triangle");
			int b=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("area of triangle:"+(0.5*b*h));
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
