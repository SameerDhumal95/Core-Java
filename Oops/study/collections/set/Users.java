package study.collections.set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Users {
	TreeMap<String, String> userInfo=new TreeMap<>();
	
	public void addUser(String uName,String pwd) {
		userInfo.put(uName, pwd);
	}
	
	public void showAllUserName() {
		Set<String> user=userInfo.keySet();
		Iterator<String> iter=user.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			
			System.out.println("Name: "+key);
		}
	}
	
	public String getPassword(String uname) {
		Set<String> user=userInfo.keySet();
		Iterator<String> iter=user.iterator();
		String str=null;
		while(iter.hasNext()) {
			String key=iter.next();
			
			if(key.equals(uname)) {
				str=userInfo.get(key);
			}
		}
		return str;
	}
	
	public void changePassword() throws UnAuthorisedException {
		System.out.println("Enter UserName: ");
		Scanner sc=new Scanner(System.in);
		String uname=sc.next();
		
		System.out.println("Enter UserName: ");
		String pwd=sc.next();
		
		Set<String> user=userInfo.keySet();
		Iterator<String> iter=user.iterator();
		int flag=0;
		while(iter.hasNext()) {
			String key=iter.next();
			
			if(key.equals(uname) && userInfo.get(key).equals(pwd)){
				System.out.println("Enter New Password: ");
				String nPwd=sc.next();
				flag=1;
				userInfo.replace(key, nPwd);
			}
		}
		if(flag==0) {
			throw new UnAuthorisedException();
		}
	}
	
	public void removeEntry(String uname,String pwd) throws UnAuthorisedException {
		Set<String> user=userInfo.keySet();
		Iterator<String> iter=user.iterator();
		int flag=0;
		while(iter.hasNext()) {
			String key=iter.next();
			
			if(key.equals(uname) && userInfo.get(key).equals(pwd)){
				flag=1;
				userInfo.remove(key);
			}
		}
		if(flag==0) {
			throw new UnAuthorisedException();
		}
	}
	
	
}

class UnAuthorisedException extends Exception{
	public UnAuthorisedException() {
		super("Invalid UserName and Password");
	}
}
