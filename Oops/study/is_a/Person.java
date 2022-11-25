package study.is_a;

import study.has_a.MyDate;

class Person {
	
	private String name;
	private MyDate dob; //another class 
	
	
	/* Constructure of person class call first because it is superclass
         person
           |
         Employee
           |
         UserHw1	
    */
	
	public Person()
	{
		System.out.println("Person created");
	}
	
	public Person(String name, MyDate dob) {
		super();     //compiler auto add this
		this.name = name;
		this.dob = dob;
		System.out.println("Parameterised constructur of persion");
	}
	
	public void showDetails()
	{
		
	}
	
	public void showDetails(int x)
	{
		
	}
	
//	public void showDetails(int x) //static polymorphism (compile time)
//	{
//		
//	}
	
	public void showDetails(int x,float y)
	{
		
	}
	
	public void showDetails(float x,int y)
	{
		
	}
	
	public void show()  //show method
	{
		System.out.println(name+" "+dob.getDd()+"-"+dob.getMm()+"-"+dob.getYy());
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person)
		{
			Person temp = (Person)obj;  //((Person) obj).name)-->downcasting
			
			if(this.name.equals(temp.name)
			&& this.dob.equals(temp.dob))
			  return true;
			else
			  return false;		
		}
		else
		return false;
	}
	
	
	@Override
	public String toString() {

        //String s = name+"  "+ getDob().getDd()+"/"+getDob().getMm()+"/"+getDob().getYy();
		String s = name+"  "+ dob+" ";
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	


}