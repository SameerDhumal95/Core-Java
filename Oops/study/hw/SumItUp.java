package study.hw;

import java.util.Scanner;

public class SumItUp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number(use - as separator)");
		String str=sc.nextLine();
		String []strNum=str.split("-");
		
		int sum=0;
		for(String num:strNum) {
			sum=sum+Integer.parseInt(num);
		}
		
		System.out.println("Sum of Entered Numbers: "+sum);
		sc.close();
	}
}
