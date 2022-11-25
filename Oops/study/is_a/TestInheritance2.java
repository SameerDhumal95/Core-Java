package study.is_a;

public class TestInheritance2 {

	public static void main(String[] args) {
		
		test(new Beta());
		
		/**okay***/
		//test(new Alpha()); //Alpha cannot cast to Beta
//		test(new Theta());
//		test(new Gama());
		test(new Delta());
//		
	}
	
	//passing base class - allow all object of the hirerchy to be passed 
public static void test(Alpha obj)  //we can pass beta,gama,theta
{
	obj.f1();
	obj.fa();
	//obj.fb();  //compile time me nahi man raha
	//if(obj instanceof Beta)
	((Beta)obj).fb(); //agar compile time me nahi ho raha to hum use downcast karke manva lete he
}

}
