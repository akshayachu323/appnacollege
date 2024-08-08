package vdo10;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		//int arr[]=new int[n];
		//int arr[] = {1,2,3,4,5};
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
