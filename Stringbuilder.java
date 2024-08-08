 package vdo05;

//String are immutable thats why we use 
 //Stringbuilder which are mutable

public class Stringbuilder {
   public static void main(String args[]) {
	   //String builder format
     StringBuilder sb = new StringBuilder("Hello  World");
    
     for(int i=0; i<=sb.length()/2; i++) {
    	 int frontpos = i;
    	 int lastpos = sb.length()-i-1;
    	 
    	  char frontchar =sb.charAt(frontpos);
    	  char lastchar =sb.charAt(lastpos);
    	  
    	  sb.setCharAt(frontpos, lastchar);
    	  sb.setCharAt(lastpos, frontchar);
    	  
     
     }
     System.out.println(sb);
   }
}
