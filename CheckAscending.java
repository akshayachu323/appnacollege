package vdo10;

import java.util.Scanner;

public class CheckAscending {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int number[] = new int[n];
	      
	      for(int i=0; i<n; i++) {
	    	  number[i]=sc.nextInt();
	    	 
	      }
	      
	      boolean isAsending=true;
	      
	      for(int i=0; i<number.length-1; i++) {
	    	  
	    	  if(number[i]>number[i+1]) {
	    		  isAsending=false;
	    		  
	    	  }
	      }
	      if (isAsending=true) {
	    	  System.out.println("is assending");
	    	 
	      }
	      else 
	    	  System.out.println("is not assending"); 
	      
	   }
}

