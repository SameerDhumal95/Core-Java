package study.has_a;

import java.util.Scanner;

public class User3 {

	public static void main(String[] args) 
	{
	   TechnicalBook[] arr = new TechnicalBook[2];
	   Scanner sc=new Scanner(System.in);
	   
	   for(int i=0; i<arr.length; i++)
	   {
		   System.out.println("Enter name of book :"+(i+1));
		   String name=sc.nextLine();

		   System.out.println("Enter cost:");
		   int cost=sc.nextInt();
		   
		   System.out.println("Enter - seperated date:");
		   String date=sc.next(); //12-12-2012
		   
		   String[] dtArr=date.split("-"); //It creates an array of Date ...{d,m,y}
		   MyDate d = new MyDate(Integer.parseInt(dtArr[0]),Integer.parseInt(dtArr[1]),Integer.parseInt(dtArr[2]));
		  
		   
		   System.out.println("Enter comma seperated authors:");
		   sc.nextLine();
		   
		   String a=sc.nextLine();
		   
		   String[] authorArr=a.split(",");
		   
		   arr[i]=new TechnicalBook(name, cost, d, authorArr);
		   System.out.println();
		      
	   }//for close
	   System.out.println();
	   
	   System.out.println("Books are:");
	   for(TechnicalBook tb : arr)  //for each technical book tb in books
		{
			System.out.print("Book Name: "+tb.getBookName()+" ,Cost: "+tb.getCost()+" ,"+"Year: "+tb.getDateOfPublication().getYy()+" ");

			System.out.print(", Authers are: ");
			for(String s : tb.getAuthers())  //for each string s in tb.getAuthors
			{
				System.out.print(s+"  ");
			}
			System.out.println();
		}

		sc.close();

	}

}
