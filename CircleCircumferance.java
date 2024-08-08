package vdo07;

import java.util.Scanner;

public class CircleCircumferance {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		double radius=sc.nextInt();
		System.out.print(Circle(radius));
	}

	private static double Circle(double radius) {
		double circum=2*radius*radius*3.14;
		
		return circum;
	}
}
