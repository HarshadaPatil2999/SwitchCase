package switchcasedemo;
import java.util.Scanner;
public class Swvowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch =sc.next().charAt(0);
		switch(ch)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vowel");
			break;
			default:
				System.out.println("consonent");
		}
	}

}
