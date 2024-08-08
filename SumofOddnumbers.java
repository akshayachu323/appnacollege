package vdo07;

import java.util.Scanner;

public class SumofOddnumbers {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		sum=Sum(n);
		System.out.print(sum);
				
	}

	public static int Sum(int n) {
		int sum=0;
			for(int i=1; i<=n; i++) {
				if(i%2!=0) {
					sum=sum+i;
			}
		
		}
		return sum;
	}
}
