package study.generics;
//Formal type parameter = placeholder
public class MyStack<P> {   //placeholder

	private P[] arr;
	private int top = -1;
	
	public MyStack(P[] a)
	{
		arr = a;
	}
	
	public void push(P obj)
	{
		top++;
		arr[top] = obj;
	}
	
	public P pop()
	{
		return arr[top--];
	}
	
	public void show()
	{
		for(P obj:arr)
		System.out.println(obj);
	}
	
}
