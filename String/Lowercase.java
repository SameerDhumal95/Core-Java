package String;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	       String S = sc.nextLine();  
	       String out = "";
	       for(int i=0;i<=S.length()-1;i++)
	       {
	           if(S.charAt(i) >= 97 && S.charAt(i) <= 122)
	           {
	               
	              out = out + S.charAt(i);
	           }
	           
	       }
	       
	       if(out.equals(S))
	    	   System.out.println("Yes"); 
	       else
		       System.out.println("NO");
	}
}
