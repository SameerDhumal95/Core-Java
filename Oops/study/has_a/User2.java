package study.has_a;

import java.util.Scanner;

public class User2 {

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity of books:");
		int m = sc.nextInt();
		TechnicalBook []book= new TechnicalBook[m];
		
		for(int i=0; i<m; i++)
		{
			System.out.println("Enter Book Name:");
			String n = sc.nextLine();
			
			
			System.out.println("Enter Cost:");
			double cost = sc.nextDouble();
			
			System.out.println("Enter Day:");
			int dd = sc.nextInt();
			
			System.out.println("Enter Month:");
			int mm = sc.nextInt();
			
			System.out.println("Enter Year:");
			int yy = sc.nextInt();
			
			MyDate temp =new MyDate(dd,mm,yy);
			
			System.out.println("Enter how many Authers:");
			int no = sc.nextInt();
			
			String[] authers = new String[no];
			
			System.out.println("Enter Auther Names:");
			
			for(int j=0; j<no; j++)
			{
				authers[j] = sc.next();
				
			}
			
			book[i] = new TechnicalBook(n,cost,temp,authers);
		    //sc.nextLine();//new line
		}
		
		for(TechnicalBook tb : book) //local variable tb that will take size of book
		{
			System.out.println(tb.getBookName()+" "+tb.getCost()+" "+tb.getDateOfPublication().getYy());
		
			for(String s : tb.getAuthers())
			{
				System.out.println();
				System.out.println(s+" ");
				
			}
			System.out.println();
		}
	
		sc.close();
      }

}
