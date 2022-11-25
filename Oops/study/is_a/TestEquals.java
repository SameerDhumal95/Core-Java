package study.is_a;

import study.has_a.MyDate;

public class TestEquals {

	
	public static void main(String[] args) {
		
		/*TechnicalBook tb1 = new TechnicalBook("Core Java",500,new MyDate(12,12,2012),new String[] { "AAA","BBB"});
		TechnicalBook tb2 = new TechnicalBook("Core Java",500,new MyDate(12,12,2012),new String[] { "AAA","BBB"});
		//TechnicalBook tb2 = new TechnicalBook("Core Java",300,new MyDate(12,12,2012),new String[] { "AAA","BBB"});
                            		
        if(tb1.equals(tb2))
        {
	       System.out.println("Same");
        }
        else
        	System.out.println("Different");*/
		
		
        
        /*Patient P1 = new Patient("Sameer",new MyDate(14,6,1995), "O+", "77", "97");
        Patient P2 = new Patient("Sameer",new MyDate(14,6,1995), "O+", "77", "97");
        
        if(P1.equals(P2))
        {
	       System.out.println("Same");
        }
        else
        	System.out.println("Different");*/
        		
        
       /* Employee E1 = new Employee("Sameer",new MyDate(14,06,1995), 15, 60000,"Software");

        Employee E2 = new Employee("Sameer",new MyDate(14,06,1995), 15, 60000,"Software");
       
        if(E1.equals(E2))
        {
	       System.out.println("Both are Same Employee");
        }
        else
        	System.out.println("Both are Different Employee");
        */
		
		PartTimeEmployee P1 = new PartTimeEmployee("Sameer", new MyDate(14,6,1995), 15, 60000, "Software", 9);
		PartTimeEmployee P2 = new PartTimeEmployee("Sameer", new MyDate(14,6,1995), 15, 60000, "Software", 9);
		
		if(P1.equals(P2))
		{
			System.out.println("Same Employee");
		}
		else
		{
			System.out.println("Different Employee");
		}
		
		/*MyDate birthDayofJeetu = new MyDate(12,12,2012);
		//MyDate birthDayofNeetu = birthDayofJeetu;
		//MyDate birthDayofNeetu = new MyDate(1,1,2001);
		MyDate birthDayofNeetu = new MyDate(12,12,2012); //this will give wrong output so we need 
		
		if(birthDayofJeetu.equals(birthDayofNeetu))
			System.out.println(birthDayofJeetu+ " is same as "+birthDayofNeetu);
		else
			System.out.println(birthDayofJeetu+ " is different from "+birthDayofNeetu);*/
	}
}
