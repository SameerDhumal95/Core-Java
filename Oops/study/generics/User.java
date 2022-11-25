package study.generics;

import study.has_a.MyDate;

public class User {
	public static void main(String[] args) {
         
		Integer[] arr = new Integer[3];
		
		//integer is the actual type parameter
		MyStack<Integer> stack = new MyStack<Integer>(arr);
		stack.push(20);
		stack.push(30);
		stack.push(40);   //accepts only and only integer that not allow string or other 
		//stack.push("40");  // not allowed
		
		add(stack);

		//mydate is the actual type parameter
		MyStack<MyDate> stack2 = new MyStack<MyDate>(new MyDate[2]);
		stack2.push(new MyDate(1,1,2000));
		
		
		//Thread is the actual type parameter
		MyStack<Thread> stack3 = new MyStack<Thread>(new Thread[2]);
		stack3.push(new Thread());
	}

	private static void add(MyStack<Integer> st) {
		
		int sum =0;
		
		sum = sum + (Integer)st.pop();  //casting to integer//autoboxing

		sum = sum + (Integer)st.pop();

		sum = sum + (Integer)st.pop();
		
		System.out.println("sum = "+sum);
		
	}
}
