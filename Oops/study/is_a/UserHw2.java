package study.is_a;

import study.has_a.MyDate;

public class UserHw2 {

	public static void main(String[] args) {
		
	
	PartTimeEmployee P1 = new PartTimeEmployee();
	
	PartTimeEmployee P2 = new PartTimeEmployee("Sameer",new MyDate(14,6,1995), 45, 60000.0, "Developer", 8);
	
	System.out.println(P1);
	
	System.out.println("\nEmployee Information of working hours : "+"\n"+ P2.getName()+"\nDepartment :"+P2.getDepartment()
	+"\nNumber of Working Hours : "+P2.getNoOfHours());
	
	}
			
}
