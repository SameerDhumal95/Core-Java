package studyy;

import java.util.Scanner;

import study.has_a.MyDate; //joint mydate class

public class SplitDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter coma separated authors:");
		String s = sc.nextLine();
		
		String[] authors = s.split(", ");
		
		for (String author : authors)
		{
			System.out.println(author);
		}
		
		System.out.println("Enter - separated date d-m-y");
		String date = sc.next();
		String[] dtarr = date.split("-");
		
		MyDate d = new MyDate(Integer.parseInt(dtarr[0]),Integer.parseInt(dtarr[1]),Integer.parseInt(dtarr[2]));
		
		System.out.println(d.getDd()+"-"+d.getMm()+"-"+d.getYy());
		sc.close();
	}
}
