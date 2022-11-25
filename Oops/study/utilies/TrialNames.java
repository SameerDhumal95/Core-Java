 package study.utilies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrialNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name comma separated");
		String name = sc.next();
		//Spliting using api we can add multiple name separated by ,
		String[] arrnames = name.split(","); 
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Yellow");
		
		//Adds all of the specified elements to the specified collection.
		Collections.addAll(al, arrnames);
		
		for(String s : al)
		{
			System.out.println(s);
		}
		sc.close();
	    //topmost or max element in list
		String m = Collections.max(al);
		System.out.println("Max= "+ m); //that will show newest added element on top
	
		
	    System.out.println("after shuffing:");
	    //shuffling
	    
	    Collections.shuffle(al);
	    for(String s : al)
		{
			System.out.println(s);
		}
		
	}
}
