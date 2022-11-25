package study.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt",true);
		ObjectOutputStream oout = new ObjectOutputStream(fout);	
		//Object obj =new Object();
		
		Data obj = new Data();
		obj.value=100;
		obj.desc ="century";
		oout.writeObject(obj);
		 obj = new Data();
		obj.value=200;
		obj.desc ="double century";
		oout.writeObject(obj);

		oout.flush();
		oout.close();
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Sameer-PC\\OneDrive\\Desktop\\Core Java\\Poem.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		while(true) {
		try {
		Object obj2 = oin.readObject();
		System.out.println(obj2);
		}catch(EOFException eof)
		{
			System.out.println("file reading completed");
			break;
		}
		}
		
		
	}
}//end of SaveObjects

class Data  implements Serializable
{
	int value;
	String desc;
	
	@Override
	public String toString() {
	
		return value+" "+desc;
	}
}