package vdo07;

import java.util.Scanner;

public class Votereligible {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int age=sc.nextInt();
		TestEligibilty(age);
	}
	public static int TestEligibilty(int age) {
		if(age>=18) {
			System.out.print("eligble ");
		}else 
			System.out.print("not eligble" );
		
		return age;
		
		
	}
}
