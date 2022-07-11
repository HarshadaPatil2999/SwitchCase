package switchcasedemo;
import java.util.Scanner;
public class Ifelse {
	public static void main(choice[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch =sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("vowel");
		else
			System.out.println("consonent");
	}

}
