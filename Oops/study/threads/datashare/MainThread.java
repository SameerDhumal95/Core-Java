package study.threads.datashare;

public class MainThread {
	public static void main(String[] args) {
		
		Account a = new Account(5000);
		DepositThread th1 = new DepositThread(a);
		WithdrawThread th2 = new WithdrawThread(a);
		
		th1.start();   //race condition on both the thread
		th2.start();
		
	}

}//end of MainThread class


class DepositThread extends Thread
{
	private Account acct;
	
	public DepositThread(Account a) { this.acct =a; }
	
	public void run()
	{
		int counter=5;
		while(counter-- > 0)
		{
			acct.deposit(500);
			acct.showBalance();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class WithdrawThread  extends Thread
{
	private Account acct;
	
	public WithdrawThread(Account a) { this.acct =a; }

	public void run()
	{
		int counter=5;
		while(counter-- > 0)
		{
			acct.withdraw(100);
			acct.showBalance();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}