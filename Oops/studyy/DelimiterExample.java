package studyy;

import java.util.Scanner;

public class DelimiterExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		//String s= sc.next();//delimiter is space so space is not included 
		String s = sc.nextLine(); //delimiter is new line so it includes spaces
		System.out.println(s);
		sc.close();
		//**OKAY**
	}

}