package vdo07;

import java.util.Scanner;

public class Average {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		float num1= sc.nextInt();
		float num2= sc.nextInt();
		float num3= sc.nextInt();
		float average =Average(num1,num2,num3);
		System.out.print(average);
	}

	public static float Average(float a, float b, float c) {
		// TODO Auto-generated method stub
		float average = (a+b+c)/3;
				
		return average;
	}
}
