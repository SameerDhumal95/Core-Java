package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt");
	    Scanner sc = new Scanner(fin); //connected with file
	    
	    
	    while(sc.hasNextLine()) {
	    String filedata = sc.nextLine();
	    System.out.println(filedata);
	    }
	
	}
}
