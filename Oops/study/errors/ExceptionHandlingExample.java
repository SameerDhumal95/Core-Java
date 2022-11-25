package study.errors;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		//String []arr = new String[3];
		
		try {
			
			System.out.println(args[0].toUpperCase());
		    System.out.println("line after problematic code");
		}
		
		catch(Exception e) //(Exception) is universal catch - it will match all the exceptions
		{
			System.out.println(e); //e.toString() will be called
		}
	    
		finally  //hamesha execute hoga
	    {
		System.out.println("this code will always run");
	    }
		
		System.out.println("out side try catch finally code ends properly");
	}
}
