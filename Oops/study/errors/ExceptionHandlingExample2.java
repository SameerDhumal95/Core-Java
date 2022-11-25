package study.errors;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(args[0].toUpperCase());
			
			//if args[0] or args[1] we get arryoutofbound exception
			//if args[1] is not an integer in string the number format exception
			
			int x = Integer.parseInt(args[1]);  //cmd line argument
			
			int division  = 100/x; //if x is zero here we get arithmetic exception
			
			System.out.println(division);
		}
        
		catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("You did not give enough command line args");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("You cannot divide by 0");
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("the arg 1 must be a number");
		}
		
		System.out.println("End try catch block");
	}

}
///to avoid multiple catch write in one using pipe | in example 3 