import java.util.*;
public class communication {

	public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
	
			int topic;
			int rows = 5;

		    for (int y = 1; y <= rows; ++y) {
		      for (int j = 1; j <= y; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		      
			System.out.println("Hai customer, please choose your shop. :) ");
			System.out.println("Press 1 for Laptop shop");
			System.out.println("Press 2 for Internet shop");
			System.out.println("Press 3 for TV shop");
			System.out.println();
			
			System.out.print("Enter the shop:");
			topic = in.nextInt();
			
			System.out.println();
			
			if(topic==1) {
			
				System.out.print("***Welcome to Laptop shop***");
				System.out.println();
				
			String[][] custInfo = new String [3][1];
			int[] counter = {0,1,2};
			change(counter);
			
			int custLaptop;
			int quantity=0;
			double laptopprice = 0.00;
			double totalprice=0.00;
			double amount = 0.00;
			double discount=0.00;
			char next=0;
			double pricetopaid=0.00;
			
			laptopBrand();
			
			for (int i=0; i<52; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			System.out.println("Customer Information");
			System.out.print(counter[0] + ". Enter Your Name: ");
			custInfo[0][0] = in.next();
			System.out.print(counter[1] + ". Enter Your IC No: ");
			custInfo[1][0] = in.next();
			System.out.print(counter[2] + ". Enter Your Phone No.: ");
			custInfo[2][0] = in.next();
			
			
			do{
				System.out.println();
				System.out.print("Which Brand of Laptop You Want: ");
				custLaptop = in.nextInt();
				
				if (custLaptop == 1) {
					laptopprice = 3600.00;
				}
					
				else if (custLaptop == 2) {
					laptopprice = 5600.00;
				}
				
				else if (custLaptop == 3) {
					laptopprice = 4500.00;
				}
				
				else if (custLaptop == 4) {
					laptopprice = 2800.00;
				}
				
				else if (custLaptop >=5) {
					System.out.print("Invalid");
				}
				
				System.out.print("Quantity You Want To Buy: ");
				quantity = in.nextInt();
				
				totalprice = laptopprice * quantity;
				
				amount = amount + totalprice;
				
				discount = checkDiscount (amount);
				
				pricetopaid = amount - discount;
				
				System.out.print("Enter Y If You Want Buy Another Brand: ");
				next = in.next().charAt(0);
			} while (next == 'Y' || next == 'y');
			
			int i=0;
			while (i<52) {
				System.out.print("*");
				i++;
			}
			
			System.out.println();
			System.out.println("Customer Name: " + custInfo[0][0]);
			System.out.println("Customer IC: " + custInfo[1][0]);
			System.out.println("Customer Phone Number: " + custInfo[2][0]);
			System.out.println("Amount of Price : RM" + amount);
			System.out.println("Discount 20%: RM" + discount);
			System.out.println("Price Need To Be Paid by Customer: RM" + pricetopaid);

			}
			else {
				if(topic==2) {
					System.out.print("***Welcome to Internet Shop***");
					System.out.println();
						Scanner obj=new Scanner(System.in);
						
						//array
						String[] pass= {"Daily pass","Weekly pass","Monthly pass","Top Up"};
						
						double price=0;
						double current=0;
						double value=0;
						//input
						System.out.println("--------------------------------------");
						System.out.print("Enter your first name : ");
						String firstname=obj.next();
						System.out.print("Enter your last name : ");
						String lastname=obj.next();
						System.out.print("Enter your identity card number : ");
						String ic=obj.next();
						System.out.print("Enter your phone number : ");
						String hp=obj.next();
						System.out.print("Enter your balance : ");
						double balance=obj.nextDouble();
						System.out.println("--------------------------------------");
						
						System.out.println("Can I help you? Press 1");
						System.out.println(" Press 1 to continue");
						System.out.println("Press 2 to exit ");
						int c=obj.nextInt();
						while(c==1) {
							
						
						
						System.out.println();
						
						//Start system 
						System.out.println("Welcome to Hotlink centre!");
						System.out.println("You can buy your internet packages here.");
						System.out.println("Press button 1 to continue your purchase.");
						int button=obj.nextInt();
						
						if(button==1) {
							//menu
							System.out.println();
							System.out.println("***********INTERNET PASSES**********");
							displayListPass(pass);
							}
							System.out.println("************************************");
							System.out.println();
							//input number pass
							System.out.println("Enter the number of the packages you want");
							int want=obj.nextInt();
							//if choose daily press 0
							if(want==0) {
								System.out.println();
								System.out.println("Daily pass.");
								System.out.println(" 2 GB 1 day: RM 3");
								System.out.println("To confirm press 1");
								int press=obj.nextInt();
								if(press==1) {
									System.out.println();
									if(balance>=3) {
									System.out.println("You have buy daily internet passes!");
									 price=3;
									}
								    else
								    	System.out.println("You have insufficient balance!Please top up ");
								}
								else {
									System.out.println("You have canceled your purchase. ");
									 price=0;
									
								}
							}
							////if choose weekly press 1
							else if(want==1) {
								System.out.println();
								System.out.println("Weekly pass.");
								System.out.println(" 3 GB 7 days: RM 10");
								System.out.println("To confirm press 1");
								int press1=obj.nextInt();
								if(press1==1) {
									System.out.println();
									if(balance>=10) {
									System.out.println("You have buy weekly internet passes!");
									 price=10;
									}
								    else
								    	System.out.println("You have insufficient balance!Please top up ");
							
								}
								else {
									System.out.println("You have canceled your purchase. ");
									price=0;
						}
							}
						    ////if choose monthly press 2
						    else if(want==2) {
						    	System.out.println();
							    System.out.println("Monthly pass.");
							    System.out.println(" 10 GB 30 days: RM 30");
							    System.out.println("To confirm press 1");
							    int press2=obj.nextInt();
							    if(press2==1) {
								    System.out.println();
								    if(balance>=30) {
								    System.out.println("You have buy monthly internet passes!");
								     price=10;
								    }
								    else {
								    	System.out.println("You have insufficient balance!Please top up ");
							}}
								    else {
									    System.out.println("You have canceled your purchase. ");
									      price=0;
									
								
						    }
						    }
							else if(want==3) {
								 System.out.println();
								 System.out.println("Top Up");
								 System.out.println(".");
								 int count=0;
								 do {
									 System.out.println("Enter the value you want to top up (RM 10-100");
									 System.out.print("RM");
									  value=obj.nextDouble();
									 
									 System.out.println("Press 0 to check current balance");
									 int exit=obj.nextInt();
									 if(exit==0) {
										 count=1;
									 }
								 }while(count==0);
							    	
							    }
							  
						else {
							System.out.println();
					    	System.out.println("You have canceled your purchase. ");
						}
						System.out.println();
						System.out.println("Name\t\t\t: "+firstname+" " +lastname);
						System.out.println("Identity card no.   \t: "+ic);
						System.out.println("Phone no. \t\t: "+hp);
						System.out.println("Total purchase  \t:RM "+price);
						current=balance-price+value;
						System.out.println("Current balance\t\t: "+current);
						System.out.println("Thank You for using Hotlink !");
						System.out.println("********************************");
						System.out.println("Can I help you? Press 1");
						System.out.println(" Press 1 to continue");
						System.out.println("Press 2 to exit ");
						 c=obj.nextInt();
					}
						System.out.println("You have canceled your purchase. ");

				}
			
		
		else {
			if(topic==3) {
				String name,TV;
				int age,price,item,cust;
				char gender;
				double discount, total;
				
				System.out.println("***********Welcome To Our TV's Shop**********************");
				System.out.println();
				
				System.out.println("***********Now, Our Shop Have A Blast Promosi!***********");
				System.out.println();
				
			    //calling method
			
				//Array 2D
				String [][] myname = {{"Mrs", "Mr", "Miss"},
						              {"Fatin", "Akmal", "Rajh"}
				};
				System.out.println();
				System.out.println("Hai my dear customer, with me, your personal assistant in this shop today, " +myname[0][2]+ " " +myname [1][0]+ ".");
				
				System.out.println();

				//FOR LOOP
				for(int i=0; i < 2;i++) {
				System.out.print("Enter name of the customer that come into the shop: ");
				name = in.next();
			    }
				
				
				//DO-WHILE LOOP
				int x =1;
				
				do {
				System.out.print("Enter the age of the customer:"+x+ ".");
				age = in.nextInt();
				x++;
				}
				while(x<3);
				
				System.out.print("Enter gender of the customer:" );
				gender = in.next().charAt(0);
				
				System.out.println();
				
				
				//REPETITION STRUCTURE (IF/ELSE) FOR GENDER
				if(gender=='F') {
					System.out.println("You can claim item under RM50, at the Watson and Guardian shop. After you buy with our product. Don't miss it!");
				}
				else
					if(gender=='M') {
						System.out.println("You can claim item under RM50, at the electric shop. After you buy with our product. Don't miss it!");
						
					}
					else
						System.out.println("None");
				
				
				System.out.println();
				
				//Array
				System.out.println("Take a look at our product. There's plenty of new good quality TV!");
				
				String[][]  product_1 = {
						                {"QLED", "OLED"},
				                        {"DLP", "Plasma"},
				                        {"LCD","Direct_TV"}
				};
				
				  for (int i = 0; i < product_1.length; i++)
				  {
				         System.out.print( product_1[ i ] [ 0 ] + " , " );
				         for (int j = 1; j <  product_1[ i ].length; j++)
				         {
				                    System.out.print( product_1[ i ][ j ] + " ");
				         }
					System.out.print("\n");
				}

				  System.out.println();

				
				System.out.print("Enter the product/services: ");
				String product = in.next();
				
				if(product.equals("QLED")) {
					System.out.println("The price is RM987");
				}         
				if(product.equals("OLED")) {
					System.out.println("The price is RM1,600");
				}
					else
						if(product.equals("LCD")) {
							System.out.println("The price is RM2,260");
						}
						else
							if(product.equals("DLP")) {
								System.out.println("The price is RM1,940");
							}
							else
								if(product.equals("Plasma")) {
									System.out.println("The price is RM850");
								}
								else
									if(product.equals("Direct_TV")) {
										System.out.println("The price is RM1,200");
									}
									else
										System.out.println("None");
			
									
									
				System.out.println();
				
				//passing method
				
			    //how many item that customer purchase
				final int SIZE = 4; //size array
				
				int[] num_array = new int[SIZE];
				
				//passing array
				fillArray(num_array, SIZE);
				System.out.println("Limit number items when shopping are: ");
				
				printArray(num_array, SIZE);
				
				System.out.println();

				
				System.out.print("Enter how many item purchase: ");
				item = in.nextInt();
				
				
				
				System.out.println();
				
				//calculate the total price
				System.out.print("Enter the price given is RM ");
				price = in.nextInt();
				
				System.out.println();
				
				total = price * item;
				System.out.println("The total price: RM" +total);
				
				
				//discount
				System.out.println();
				if(total>1000) {
					discount = total * 0.1;
				}
				else
					discount = total * 0.2;
				
				System.out.println("Discount received: RM" +discount);
				System.out.println("Price to be paid on the product after discout: RM" +(total-discount));
				
				System.out.println();
				
				
				//WHILE LOOP
				System.out.println("Before you go back, let's pick one that you like and go redeem your coupon! Interesting isn't it!?");
				
				//Single Array
				String[] array1 = new String[] {"KFC", "Mcdonald", "Subway"};
				
				//iterating all elements in the array
				for(int i=0; i< array1.length; i++) {
					System.out.println(array1[i]);
				}
				
				System.out.println();
				System.out.println("***************THANK YOU MY BELOVED CUSTOMER, HOPE TO SEE YOU AGAIN!***************");
			}
		}
			}
		}
		
			
			
			public static void fillArray(int[] num_array, int n) {
				Scanner in = new Scanner (System.in);
				
			System.out.println("Enter " + n + " integer:");
				
				for(int i=0; i<n; i++) {
					
					num_array[i] = in.nextInt();
			}
			}
				
			public static void printArray(int[] num_array, int n) {
				Scanner in = new Scanner (System.in);
				
				for(int i=0; i<n; i++) {
					
					System.out.print(num_array[i] + " ");
				
			}
		}
		
				
				public static void displayListPass(String x[]) {
					for(int counter=0;counter<4;counter++) {
						System.out.println(counter+x[counter]);
				

				}
			}
		
		
		public static void change (int x[]) {
			for (int j=0; j<x.length; j++) {
				x[j]++;
			}
		}
		
		public static void laptopBrand() {
			String[] laptopBrand = {"1.hp" , "2.ASUS" , "3.Acer" , "4.Lenovo"};
			System.out.println("Brand of Laptop We Sell: ");
			for (int i = 0; i < laptopBrand.length; i++) {
				System.out.println(laptopBrand[i]);
			}
		}
		
		
		public static double checkDiscount (double amount) {
			double discount=0.00;
			
			if (amount >= 2500 && amount < 5000) {
				discount = amount * 0.05;
			}
			
			else if (amount >= 5000 && amount <= 7500) {
				discount = amount * 0.10;
			}
			
			else if (amount >= 7500 && amount <= 10000) {
				discount = amount * 0.15;
			}
			
			else if (amount > 10000) {
				discount = amount * 0.20;
			}
			
			return discount;
		}
		
	}

		

