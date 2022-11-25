
package Bingo.Assignment;

import java.util.Scanner;

public class Play {	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		startPlay();
	}

	public static void startPlay()
	{
		Game gm=new Game();
		int chance = gm.getChances();
		//System.out.println("Guess any number");
		do
		{
			System.out.println("Enter number between 0 to 20");
			int number = sc.nextInt();	
			int randomNo = gm.isMatching(number);
			if(randomNo==0)
			{
				System.out.println("congratulations you won !!");
				System.out.println("would you love to play again? \n if yes enter 1 or press any key to exit");
				int choice = sc.nextInt();
				if(choice==1)
				{
					startPlay();
				}
				else
				{
					System.out.println("See you again-well played");
					break;
				}
			}
			else if(randomNo==1)
			{
				System.out.println("lesser number is expected");
				gm.setChances(--chance);
			}
			else {
				System.out.println("greater No is expected");
				gm.setChances(--chance);
			}
			if(randomNo!=0)
			{
				if(chance==0)
				{
					System.out.println("Game over :( ");
					System.out.println("would you love to play again? \n if yes enter 1 or press any number to exit");
					int choice = sc.nextInt();
					if(choice==1)
					{
						startPlay();
						chance=gm.getChances();
					}				
				}	System.out.println("No. Of chances left: "+chance);			
			}
		

		}while(chance!=0);
	}

}
