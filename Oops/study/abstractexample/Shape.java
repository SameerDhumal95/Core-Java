package study.abstractexample;

/*Shape
 *  |  \
 *  |   \
 *Circle  Rectangle
 */


public abstract class Shape {

	String info;
	static int y;
	
	abstract double area();

	
	public void showInfo()
	{
		System.out.println("this is a concrete method ..");
	}

}

class Circle extends Shape
{
	double radius;
	Circle(double r)  //constructure
	{
		radius =r ;
	}
	double areaOfCircle() //method
	{
		final double PI = 3.14;
		double area =  PI * radius * radius;
		return area;
	}
	@Override
	double area() {
		
		return areaOfCircle();
	}
	
}

class Rectangle extends Shape
{
	double length, breadth;
	Rectangle(double l , double b)
	{
		length = l; breadth =b;
	}
	
	double areaOfRectangle()
	{
		double area = length * breadth;
		return area;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return areaOfRectangle();
	}
	

}