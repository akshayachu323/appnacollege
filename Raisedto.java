package vdo07;

import java.util.Scanner;

public class Raisedto {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2 =sc.nextInt();
		raise(num1,num2);
		
	}
	
	public static void raise(int a,int b) {
	System.out.print(Math.pow(a, b));
	
}
}