package study.errors;

public class Null {
	
public static void main(String[] args) {
	

	String str = null; //null is a literal
	
	try
	{
		System.out.println("1");
		System.out.println(str.toUpperCase());
	}
	catch(Exception n)
	{
		System.out.println("Null cannot be created");
	}
	System.out.println("End");
}
}