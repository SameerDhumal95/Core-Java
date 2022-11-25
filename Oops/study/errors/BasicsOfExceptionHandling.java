package study.errors;


public class BasicsOfExceptionHandling {

	public static void main(String[] args) {
		
		//int a=Integer.parseInt(args[0]), b=2, c,d;
		///String s="Sameer";
		
		try 
		{
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c;
		c = a/b;  ///exception occures
		System.out.println(c);
		
		}
		
		catch(ArithmeticException e)   //Exception is superclass for exceptions
		{
			System.out.println(e);  
			System.out.println("Can't divided by zero");
		}
		
		finally 
		{
		System.out.println("Main method ended");  
		}
		
		System.out.println("Hello");
		
		/* Why exception handling ?
		   
		   We want to maintain normal flow of the program till end
		   
		   
		*/
	}
}
