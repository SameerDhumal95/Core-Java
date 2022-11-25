package study.hw;

import java.util.Scanner;

import study.has_a.Bank;

public class Looping {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		getMenu();
		
	}

	public static boolean checkNum(String num) 
	{
		int count=0;
		for(int i=0;i<num.length();i++) {
			if(Character.isDigit(num.charAt(i))) {
				count++;
			}
		}
		if(count==num.length()) {
			return true;
		}
		else {
			return false;
		}
	}

	//getMenu Method
	public static void getMenu() 
	{
			int choiceMenu;
			do {
				System.out.println();
				System.out.println("****Menu****\r\n"
						+ "1. Deposit\n"
						+ "2. Withdraw\n"
						+ "3. Show Balance\n"
						+ "4. Quit");
				choiceMenu = sc.nextInt();
				//switch case in loop menu
				loopingMenu(choiceMenu);
			}while(choiceMenu!=4);
	}
	
	public static void loopingMenu(int chMenu) {
		String num;
		int amt=1;
		switch(chMenu) {
			case 1:
				num=getAmt();
				if(checkNum(num)) {
				amt=Integer.parseInt(num);
				int val=Bank.deposit(amt);
				System.out.println("Amount "+val+" deposited");}
				else {
					System.out.println("Invalid Amount Entered");
				}
				break;

			case 2:
				num=getAmt();
				if(checkNum(num)) {
				amt=Integer.parseInt(num);
				int val=Bank.withdraw(amt);
				if(val<0)
					System.out.println("Minimum Balance should be $100");
				
				else
					System.out.println("Amount "+val+" withdrawed");	
				
				}
				else 
				System.out.println("Invalid Amount Entered");
				break;

			case 3:
				Bank.showBalance();
				break;

			case 4:
				break;

			default:
				System.out.println("Invalid Input.");
				break;
			}
		}
	
	public static String getAmt() {
		System.out.println("Enter the Amount: ");
		String num=sc.next();
		return num;
	}
}

