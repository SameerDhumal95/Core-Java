package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextToFile {

	public static void main(String[] args) throws FileNotFoundException {
		//file is opening in overwrite mode
		//FileOutputStream fout = new FileOutputStream("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt");


		//Opening the file in append mode
		boolean append = true;
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt",append);

		PrintWriter pw = new PrintWriter(fout);

		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.println("enter the string to copy in file");
			String input =sc.nextLine();

			if(input.equalsIgnoreCase("quit"))   
				break;

			pw.println(input);
			pw.flush();
		}             //buffer to hardisk me copy hota he
		pw.close();//close the buffer /release
	}
}
