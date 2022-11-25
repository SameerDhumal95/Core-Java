package study.interfaces;

public class Shop {

/*	public static void main(String[] args) {
		
		//Sellable obj = new Sellable();  obj is not possible
        Sellable[] arr = new Sellable[5];
        arr[0] = new Toy("Car",300,10);
        arr[1] = new Laptop("Lenovo","Ryzen","8GB","1TB",25000,12);
        arr[2] = new Toy("Barbie",200,20);
        arr[3] = new Icecream("Cornato","Chocklet",400,20);
        arr[4] = new Cloths("Hoodies",600,20);
        ShowBill(arr);
	}

   // closed for modification
	public static void ShowBill(Sellable[] purchases)
	{
		double total=0;
		for(Sellable s : purchases)
		{
			double sp = s.getProductSellingPrice();
			System.out.println(s.getProductInfo()+"   "+sp);
			total = total + sp;
		}
		System.out.println("total bill = "+total);
	}*/

	public static void main(String[] args) {
		//Sellable  obj = new Sellable();
		Sellable[]  arr = new Sellable[3];
		arr[0] = new Toy("car",300,10);
		arr[1] = new Laptop("DELL", "intel","8GB","1TB",35000,12);
		arr[2] = new Toy("barbie",200,20);

		showBill(arr);
	}
	//closed for modification
	public static void showBill(Sellable[] purchases)
	{
		double total=0;
		for(Sellable s : purchases)
		{
			double sp = s.getProductSellingPrice();
			System.out.println(s.getProductInfo() + "  "+sp);
			total+=sp;
		}
		System.out.println("total bill ="+total);
	}

}

