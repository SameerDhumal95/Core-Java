package study.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import study.has_a.MyDate1;

public class PersonSortExample {

	public static void main(String[] args) {
		
		ArrayList<Person1> al = new ArrayList<Person1>();
		
		al.add(new Person1("Sameer",new MyDate1(1,1,2001)));
		al.add(new Person1("Milind",new MyDate1(11,4,2000)));
		al.add(new Person1("Prachi",new MyDate1(12,1,2015)));
		al.add(new Person1("Shubham",new MyDate1(15,2,1999)));
		al.add(new Person1("Rushikesh",new MyDate1(1,7,1995)));
		al.add(new Person1("Gaurav",new MyDate1(8,8,2022)));
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for default ordering , 2 for dob ordering");
		int x = sc.nextInt();
		
		if(x==1)
			Collections.sort(al); //default ordering comparable is used
		else
///////////////////////////////////////////////////////////////////////////////////////		
		Collections.sort(al, new DOBComparator()); //alternative way of ordering
		
		for(Person1 p: al)
			System.out.println(p.getName()+ "  "+p.getDob());
	}
	
}//end of class

class DOBComparator implements Comparator<Person1>
{
	public int compare(Person1 o1, Person1 o2)
	{
		return o1.getDob().compareTo(o2.getDob());
	}
}