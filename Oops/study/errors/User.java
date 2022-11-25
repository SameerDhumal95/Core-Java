package study.errors;

import study.errors.custom.Under18Exception;
import study.has_a.MyDate;

public class User {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		
		e.setDept("testing");
		
		try 
		{	
//			e.setDob(new MyDate(12,12,1940));
			e.setDob(new MyDate(12,12,2006));
			System.out.println("Employee is Younger than 18 years");
			
		} 
		
		catch (Under18Exception | Above70Exception e1) 
		{
			System.out.println(e1);
		}
		
		e.setName("Sameer");

		System.out.println("program ends properly");
	}

}