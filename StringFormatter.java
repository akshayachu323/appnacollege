package vdo05;

public class StringFormatter {

	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    sb.append("akshay");
	    return sb.toString();  
	}  
}
