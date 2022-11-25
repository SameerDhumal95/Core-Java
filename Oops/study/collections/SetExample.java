package study.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(45);
//		ts.add(3);
//		ts.add(12);
		
		Collection<Integer> ints = Arrays.asList(45,3,12,1,99,65,78,2,21);
		//shortcut way to write every element
		
		ts.addAll(ints); //inorder
		
		for(Integer i :ts)
		{
			System.out.print(i +", ");
		}
	}
}
