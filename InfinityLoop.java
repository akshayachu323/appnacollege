package vdo07;

public class InfinityLoop {

	public static void main(String args[]) {
		
		int a = 1;

		   /* do loop execution */
		   do {
		      System.out.print(a);
		      a = a + 1;
		   }while( true);
}}