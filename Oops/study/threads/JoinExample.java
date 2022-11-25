package study.threads;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th1 = new Thread(new Task(10));
		th1.start();
		
		th1.join();
		System.out.println("Job Done Thank You");
	}//end of main
}//end of join
class Task implements Runnable
{
	int range;
	Task(int r)
	{
		range = r;
	}
	@Override
	public void run() {
	
		for(int i=0;i<=range;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
