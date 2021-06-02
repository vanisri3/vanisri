package NonAlcholicBeverage;

import java.util.Scanner;

public class Customer { // user defined class
	  
	//predefined class
	 Scanner scan = new Scanner(System.in);  
	
	int quantity;
	double discount;
	double total , fulltotal;
	int choose;
	double price;
	double pay, payment;
	
	public Customer() { // constructor with no arguments
	
		
System.out.println();
System.out.println("====== Vanisri's Non-Alcholic Beverage Shop =====");
	 System.out.println("-----------------------------------------------------");
System.out.println("Type Of Beverage | Name of Beverage | Beverage Price| ");
System.out.println("=====================================================");
	 System.out.println(" 1) Stimulating  |  Coffee       |\t13.00       |");
	 System.out.println(" 2) Stimulating  |  Tea          |\t15.00       |");
	 System.out.println(" 3) Refreshing   |  Water        |\t 9.50       |");
	 System.out.println(" 4) Refreshing   |  Syrup        |\t16.70       |");
       System.out.println(" 5) Refreshing   |  Orange Juice |\t 5.50       |");
	 System.out.println(" 6) Nourishing   |  Milk         |\t 7.00       |");
	        System.out.println("======================================================");
	        
	        
	 System.out.println("*******Ordering Time*******");
	 System.out.println("Which way you want to use for buy your        beverage?");
	 System.out.println("1.Online ");
	 System.out.println("2.Walk in");
	          
	   payment = scan.nextInt();
	      
	          
	   		 if ( payment == 1) { //if customer choose 1 they do online buying
	   			 
	   			 System.out.println("Thanks for choosing online system");
	   			 System.out.printf("Enter your Name : " + scan.nextLine());
	   			 scan.nextLine();
	   			 System.out.printf("Enter your address :" + scan.nextLine());
	   			 scan.nextLine();
	   			 System.out.printf("Enter payment method : " + scan.nextLine());
	   			 scan.nextLine();
	   			 
	   		 }
	   		  
	        System.out.printf("Enter your choice from 1-6 :"); // customer buy their beverage by shoose the number
	        choose = scan.nextInt();
	        
	        	System.out.printf("Enter quantity :");
	        	this.quantity = scan.nextInt();
	        		        switch (choose) {

	        		            case 1:
	        		            	price = 13.00;
	        		                break;
	        		            case 2:
	        		            	price = 15.00;                       
	        		                break;
	        		            case 3:
	        		                price= 9.50;
	        		                break;
	        		            case 4:
	        		                price = 16.70;
	        		                break;
	        		            case 5:
	        		                price = 5.50;
	        		                break;
	        		            case 6 :
	        		                price = 7.00;
	        		        }
	        		        total = total + (this.quantity * price);
	        		          		   	
	        		     
		}
	          void printreceipt(){ //print customer receipt
	            System.out.println();
	  			System.out.println("\t Receipt");
	  			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	  			System.out.println("Price of  beverage you choose RM: " + String.format( "%.2f" , price));
	  	        System.out.println("Total quantity you order        :" + quantity);
	  	        System.out.println("Total price \t\t\t: RM" +String.format( "%.2f" , total));
	  	        System.out.print("Enter payment amount \t\t: RM");
	  	        Scanner scan = new Scanner(System.in);
	  	        double payment = scan.nextInt();
	  	        System.out.println("Payment \t\t\t: RM " + payment);
	  	        double balance = payment - total ;
	  	        System.out.println("Balance \t\t\t: RM " + balance);
	  	        System.out.println("THANK YOU & COME AGAIN !!!");  	      
     	 
           }		      
}

	