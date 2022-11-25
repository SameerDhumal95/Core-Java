package study.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BirthdayList {

	ArrayList<String> guest;  //reference 
	
	public BirthdayList(ArrayList<String> list) //constructor
	{
		
	this.guest = list;
		
	}

	public void showGuestList()
	{
		Iterator<String> itr = guest.iterator(); //???
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public int howManyPeople()
	{
		//returns the number of elements in this list.
		return guest.size();
	}
	
	public void addAName(String name)
	{
		//appends the specified element to the end of this list.
		guest.add(name);
	}
	

	boolean removeAName( String name)
	{
		//removes the first occurrence of the specified element from this list.
		return guest.remove(name);
	}
	
	
	
	public void clearList()
	{
		//removes all of the elements from this list. 
		guest.clear();
	}
	
	boolean haveIAddedThisName(String name)
	{
		//Returns true if this list contains the specified element.
		return guest.contains(name);
	}
}

