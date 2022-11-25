package StarPattern;

import java.util.Scanner;

public class Peramid2 {

	    public static void main (String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	        int[] nums = new int[n];
	        for(int i=0;i<nums.length;i++)
	        {
	        	nums[i]= sc.nextInt();
	        }
	        int target = sc.nextInt();
	 
	        findPair(nums, target);
	    }    
	
	    public static void findPair(int[] nums, int target)
	    {
	       
	        for (int i = 0; i < nums.length - 1; i++)
	        {
	            
	            for (int j = i + 1; j < nums.length; j++)
	            {
	                
	                if (nums[i] + nums[j] == target)
	                {
	                    System.out.printf("%d %", nums[i], nums[j]);
	                    return;
	                }
	            }
	        }
	 
	        
	        System.out.println("not found");
	    }
	 
	   
	}
