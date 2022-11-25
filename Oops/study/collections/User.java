package study.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		//object is created
		ArrayList<String> list = new ArrayList<String>();  

		BirthdayList guest = new BirthdayList(list);

		int ch = 0;
		do 
		{
			System.out.println("Enter your choice:"+ 
					"\n1. Show guest list\n" +  
					"2. Remove a name\n" + 
					"3. Add a name\n" + 
					"4. Clear list\n" + 
					"5. Is the name in the list\n" + 
					"6. Total guests\n" + 
					"7. Quit");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch(ch)
			{
			case 1:
				guest.showGuestList();
				System.out.println("--------------------------------------------------");
				break;
			case 2:
				System.out.println("Enter the name to remove:");
				String name = sc.next().toUpperCase();

				if(!guest.removeAName(name))
				{
					System.out.println(name+" Not found in the list...");
				}
				
				System.out.println("--------------------------------------------------");
				break;
			case 3:
				System.out.println("Enter the name to add:");
				String name1 = sc.next().toUpperCase();
				guest.addAName(name1);
				System.out.println("--------------------------------------------------");
				break;
			case 4:
				guest.clearList();
				System.out.println("--------------------------------------------------");
				break;
			case 5:

				System.out.println("Enter the name:");
				String name2= sc.next().toUpperCase();
				if(guest.haveIAddedThisName(name2))
				{
					System.out.println("Name is present");
				}
				else
				{
					System.out.println("Not Found");
				}
				System.out.println("--------------------------------------------------");
				break;
			case 6:
				System.out.println("Total Guests:");
				System.out.println(guest.howManyPeople());
				System.out.println("--------------------------------------------------");
				break;

			case 7:
				System.out.println("You are Quit");
				System.out.println("--------------------------------------------------");
				break;

			default:
				System.out.println("Wrong Choice...");
				System.out.println("--------------------------------------------------");
				break;
			}

		}while(ch!=7);
	}
}
