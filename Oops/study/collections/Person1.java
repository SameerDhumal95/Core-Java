package study.collections;

import study.has_a.MyDate1;

public class Person1 implements Comparable<Person1> {
		
		private String name;
		private MyDate1 dob; //another class 
		
		
		/* Constructure of person class call first because it is superclass
	         person1
	           |
	         Employee
	           |
	         UserHw1	
	    */
		public int compareTo(Person1 o)
		{
			//we have to decide the basic 
			return  this.name.compareTo(o.name);
			
		}
		
		public Person1()
		{
			//System.out.println("Person created");
		}
		
		public Person1(String name, MyDate1 dob) {
			super();     //compiler auto add this
			this.name = name;
			this.dob = dob;
			//System.out.println("Parameterised constructur of persion");
		}
		
		public void show()  //show method
		{
			System.out.println(name+" "+dob.getDd()+"-"+dob.getMm()+"-"+dob.getYy());
		}
		
		@Override
		public boolean equals(Object obj) {
			
			if(obj instanceof Person1)
			{
				Person1 temp = (Person1)obj;  //((Person) obj).name)-->downcasting
				
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

		public MyDate1 getDob() {
			return dob;
		}

		public void setDob(MyDate1 dob) {
			this.dob = dob;
		}
		


	}

