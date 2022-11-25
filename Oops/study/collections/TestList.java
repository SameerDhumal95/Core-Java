package study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
//		LinkedList<String> a1 = new LinkedList<String>();
//	    Stack<String> a1 = new Stack<String>();
//	    Vector<String> a1 = new Vector<String>();
		
		
		a1.add("Sameer");
		a1.add("Shubham");
		a1.add("Gaurav");
		a1.add("Milind");
		a1.add("Rushikesh");
		a1.add("Prachi");
		
		
//		for(int i = 0;i<a1.size(); i++)
//		{
//			System.out.println(a1.get(i));
//		}
//		
		
//		//Using Iterator 
//		Iterator<String> b1 = a1.iterator();
//		
//		while(b1.hasNext())
//		{
//			System.out.println(b1.next());
//		}

		//for each string in a1
        for(String str : a1)
        {
        	System.out.println(str);
        }
		
        
	}
}
