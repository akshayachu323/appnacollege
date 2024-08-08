package vdo07;

import java.util.Scanner;

public class GretestestOfTwo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int greatest =greatestOfTwo(n1,n2);
		System.out.println(greatest);
	}
	

	public static int greatestOfTwo(int n1, int n2) {
		int greatest ;
		if(n1>n2)
			greatest = n1;
		else
			greatest =n2;
			
		
		return greatest;
	}
}
