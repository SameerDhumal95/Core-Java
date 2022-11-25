package study.utilies;

public class VarArgsExample {

	public static void main(String[] args) {
		
		//add();  
		//add(12);
		//add(12,13);
		add(10,11,20,22,30,40,50);  //we can write multiple elements
		//add(new int[] {10,20,30};
//		int[] arr = new int[2];
//		arr[0]= 90; 
//		arr[1]= 100;
//		add(arr);
		
	}//end of main
	
	//example of varargs
	
	public static void add(int...a)  //variable arguments
	{
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		//	System.out.println(sum);
		}
		System.out.println(sum);
	}
}
