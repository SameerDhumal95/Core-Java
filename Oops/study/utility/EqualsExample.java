package study.utility;

public class EqualsExample {

	public static void main(String[] args) {
		Dummy2 obj1 = new Dummy2(12,"Prachi");
		//Dummy2 obj2 = obj1;
		Dummy2 obj2 = new Dummy2(12,"Prachi");
		
		System.out.println("Equals result = "+ obj1.equals(obj2));
		System.out.println("hashcode of obj1 = "+obj1.hashCode());
		System.out.println("hashcode of obj2 = "+obj2.hashCode());
			
	}
} //end of main class


class Dummy2
{
	private int rollnumber;
	private String name;
	
	
	@Override
	public int hashCode() {//hash code generator for violating the contract(not mandatory)
		
		return rollnumber;  //according to rules roll numbers are unique
		//we have putting unique value as roll no. so this we voilating the contract
	}
	
	@Override
	public boolean equals(Object obj) {
		Dummy2 temp = (Dummy2)obj;
		if(temp.rollnumber==this.rollnumber  && temp.name.equals(this.name))
		return true;
		else 
			return false;
	}
	
	public Dummy2(int x ,String n)
	{
		rollnumber=x;  name=n;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}