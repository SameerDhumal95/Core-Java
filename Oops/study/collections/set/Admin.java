package study.collections.set;

public class Admin {
	public static void main(String[] args){
		Users log1=new Users();
		
		log1.addUser("Shubham", "PShubham");
		log1.addUser("Sam", "PSam");
		log1.addUser("Anna", "PAnna");
		log1.addUser("Amy", "PAmy");
		log1.addUser("Bob", "PBob");
		
		log1.showAllUserName();
		String Pwd=log1.getPassword("Shubham");
		
		System.out.println(Pwd);
		
		try {
			log1.changePassword();
		} catch (UnAuthorisedException e) {
			System.out.println(e);
		}
		
		try {
			log1.removeEntry("Shubham", "PShubham");
		} catch (UnAuthorisedException e) {
			System.out.println(e);
		}
		log1.showAllUserName(); 

	}
}
