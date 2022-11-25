package study.errors;

import java.util.Scanner;

public class HandlingCrash {

		public static void main(String[] args) 
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter divident");
			int divident = sc.nextInt();
			
			System.out.println("enter divisor");
			int divisor = sc.nextInt();
		     
			sc.close();
			
			
			//To Handle we use try catch
			try 
			{
				//try to run the problematic code in try block
			int division = divident/divisor;
			System.out.println("division = "+division);
			
			}
			
			catch(ArithmeticException e)  /*java.lang.Object
                                               java.lang.Throwable
			                                       java.lang.Exception
                                                      java.lang.RuntimeException
                                                         java.lang.ArithmeticException
                                          */
			{
				//handling code for the exception
				System.out.println("divisor cannot be 0");
			}
			
			System.out.println("program ends properly");
		}	
}

