package vdo10;

import java.util.Scanner;

public class Stringarray {
//next(): Reads the next input token (usually a word) until it encounters whitespace (e.g., space or tab). It does not consume the newline character, so it can lead to issues when mixed with nextLine().

//nextLine(): Reads the entire current line of input, including spaces, until it encounters a newline ('\n') character. It consumes the newline character, making it suitable for reading multi-line input and avoiding issues when switching between different input methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] name=new String[n];
		for(int i=0; i<n; i++) {
			name[i]=sc.nextLine();
			
		}
		for(int i=0; i<n; i++) {
			System.out.println(name[i] +" ");
		
	}

	}
}
