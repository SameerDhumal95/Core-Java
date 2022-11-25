package study.threads.datashare;

public class Account {
	private int balance;
	
	public Account(int bal) { this.balance = bal; }
	
	//THREAD  SAFE method  = synchronized method
	public  void deposit(int amt)
	{
		synchronized(this) {
		balance += amt;  //balance = balance + amount
		}
	}

	//THREAD SAFE method
	public  void withdraw(int amt)
	{
		//synchronized block 
		synchronized(this)
		{
		balance-=amt;  //balance = balance - amount
		}
	}
	
	public void showBalance()
	{
		System.out.println("current balance="+balance);
	}
}