package study.has_a;

public class User {

	public static void main(String[] args) {
		
		TechnicalBook b1 = new TechnicalBook();
		
		b1.setBookName("Core Java");
		b1.setCost(400);
		b1.setDateOfPublication(new MyDate(22,02,2022));
		b1.setAuthers(new String [] {"Sameer","Shubham","Prachi","Gaurav"});
		
		
		
		TechnicalBook b2 = new TechnicalBook("Thinking in Java",500, new MyDate(22,02,2022), new String [] {"Rushi","Milind"});
		
		System.out.println("year of publication of b1 ="+b1.getDateOfPublication().getYy());
		System.out.println("total authors of b2 = "+b2.getAuthers().length);
		System.out.println("total cost of both books ="+(b1.getCost() + b2.getCost()));
		
		
	}

	
}
