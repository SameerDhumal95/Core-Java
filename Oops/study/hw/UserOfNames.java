package study.hw;

import java.util.Scanner;

public class UserOfNames {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		String []names=new String[5];
		StudentNames stud=new StudentNames(names);
		
		getMenu(stud);

	}


	public static void getMenu(StudentNames stud) {
		int choiceMenu;
		do {
			System.out.println();
			System.out.println( "1. Show All Names\n"
					+ "2. Add Name\n"
					+ "3. Get Name on Index\n"
					+ "4. Quit");
			choiceMenu = sc.nextInt();

			loopingMenu(choiceMenu,stud);
		}while(choiceMenu!=4);
	}

	public static void loopingMenu(int chMenu,StudentNames stud) {
		switch(chMenu) {
		case 1:
			stud.showAllNames();
			break;

		case 2:
			System.out.println("Enter the name: ");
			sc.nextLine();
			String str=sc.nextLine();
			stud.addNames(str);
			break;

		case 3:
			System.out.println("Enter the index: ");
			int idx=sc.nextInt();
			System.out.println("Name on "+idx+" : "+stud.getNameOnIndex(idx));
			break;

		case 4:
			break;

		default:
			System.out.println("Invalid Input.");
			break;
		}
	}
}
