package study.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

	class TableThread extends Thread
	{
		@Override
		public void run() {
			
			try {
				appendTable();
			} catch (Exception e) { }
		}
		private void appendTable() throws IOException
		{
			              FileOutputStream fs1=new FileOutputStream("D:\\CoreJava\\Table.txt",true); // append
			              PrintWriter pw=new PrintWriter(fs1);
			              for(int i=2;i<=20;i++)
			              {
			            	  for(int j=1;j<=10;j++)
			            	  {
			            		  pw.println((i+"*"+j +" = "+i*j));
			            	  }
			                        pw.println("........................");
			              }
			              pw.println("TABLE OF 2 COMPLETED");
			              pw.close();
			              fs1.close();
			              
			              
		}
	}
	 
	class SquareTableThread extends Thread
	{
		@Override
		public void run() {
			
			Scanner sc=new Scanner(System.in);
			
			try {
				for(int i=1;i<=2;i++)
				{
				 System.out.println("enter number");
			        
			        int num=sc.nextInt();
				printSquare(num);
				
				}
			} catch (Exception e) { 	}
		}
		
		private void printSquare(int num) throws IOException
		{
	        FileOutputStream fs1=new FileOutputStream("D:\\CoreJava\\Table.txt",true); // append
	        PrintWriter pw=new PrintWriter(fs1);
	        
	        for(int i=1;i<=10;i++)
	        {
	        	pw.println((num+" raise to "+i +" =" + Math.pow(num, i)));
	        }
	        pw.println("....................................");
	        pw.close();        
	        fs1.close();
		
	}
	}



	public class Tablemain {

		public static void main(String[] args) throws InterruptedException {
		                TableThread th1=new TableThread();
		                SquareTableThread th2=new   SquareTableThread();
		                th1.start();
		                th2.start();
		                //th1.join();
		               // th2.join();
		               // System.out.println("end of main thread");
	                                       
		}

	}


