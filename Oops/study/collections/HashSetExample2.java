package study.collections;

import java.util.HashSet;

public class HashSetExample2 {
	

		public static void main(String[] args) {
			HashSet<Dummy> ts = new HashSet<Dummy>();
			
			ts.add(new Dummy(1,"AA"));
			ts.add(new Dummy(19,"JJA"));
			ts.add(new Dummy(21,"BB"));
			ts.add(new Dummy(5,"KKK"));
			ts.add(new Dummy(19,"JJA"));
			//added becaues two different object address
			for(Dummy d :ts)
				System.out.println(d);	

		} 

	
}
