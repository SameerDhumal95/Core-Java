package study.hw;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Message []msg = new Message[5];
		
		msg[0]=new Message("Sameer", "Shubham", "Kiti zal study?", new Address("Pen","Raigad","Maharashtra",402107));
		msg[1]=new Message("Gaurav","Pritam","Merko nahi samjha...firse batao", new Address("Bhandup","Mumbai","Maharashtra",400078));
		msg[2]=new Message("Milind","Ajeet", "Gym la yeto ka?", new Address("Shahapur","Thane","Maharashtra",421061));
		msg[3]=new Message("Rushikesh","Alice",	"Udat gelis...",new Address("Pimpri","Pune","Maharashtra",400080));
		msg[4]=new Message("Prachi","ken","Mala tention aalay ata..", new Address("TollPlaza","Karad","Maharashtra",421065));

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the city name:");
		
		String cityName=sc.nextLine();
		
		Message.getMsg(cityName,msg);
		
		sc.close();
	}

}

