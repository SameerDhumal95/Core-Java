package String;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		int i = wordcount(str);
		System.out.println("No.of words in string: "+i);
		
	}
	
	public static int wordcount(String str)
	{
		int count = 0;
		
		char[] ch= new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
			if((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')||((ch[0]!=' ')&&(i==0)))
			count++;
		
           
		}
		return count;
	}
}
