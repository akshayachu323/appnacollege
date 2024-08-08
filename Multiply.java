package vdo05;

import java.util.Scanner;



public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number which you need to see the muliplication table");
		int multi= sc.nextInt();
		System.out.print("enter the number till you wana see the muliplaction");
		int n= sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=multi*i;
			System.out.println(multi+"*"+i+"="+sum);
		}
}
}