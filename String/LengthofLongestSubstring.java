package String;

import java.util.Scanner;

public class LengthofLongestSubstring {

	  public static int lengthOfLongestSubstring(String s) {
	       int num = s.length()-1; 
	       for(int i=0;i<=num;i++)
	       {
	    	   System.out.println(s.charAt(i));
	       }
	    	   return num;
	    }
	    
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        
	        int n = lengthOfLongestSubstring(str);
	        System.out.println(n);
	    }
}
