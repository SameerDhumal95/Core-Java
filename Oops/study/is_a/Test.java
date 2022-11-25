package study.is_a;

//Multilevel INHERITANCE

public class Test {
	public static void main(String[] args) {
		
	//	A obj = new A();
	//	B obj = new B();
	//	C obj = new C(100,200,300);
    //	D obj = new D();
		
	//	E obj = new E();	
	//	System.out.println(obj.a+" "+obj.b+" "+obj.c);
	
	}//end of test class
}

	class A
	{
		int a;
		A()
		{
			System.out.println("A is created");
		}
		
		A(int a) //100
		{
			this.a = a; //100
		}
	}

	class B extends A
	{
		int b;
		B()
		{
			System.out.println("B is created");
		}
		
		B(int a,int b)  //200,300
		{
			super(a);//parameters of A a //passing from child to parent  that is cascading
			this.b=b;  //300
		}
	}
	
	class C extends B
	{
		int c;
		C()
		{
			
			System.out.println("C is created");
		}
		
		C(int n1, int n2, int n3)  //100,200,300
		{
			super(n2,n3);//parameters of B a,b  //n2=200,n3=300
			this.c = n1;// n1=100
		}
		
	}
	
	class D extends C
	{
		D()
		{
			System.out.println("D is created");
		}
	}

	class E extends B
	{
		E()
		{
			System.out.println("E is created");
		}
	}
	