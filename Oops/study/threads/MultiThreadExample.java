/*package study.threads;

public class MultiThreadExample {

	public static void main(String[] args) {
		ChatThread th1 = new ChatThread();

		th1.setPriority(Thread.MAX_PRIORITY); // PlatformIndependent
		
		VideoThread th2 = new VideoThread();

		th2.setPriority(Thread.MIN_PRIORITY);

		th1.start(); //this method will create OS level thread and add it to ready queue
		th2.start(); //when the schedular will select the thread at that time run() execute

		//		th1.start();
		//		th2.run();

	}//end of main

}//end of MultiThreadExample

class ChatThread extends Thread
{
	@Override
	public void run() {

		while(true)
		{

			System.out.println("zoom chat is running"+super.getName());
			try 
			{
				Thread.sleep(1000);

			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class VideoThread extends Thread
{
	@Override
	public void run() 
	{

		while(true)
		{
			System.out.println("zoom video is running");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{

				e.printStackTrace();
			}
		}

	}
}
*/
//package study.threads;
//
//public class MultiThreadExample {
//
//	public static void main(String[] args) {
//		ChatThread th1 = new ChatThread();
//		VideoThread th2 = new VideoThread();
//		
//		th1.start(); //this method will create OS level thread and add it to ready queue
//		th2.start(); //when the schedular will select the thread at that time run() execute
//
//	}//end of main
//
//}//end of MultiThreadExample
//
//class ChatThread extends Thread
//{
//	@Override
//	public void run() {
//	
//		while(true)
//			System.out.println("zoom chat is running");
//	
//	}
//}
//
//class VideoThread extends Thread
//{
//	@Override
//	public void run() {
//	
//		while(true)
//			System.out.println("zoom video is running");
//	
//	}
//}



