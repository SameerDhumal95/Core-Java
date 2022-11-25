package study.threads;


import java.util.Date;
public class DaemonExample {
	public static void main(String[] args) throws InterruptedException {
		Time th =new Time();
	//	th.setDaemon(true);  //we want the time thread to finish when non-dameon threads are over
		th.start();
		for(int i=0;i<10;i++)
		{	System.out.println("main thread "+i*i);
			Thread.sleep(1000);
		}
	}
}//end of daemon example class
class Time extends Thread
{	@Override
	public void run() {	
	 while(true) {
		 System.out.println(new Date()); //toString of Date is called
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		 
	}
}

