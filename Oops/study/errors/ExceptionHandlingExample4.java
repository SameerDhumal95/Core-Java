package study.errors;

import java.io.IOException;

public class ExceptionHandlingExample4 {


	public static void main(String[] args) {

		try{                      ///General manager solve kar raha he
			f1(); 
			
		} 
		catch (Exception e) {        //unchecked
			
			e.printStackTrace();
			System.out.println("Got sol");
		}
		System.out.println("Programs End Properly");
		}

	

	public static void f1() throws Exception //checked
	{
		showHeight(8/0);  //cascading exception     //manager throw kar raha he
	}

	public static void showHeight(int x) throws Exception ////worker throw kar raha he
	{
		if(x > 0) 
			System.out.println("heigth of building = "+x);
		else
		{
			Exception e = new Exception(); //checked
			throw e;
		}
	}

	public static void showSquareNumber(String s)
	{
		int x = Integer.parseInt(s);  //unchecked
		System.out.println(x*x);
	}

	public static void test()
	{
		throw new ArithmeticException();    //unchecked
	}

	public static void test2()
	{
		try {
			throw new IOException();  //checked exception
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
