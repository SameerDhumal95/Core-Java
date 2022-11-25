package study.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaderExample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fin = new FileReader("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt");
		BufferedReader reader = new BufferedReader(fin);
		
		while(true) {
		String filedata = reader.readLine();
		
		if(filedata == null)  //if file data ==null 
			break;
		System.out.println(filedata);
		}	
	}
}