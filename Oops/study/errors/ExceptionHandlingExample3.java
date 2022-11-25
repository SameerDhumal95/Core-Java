package study.errors;

public class ExceptionHandlingExample3 {

		public static void main(String[] args) {
			
			try
			{
				System.out.println(args[0].toUpperCase());
				
				//if args[0] or args[1] we get arryoutofbound exception
				//if args[1] is not an integer in string the number format exception
				int x= Integer.parseInt(args[1]);  //cmd line argument
				int division  = 100/x; //if x is zero here we get arithmetic exception
				System.out.println(division);
				
				String[] arr = new String[3];
				System.out.println(arr[0].toLowerCase());
			}
	        
			catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
			{
				//toString called
		        System.out.println("catching "+e);
			}
			
			catch(Exception e)  //acting like a sink that matches everything other than above 3
			{
				//stack methods are shown
				e.printStackTrace();
			}
			
			
			System.out.println("End try catch block");
		}

}


