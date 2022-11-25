package study.is_a;

import study.has_a.MyDate;

public class PartTimeEmployee extends Employee{

	private int NoOfHours;
	
	public PartTimeEmployee()
	{
		
	}
	
	public PartTimeEmployee(String n, MyDate dob , int empid, double salary, String department, int Hours )
	{
		super(n, dob, empid, salary, department);
		NoOfHours = Hours;
	}
	
	public int getNoOfHours() {
		return NoOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		NoOfHours = noOfHours;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(super.equals(obj))
		{
		   if(obj instanceof PartTimeEmployee)
		   {
			  PartTimeEmployee temp = (PartTimeEmployee)obj;
			
		   	  if(this.NoOfHours==temp.NoOfHours)  
			      return true;	
			  else
			      return false;
		   }
		    else
			return false; 
		}
		else
		return false;
		
		
	}
	
	
//	@Override
//	public String toString() {
//		
//		String str = super.toString()+"\nNo. Of Hours : "+this.NoOfHours+" HH";
//		return str;
//	}
}
