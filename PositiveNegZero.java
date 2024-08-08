package vdo07;

import java.util.Scanner;

public class PositiveNegZero {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int p=0;
		int n=0;
		int z=0;
		System.out.print("how many numbers you wana enter : - ");
		int num=sc.nextInt();
		
		int[] arr= new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
			
			}
		
		for(int i=0; i<num; i++)
		{
			if(arr[i]>0)
				p++;
			else if(arr[i]<0)
				n++;
			else if(arr[i]==0)
				z++;
		}
		
		  System.out.println("\nTotal Positive Number: " +p);
	      System.out.println("Total Negative Number: " +n);
	      System.out.println("Total Zero: " +z);
		
		}
}

//	 public static void main(String[] args)
//	   {
//	      int countP=0, countN=0, countZ=0, i;
//	      Scanner scan = new Scanner(System.in);
//	      int[] arr = new int[10];
//	      
//	      
//	      System.out.print("Enter 10 Numbers: ");
//	      for(i=0; i<10; i++)
//	         arr[i] = scan.nextInt();
//	      for(i=0; i<10; i++)
//	      {
//	         if(arr[i]<0)
//	            countN++;
//	         else if(arr[i]>0)
//	            countP++;
//	         else
//	            countZ++;
//	      } 
//	      System.out.println("\nTotal Positive Number: " +countP);
//	      System.out.println("Total Negative Number: " +countN);
//	      System.out.println("Total Zero: " +countZ);
//	   }
//	}