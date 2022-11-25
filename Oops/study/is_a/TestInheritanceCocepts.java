package study.is_a;

public class TestInheritanceCocepts {

	public static void main(String[] args) {
		
//		Alpha obj = new Alpha(); //only fa                    Alpha
//		Beta obj = new Beta();  //fa fb                         |
//		Theta obj = new Theta(); //fa fb fc                   Beta
//		Gama obj = new Gama();   //fa  fb fc fd                 |   \
//		Delta obj = new Delta();  //                          Theta  Delta 
//		                                                        |
//	                                                          Gama

//		Theta obj = new Gama();
//		Beta obj = new Delta();//fa//fb
//		obj.fa();
//		obj.fb();
//		obj.fe();
//		((Delta)obj).fe();
//     	((Beta)obj).fb();
// 	    obj.fc();
// 	    obj.fd();
//		((Gama)obj).fd();
//		obj.f1();
		
//		Alpha obj2 = new Gama();
//		if(obj2 instanceof Theta)
//		((Theta)obj2).fc();
//		
//		System.out.println("end");
		
		
//		((Beta)obj).fa(); //downcasting user dependent  //polymorphic call
		//obj.fd();
		
/*		//for ALPHA
		doJob1(new Alpha()); //Alpha o = new Alpha(); //upcasting alternative way
		doJob1(new Beta());  //Alpha o = new Beta();  
		doJob1(new Theta()); //Alpha o = new Theta();
		doJob1(new Delta()); //Alpha o = new Gama();
		doJob1(new Gama());  //Alpha o = new Delta();
*/		
		
/*		//for BETA

		doJob2(new Beta()); //Beta o = new Beta();
		doJob2(new Theta());//Beta o = new Theta();
		doJob2(new Delta()); //Beta o = new Gama();
		doJob2(new Gama());  //Beta o = new Delta();		
		//doJob2(new Alpha());  //no call alpha
*/	
		
/*		//for THETA
//				
		doJob3(new Theta());//Theta o = new Theta();
//		doJob3(new Delta()); //Theta o = new Delta(); not possible no subclass of theta
		doJob3(new Gama());  //Alpha o = new Delta();		
//	    doJob3(new Alpha());  //no call alpha 
*/		
		//for Gama
		
//		doJob4(new Gama());
//		
//		//for Delta
//		
//		doJob5(new Delta());
  
/*************************************************************************/
		
	
	}  //end of main class

public static void doJob1(Alpha obj) //passing Alpha obj to doJob1 ONLY access functions in Alpha
{
	obj.fa();
}

public static void doJob2(Beta obj)
{
	obj.fa();
	obj.fb();
}

public static void doJob3(Theta obj)
{
	obj.fa();
	obj.fb();
	obj.fc();
}

public static void doJob4(Gama obj)
{
	obj.fa();
	obj.fb();
	obj.fc();
	obj.fd();
}

public static void doJob5(Delta obj)
{
	obj.fa();
	obj.fb();
		
}
}

class Alpha
{
	void fa()
	{
		System.out.println("Alpha");
	}
	
	void f1()
	{
		System.out.println("f1 of Alpha");
	}
}

class Beta extends Alpha
{
	void fb()
	{
		System.out.println("Beta");
	}
	
	void f1()
	{
		System.out.println("f1 of Beta");
	}
}

class Theta extends Beta
{
	void fc()
	{
		System.out.println("Theta");
	}
	
	@Override
	void f1() {
		
		System.out.println("f1 of theta");
	}
}

class Gama extends Theta
{
	void fd()
	{
		System.out.println("Gama");
	}
}

class Delta extends Beta
{
	void fe()
	{
		System.out.println("Gama");
	}
}

