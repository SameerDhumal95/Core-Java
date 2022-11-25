package study.overriding;

import java.io.IOException;

public class Overriding {

	public static void main(String[] args) {
		
		
	}
}

class Parent
{
	//public scope  
	public void f1()
	{
		
	}
	
	public void f2() throws IOException
	{
		
	}
	
	void f3()
	{
		
	}
	
	void f3(int x)
	{
		
	}
	
	void f3(float x)
	{
		
	}
}

class Child extends Parent
{
//	//default Scope 
//	void f1() 
//	{
//		//Scope cannot be reduce in overriden method
//	}
	
//	public void f2() throws Exception
//	{
//		
//	}
	
	void f3(String x)
	{
		
	}
}

