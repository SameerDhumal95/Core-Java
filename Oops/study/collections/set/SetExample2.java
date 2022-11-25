package study.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		
	TreeSet<Dummy> ts = new TreeSet<Dummy>(new ID());
	ts.add(new Dummy(45,"Smaeer"));
	ts.add(new Dummy(50,"Gaurav"));
	ts.add(new Dummy(2,"anna"));
	
	Collection<Dummy> dm = Arrays.asList(new Dummy(85,"rUshikesh"),new Dummy(74,"Milind"));
	ts.addAll(dm);
	
	for(Dummy d : ts)
	System.out.println(d);
	
	}
	
}

class Dummy implements Comparable<Dummy>
{
	private int id;
	private String Name;
	
	public Dummy(int id, String Name)
	{
		this.id = id;
		this.Name = Name;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public boolean equals(Object obj) {
	    
		Dummy d = (Dummy)obj;
		if(this.getId()==d.getId() && this.getName().equals(d.getName()))
			return true;
		else 
			return false;
	}
	
@Override
public int hashCode() {
	String str = id+Name; //concatination
	return str.hashCode();
}
	
	@Override
	public String toString() {
		return "Dummy [id=" + id + ", Name=" + Name + "]";
	}


	@Override
	public int compareTo(Dummy o) {  //compareto use for String
		return this.Name.compareToIgnoreCase(o.Name);
	}
	
	
}

class ID implements Comparator<Dummy>
{

	@Override
	public int compare(Dummy o1, Dummy o2) {
		
		if(o1.getId() > o2.getId()) return 1;
		if(o1.getId() < o2.getId()) return -1;
				
		return 0;
	
	}
	
}