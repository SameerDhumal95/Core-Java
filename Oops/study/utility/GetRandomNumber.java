package study.utility;

import java.util.Random;

public class GetRandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(119);  //1-119
		//int x = random.nextInt(100-25)+25;//25-100
		System.out.println("Next answer should be given by roll number: \n"+x);
	}
}
