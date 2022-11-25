package study.has_a.hw.Product;

import java.util.Scanner;

import study.has_a.MyDate;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product arr[]= new Product[10];
		
		arr[0] = new Product("Cofee Byte","Chocklets",70,new MyDate(3,10,2022));
		arr[1] = new Product("Parle","Cookie",5,new MyDate(2,10,2022));
		arr[2] = new Product("Mango","Fruits",30,new MyDate(20,10,2022));
		arr[3] = new Product("Mat","Sitting",60,new MyDate(1,10,2022));
		arr[4] = new Product("Tshirt","Cloths",100,new MyDate(30,10,2022));
		arr[5] = new Product("Match Box","Fire",50,new MyDate(23,10,2022));
		arr[6] = new Product("Colgate","Tooth Pest",10,new MyDate(1,10,2022));
		arr[7] = new Product("Harpic","Bathroom Clener",250,new MyDate(8,8,2022));
		arr[8] = new Product("LED","Electronics Gadets",50,new MyDate(11,10,2022));
		arr[9] = new Product("TV","Entertenment",25000,new MyDate(19,9,2022));
		
		int flag=0;
		do {

		System.out.println();
		
		System.out.println("Enter Your Choice:"
				         + "\n1. Modify Product"
				         + "\n2. Show all product"
				         + "\n3. Show total cost of product"
				         + "\n4. Show name of all products"
				         + "\n5. Remove product"
				         + "\n6. Quit");

		System.out.println();
		
		int ch = sc.nextInt();
		
		System.out.println();
		
		switch(ch)
		{
		case 1:
		
			System.out.println("List of products:");
			for(int i = 0,j = 1; i<arr.length; i++,j++)
			{
				if(arr[i]==null) 
					continue;
				System.out.println(j+". "+arr[i].name);
			}
			System.out.println();
			
			System.out.println("Enter product No. to modify:");
			
			int c = sc.nextInt();
			int f =0;
			
			 
			do {
			if(c<=10 && c>=1)
			{
				System.out.println();
				System.out.println("Enter a choice:"
						+ "\n1. Modify Name"
						+ "\n2. Modify Desc"
						+ "\n3. Modify Cost"
						+ "\n4. Modify Expiry Date"
						+ "\n5. exit to main");
				
				System.out.println();
				
				int q = sc.nextInt();
				
				if(q<5&&q>0)
				{
					
				  switch(q)
				  {
				  case 1 :
				  
					  System.out.println("Enter the name:");
					  sc.nextLine();
					  String name = sc.nextLine();
					  
					  arr[c-1].setName(name); //set the name
					  break;
				  
				  case 2 :
				  
					  System.out.println("Enter the Description:");
					 
					  String desc = sc.next();
					  
						  
					  arr[c-1].setDesc(desc);
					  break;
					  
					  
				  
				  case 3 :
				  
					  System.out.println("Enter the Cost:");
					 
					  int cost = sc.nextInt();
					  
					  arr[c-1].setUnitCost(cost);
					  break;
					  
					  
				  
				  case 4 :
				  
					  System.out.println("Enter the Date:");
					 
					  int dd = sc.nextInt();
					  int mm = sc.nextInt();
					  int yy = sc.nextInt();
								  
					  arr[c-1].setExpiryDate(new MyDate (dd,mm,yy));
					  break;
					  
				  case 5:
					  if(f==5)
					  {
						 System.out.println("exit to main menu..");
						 f=1;
					  }
					break;
					
				  default:
						  System.out.println("Invalid choice..");
				  }  //inner switch close
					
				 } //inner if close
				
				 else
				  {
					    System.out.println("Invalid choice");
				  }
				 /*********************************/
			    
			    
			    System.out.println();
				
			    System.out.println("List of products:");
				for(int i = 0,j = 1; i<arr.length; i++,j++)
				{
					if(arr[i]==null) 
						continue;
					System.out.println(j+". "+arr[i].getName()+",  "+arr[i].getDesc()
							+", "+arr[i].getUnitCost()+",  "+arr[i].getExpiryDate().getDd()+"/"+
							arr[i].getExpiryDate().getMm()+"/"+arr[i].getExpiryDate().getYy());
				}
				
				System.out.println();
				break;  				
			}//outer if close
			}while(f!=1); //inner do while
				break;
				
		        case 2:
					
					System.out.println("Show products:");
					for(int i = 0,j = 1; i<arr.length; i++,j++)
					{
						if(arr[i]==null) 
							continue;
						System.out.println(j+". "+arr[i].getName()+", "+arr[i].getDesc()
								+", "+arr[i].getUnitCost()+", "+arr[i].getExpiryDate().getDd()+"/"+
								arr[i].getExpiryDate().getMm()+"/"+arr[i].getExpiryDate().getYy());
					}
					
					break;
					
				case 3:
				
					System.out.println("Total cost of productS:");
					double sum = 0;
					
					for(int i = 0; i< arr.length;i++)
					{
						if(arr[i]==null) 
							continue;
						sum= sum+arr[i].getUnitCost();
					}
					
					System.out.println(sum);
					break;
				
				
				case 4:
				
				System.out.println("Show Name of all prodects:");
				for(int i = 0; i<arr.length;i++)
				{
					if(arr[i]==null) 
						continue;
					System.out.println(arr[i].getName());
					
				}
				break;
				
				case 5:
					
					System.out.println("Chooice product for remove:");
					
					System.out.println("List of products:");
					for(int i = 0,j = 1; i<arr.length; i++,j++)
					{
						if(arr[i]==null) 
							continue;
						System.out.println(j+". "+arr[i].getName()+", "+arr[i].getDesc()
								+", "+arr[i].getUnitCost()+", "+arr[i].getExpiryDate().getDd()+"/"+
								arr[i].getExpiryDate().getMm()+"/"+arr[i].getExpiryDate().getYy());
					}
					System.out.println();
					
					int d = sc.nextInt();
					if(d>=1 && d<=10)
					{
						arr[d-1].setName(null);
						arr[d-1].setExpiryDate(null);
						arr[d-1].setDesc(null);
						arr[d-1].setUnitCost(0);
						arr[d-1]= null;
					}
					
					System.out.println("List of products after removed:");
					for(int i = 0,j = 1; i<arr.length; i++,j++)
					{
						if(arr[i]!=null)
						{
						System.out.println(j+". "+arr[i].getName()+", "+arr[i].getDesc()
								+", "+arr[i].getUnitCost()+", "+arr[i].getExpiryDate().getDd()+"/"+
								arr[i].getExpiryDate().getMm()+"/"+arr[i].getExpiryDate().getYy());
						}
						else 
						{
							System.out.println("You have removed all the products...");
						}
						
					}
					System.out.println();
					
				case 6:
					    if(ch==6)
					    {  
						System.out.println("You are exit from the loop...");
					    flag = 1;
						
					    }
					    
			}
		}while(flag!=1);
        sc.close();
	}
}
