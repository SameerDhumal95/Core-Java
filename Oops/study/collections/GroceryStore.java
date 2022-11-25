package study.collections;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

import study.has_a.MyDate1;

public class GroceryStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<FoodProduct> f1 = new ArrayList<FoodProduct>();

		f1.add(new FoodProduct("IceCream","Amul",new MyDate1(1,1,2023),500,100,"milk product",15.2,45.2,50.9));
		f1.add(new FoodProduct("Chicken Lolipop","KFC",new MyDate1(7,1,2020),700,200,"Non veg product",50.2,660.2,65.9));
		f1.add(new FoodProduct("Shrikhand","Chitle",new MyDate1(1,2,2025),800,60,"milk product",25.2,44.2,55.9));
		f1.add(new FoodProduct("Orange Juice","Real",new MyDate1(9,12,2022),350,90,"Fruit product",16.2,47.2,80.9));
		f1.add(new FoodProduct("Peanuts","MG",new MyDate1(18,5,2022),250,70,"Dryfruits product",12.2,55.2,56.9));

		int ch = 0,flag = 0;

		do {
			System.out.println("Enter your choice:"
					+ "\n1. List of products"
					+ "\n2. Sort by expiry date"
					+ "\n3. Sort by fat percentage"
					+ "\n4. Sort by protin percentage"
					+ "\n5. Min protien percentage"
					+ "\n6. Max protien percentage"
					+ "\n7. Exit");
			System.out.println();
			ch = sc.nextInt();

			switch(ch)
			{
			case 1:
				System.out.println("Show product and cost:\n");
				showFoodProductList(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 2:
				System.out.println("Sorting based on Expiry Date:\n");
				SortByExpiryDate(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 3:
				System.out.println("Sorting based on Fat Percentage:\n");
				SortByFatPercentage(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 4:
				System.out.println("Sorting based on Protien Percentage\n");
				SortByProtienPercentage(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 5:
				System.out.println("Minimum Fat percentage product:\n");
				MinFatPercentage(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 6:
				System.out.println("Maximum protien percentage product:\n");
				MaxProtienPercentage(f1);
				System.out.println("--------------------------------------------------");
				break;
			case 7:
				if(ch==7)
				
				flag = 1;
				break;
			

			default:

				System.out.println("wrong choice Try Again...");
				System.out.println("--------------------------------------------------");
				break;
			}
			
		}while(ch!=7);

		if(flag==1)
		{
			System.out.println("You r Exited...Bye Bye");
		}
		sc.close();
	}



	public static void showFoodProductList(ArrayList<FoodProduct> f1) {


		/*	for(int i=0;i<f1.size();i++)
		{
			System.out.println("Name : "+f1.get(i).getName()+" , Cost : "+f1.get(i).getCost());
		}*/

		/*	Iterator<FoodProduct> itr = f1.iterator();
		while(itr.hasNext())
		{
			FoodProduct f =itr.next();
			System.out.println(f.getName()+"  "+f.getCost());
		}*/

		for(FoodProduct f : f1)
		{
			System.out.println("Name : "+f.getName()+" , Cost : "+f.getCost());
		}
	}

	//Default Ordering --> Impliments Comparable in food product class
	public static void SortByExpiryDate(ArrayList<FoodProduct> f1) {

		Collections.sort(f1);
		for(FoodProduct f : f1)
		{
			System.out.println("Name : "+f.getName()+" , Expiry Date : "+f.getExpiryDate());
		}
	}

	public static void SortByFatPercentage(ArrayList<FoodProduct> f1) {

		Collections.sort(f1, new FatComparator());
		for(FoodProduct f : f1)
		{
			System.out.println("Name : "+f.getName()+"  Fat Percentage : "+f.getFatper());
		}
	}

	public static void SortByProtienPercentage(ArrayList<FoodProduct> f1) {
		Collections.sort(f1, new ProtienComparator());
		for(FoodProduct f : f1)
		{
			System.out.println("Name : "+f.getName()+"  Protien Percentage : "+f.getProteinper());
		}

	}

	public static void MinFatPercentage(ArrayList<FoodProduct> f1) {

		System.out.println(Collections.min(f1,new FatComparator()));
	}

	public static void MaxProtienPercentage(ArrayList<FoodProduct> f1) {

		System.out.println(Collections.max(f1, new ProtienComparator()));
	}

}


