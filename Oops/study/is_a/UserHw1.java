package study.is_a;

import study.has_a.MyDate;

public class UserHw1 {
      
	
	public static void main(String[] args) {
		
		Patient P = new Patient();
		System.out.println(P); ///default
		
		Patient P1 = new Patient("Sameer",new MyDate(14,06,1995),"O+","98","79");
		System.out.println(P1); //parameter passed
		
		System.out.println("Patient Name: "+P1.getName()+"\n"+"Blood Group : "
		+P1.getBloodGroop()+"\n"+"Heart Rate : "+P1.getHeartRate());
	
	}
}
