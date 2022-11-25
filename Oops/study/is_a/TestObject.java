package study.is_a;

import study.has_a.MyDate;

import study.has_a.TechnicalBook;

public class TestObject {

	public static void main(String[] args) {
		
		/*MyDate date = new MyDate(12,12,2012);
		
		System.out.println(date);*/ //internally to String is called
		
		
		/*Employee e1 = new Employee(15,60000,"IET","Sameer",new MyDate(14,6,1995)); 
	
		System.out.println(e1);*/ //printed using Object toString
		
		
		/*Person p1 = new Person("Sameer",new MyDate(14,06,1995));
		
		System.out.println(p1);*/
		
		
		TechnicalBook B1 = new TechnicalBook("Java",500.0,new MyDate(12,12,2012),new String[] {"JamesGosling", "sam","Y.Kanetkar"});
		
		System.out.println(B1);
		
		
		//System.out.println(new MyDate(13,13,2022));
		
	}
}
