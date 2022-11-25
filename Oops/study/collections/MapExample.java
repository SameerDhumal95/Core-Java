package study.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		
		//natural ordering sorted
		//TreeMap<Integer, String> hm = new TreeMap<Integer, String>(); //sorted output
		
		//bucket order of hashing
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//preserves insertion order
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(12,"prachi");
		hm.put(1,"sadhana");
		hm.put(10,"suruchi");
		hm.put(4,"nehal");
		hm.put(12,"praneet");//overwrite the earlier value 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a roll number");
//		
		System.out.println("the name is "+hm.get(sc.nextInt()));
		
		Set<Integer> set = hm.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String value = hm.get(key);
			System.out.println(key+"  "+value);
		}	
	}
}