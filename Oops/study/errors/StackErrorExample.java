package study.errors;

public class StackErrorExample {

	public static void main(String[] args) {
	
		f1();
	
	}
	
	public  static void f1()
	{
		System.out.println("hi");
		f1();    //that will goes into infinite loop but after that on point program will crash and shows the StackOverflow
	}
}