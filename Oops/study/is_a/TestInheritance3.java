package study.is_a;

import study.has_a.MyDate;

public class TestInheritance3 {

	public static void main(String[] args) {
		
		//show(new Object());
		//show(new MyDate());
		//show(40); //autoBoxing  wrapping in Object class conver int to Object
		
		//pass person, Patient, PartTime
		//show(new Employee());
		//show(new Person());
	}

public static void show(Object obj) //call inbuilt object class
{
	
	String s = obj.toString();
	System.out.println("s= "+s);
}
	 
}

