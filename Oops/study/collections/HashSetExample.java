package study.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		//entry/insertion ordering
		//LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		//sorted 
		//TreeSet<Integer> hs = new TreeSet<Integer>();
		
		//hashing order
		HashSet<Integer> hs = new HashSet<Integer>();
		//hs.add(e)
		Collection<Integer> ints =Arrays.asList(45,3,12,1,99,65,78,2,21,99);
		hs.addAll(ints);
		
		for(Integer i:hs)
			System.out.println(i);

	}

}