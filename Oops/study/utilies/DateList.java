package study.utilies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import study.has_a.MyDate1;  //No need to create new MyDate we only add a method

public class DateList {

	public static void main(String[] args) {
		
		ArrayList<MyDate1> al =new ArrayList<MyDate1>();
		
		al.add(new MyDate1(1,1,2022));

		al.add(new MyDate1(15,8,1947));

		al.add(new MyDate1(26,1,2021));

		al.add(new MyDate1(31,12,1950));

		al.add(new MyDate1(5,5,2022));
		
		System.out.println("Before Sorted ....");
		
		show(al);
		
		System.out.println();
		
		Collections.sort(al);
        
		System.out.println("After Sorted Dates are...");
	    
		show(al);
	}
	
	public static void show(List<MyDate1> list)
	{
		Iterator<MyDate1> itr = list.iterator();
		while(itr.hasNext())  //that will check next
			System.out.println(itr.next());
	}
}
