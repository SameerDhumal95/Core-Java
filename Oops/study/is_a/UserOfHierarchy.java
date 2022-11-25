package study.is_a;

import study.has_a.MyDate;

public class UserOfHierarchy {

	public static void main(String[] args) {		
        
		Employee e1 = new Employee("Sameer", new MyDate(12,12,2022), 13,60000.0,"Testing");
		System.out.println(e1.getName()+"  "+e1.getDepartment());
		
       /* Employee e = new Employee();
      
        //Employee has INHERITTED methods from persion class
		e.setName("Sameer"); 
		e.setDob(new MyDate(14,06,1995));
		
		//Employee own methods
		e.setEmpid(24);
		e.setSalary(60000);
		e.setDepartment("Developer");
		
		
		System.out.println("The name of the employee is : "+e.getName());
		System.out.println("The employee dept : "+e.getDepartment());
		*/
		
		 e1.show();
		
//		//Employee OWN method
//		e.setEmpid(12);
//		e.setSalary(200000);
//		e.setDepartment("developement");
//		
//		
//		System.out.println("The name of the employee is : "+e.getName());
//	    System.out.println("the employee's dept = "+e.getDepartment());

//		Employee e1 = new Employee(13,200000,"testing","Sameer",new MyDate(11,11,2022));
//		System.out.println(e1.getName()+ " "+e1.getDepartment());
		
		}

}