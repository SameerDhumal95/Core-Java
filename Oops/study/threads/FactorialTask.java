package study.threads;

public class FactorialTask implements Runnable{

	@Override
	public void run() {
		long fact=1;
			for(int i=1; i<=10;i++)
			{
				
				fact=fact*i;
				System.out.println("factorial of Number "+i+ "is: "+fact);
			}
		
	}
}
