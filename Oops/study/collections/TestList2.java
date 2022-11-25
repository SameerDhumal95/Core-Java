package study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList2 {

	public static void main(String[] args) {
		//ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> al = new LinkedList<String>();
		//Stack<String> al = new Stack<String>();
		//Vector<String> al = new Vector<String>();
		
		al.add("red");
		al.add("yellow");
		al.add("green");
		al.add("blue");
		//al.iterator();
		
	  //showElements(al);
	    
	    al.remove(1);  //remove by index
	    //al.remove("blue"); //remove by matching object
	    //try other remove methods here
	    System.out.println("after removing");
	    showElements2(al);
	    
	   showElements3(al);

	    //System.out.println("green is in the list " + al.contains("green"));
	    
	}
	
	public static void showElements(List<String> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public static void showElements2(List<String> list)
	{
		for(String s: list)
			System.out.println(s);
	}
	
	
	public static void showElements3(List<String> list)
	{
		Iterator<String>  iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}	

}