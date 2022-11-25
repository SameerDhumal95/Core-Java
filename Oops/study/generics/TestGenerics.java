package study.generics;

public class TestGenerics {

	
	public static void main(String[] args) {
		
		Object[] arr = new Object[5];
		
		arr[0] = 40;
		arr[1] = "hello";
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 'h';
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);  //this will print string as well as char and int
		}
	}
}
