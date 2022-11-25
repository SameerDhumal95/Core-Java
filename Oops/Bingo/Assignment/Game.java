package Bingo.Assignment;

import java.util.Random;

public class Game
{
	private int hiddenNumber;
	private int chances;

	public Game()			
	{
		Random num = new Random();
		int x = num.nextInt(20);
		this.hiddenNumber=x;
		this.chances=5;

	}
	public int getHiddenNumber() {
		return hiddenNumber;
	}

	public void setHiddenNumber(int hiddenNumber) {
		this.hiddenNumber = hiddenNumber;
	}

	public int getChances() {
		return chances;
	}

	public void setChances(int chances) {
		this.chances = chances;
	}


	public int isMatching(int GuessNum)
	{
		if(GuessNum==this.hiddenNumber)
			return 0;
		if(GuessNum>this.hiddenNumber)
			return 1;
		else
			return -1;

	}


}

