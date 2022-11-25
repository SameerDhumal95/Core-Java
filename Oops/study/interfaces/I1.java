package study.interfaces;

public interface I1 {

	void f1();
}

interface I2
{
	void f1();
	void f2();
}

interface I3 extends I2
{
	void f3();
	void f4();
	
}

interface I5
{
	void f5();
	default void f6()
	{
		System.out.println("Some default implimentation of I6");
	}
}

interface I6
{
	default void f6() ///seems like ambiguity of f6 leading to Dimond problem
	{
		System.out.println("default in I 6");
	}
	
	
}

class Dummy4 implements I1 , I6
{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dummy3 implements I5 , I6
{
	
	public void f5()
	{
		
	}
//if two default methods occures f6 then it will override
	@Override
	public void f6() {
		// TODO Auto-generated method stub
		I5.super.f6();
		I6.super.f6();
	}
     	
}

class Dummy2 implements I3
{

	@Override
	public void f1() {
		
		 
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}
	
}


class Dummy implements I1,I2
{

	@Override
	public void f1() {
		
		System.out.println("f1 of dummy...");
	}

	@Override
	public void f2() {
		
		System.out.println("f2 of dummy...");
		
	}
	
	
}