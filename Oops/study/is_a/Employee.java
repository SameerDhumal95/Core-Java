package study.is_a;

import study.has_a.MyDate;

//IS A relation  Employee isa sub class of Person
public class Employee extends Person { 
	
	private int empid;
	private double salary;
	private String department;
	
	/*Employee(child class extend (parent) class*/
 	/*Employee is inheriting from person class*/
	
	public Employee()
	{
		super();
		System.out.println("Employee created");
		
	}

	
	
	public Employee(String n, MyDate dob, int empid, double salary, String department) {
		super(n,dob); //calling parameterized constructor of parent from child
		/*super:
		 
		1. super is used to give a call to an overridden method of the superclass
		2. super is used to give a call to the superclass(parent class) constructor
		3. superclass parameterless constructor is called automatically via subclass parameterless constructor
		   so the writing of super() is optional in the derived class constructor
		4. superclass parameterized constructor is called with the help of super(list of parameters) inside sub class parameterized constructor
		5. super() statement must be the first statement in the method
		*/
		
		this.empid = empid;
		this.salary = salary;
		this.department = department;
		System.out.println("Parameterised constructur of Employee");
	}

    public void show()
    {
	    //System.out.println(super.getName()+" "+super.getDob().getDd());
    	super.show();  //this will call method of super class(parent)
    	/*agar is class me name hota to shoe method samaj nahi pata ki wo name parent ka print karna he so thats why we use keyword super to show 
    	  parent name*/
    	
    	System.out.println(empid+" "+salary+" "+department);
    	
    }
    
	/*Employee having own three properties (empid/salary/departmet) and
	  it has two inherited properties from person (Name/Dob)*/
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(super.equals(obj))
		{
		    if(obj instanceof Employee)
		    {
			Employee temp = (Employee)obj;  //((Person) obj).name)-->downcasting
			
			if(this.empid == temp.empid   //we can not convert premptive to int
			&& this.salary == temp.salary
			&& this.department.equals(temp.department))
			  return true;
		    }
			else
			  return false;		
		    
		}
		return false;	
		
	}
	
	 @Override
	public String toString() {
		
		/*String s = empid+"  "+salary+"  "+department+"  "+getDob().getDd()+"/"+getDob().getMm()+"/"+getDob().getYy();*/
		 String s = super.toString()+ empid+"  "+salary+"  "+department;
		return s;  //super.toString is the string from parent (person) class
	}
}