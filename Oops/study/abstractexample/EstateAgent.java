package study.abstractexample;


public class EstateAgent {

	public static void main(String[] args) {
		
		    //showCostOfPlot(new Shape());
		  //showCostOfPlot(new Circle(9));
		  showCostOfPlot(new Rectangle(10,20));

	}
	
	//Closed for MODIFICATION 
	public static void showCostOfPlot(Shape shape)
	{
		final double PER_SQR_FT_COST = 3000;
		double cost = shape.area() * PER_SQR_FT_COST; //generalized method
		
		
		/*
		 * if( shape instanceof Circle) 
		 * cost =((Circle)shape).areaOfCircle() * PER_SQR_FT_COST;
		 * 
		 * if( shape instanceof Rectangle) 
		 * cost =((Rectangle)shape).areaOfRectangle() * PER_SQR_FT_COST;
		 
		 */
	
	System.out.println("the cost of the plot is "+cost);
	
	
	}

}