package study.collections;

import java.util.Comparator;
import java.util.TreeSet;
public class SetExample2 {
	public static void main(String[] args) {
		TreeSet<Dummy> ts = new TreeSet<Dummy>(new IDOrdering());//new IDOrdering()); //ordering id
		ts.add(new Dummy(1,"AA"));
		ts.add(new Dummy(19,"JJA"));
		ts.add(new Dummy(21,"BB"));
		ts.add(new Dummy(5,"KKK"));
		
		
		for(Dummy d :ts)
			System.out.println(d);		
	}
}


class Dummy  implements Comparable<Dummy>
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	@Override
	public int compareTo(Dummy o) {
	
		return this.name.compareTo(o.name);
	}
	public Dummy(int i,String s)
	{
		id =i;
		name=s;
	}
	
	@Override
	public int hashCode() {  
		String x = id+name; //returning a unique no. that is hashcode
		return x.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		Dummy d = (Dummy)obj;
		if(d.id==this.id  && d.name.equals(this.name))
			return true;
		else
		return false; 
	}
	
	@Override
	public String toString() {
	
		return id+" "+name;
	}
}//end of Dummy

class IDOrdering implements Comparator<Dummy>
{
	@Override
	public int compare(Dummy o1, Dummy o2) {
	      if(o1.getId() > o2.getId()) return 1;
	      if(o1.getId() < o2.getId()) return -1;
	      else
		return 0;
	}
}





