package study.threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		TableGenerationTask task1 = new TableGenerationTask();
		
		Thread thread1 = new Thread(task1);
		
	//	thread1.start(); //starting the thread task
	
	//	thread1.join();  //round robin time slice
		
		////Homework Factorial Thread using runnable method
		FactorialTask task2 = new FactorialTask();
		
		Thread thread2 = new Thread(task2);
		
		thread2.start();
		
		thread2.join();
		thread1.start(); //starting the thread task
	}
}

/*   Runnable
         |
         |is a       \ 
      Thread --->  Runnable 
         |      uses
         | is a
    Chat Thread
*/