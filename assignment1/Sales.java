package NonAlcholicBeverage;

import java.util.Scanner; 

public class Sales {// user defined class
	
	Scanner scan = new Scanner ( System.in);// pre defined class
	
	String  item;
	double inventory_purchase ,incidental_charges,price, total_sale;
	double spending, profit ,profitt;
	
	
	// setter method
	   public void setinventory_purchase() { 
		   	  System.out.println("Total spending on invontory_purchase :");
		   	 this.inventory_purchase = scan.nextDouble();
			}
	   
	   public void setincidental_charges() { 
		   	  System.out.println("Incidental charges that you pay  :");
		  this.incidental_charges = scan.nextDouble();
		   	
			}
	   public void settotalsale() { 
		   	  System.out.println("Total sales of the month:");
		   	  this.total_sale = scan.nextDouble();
		   	
			}
	  
	   
	   // getter method
	   
	   public double getinventory_purchase() {
		   return this.inventory_purchase;
	   }
	   
	   public  double getincidental_charges() {
		   return this.incidental_charges;
	   }
	   
	   public double gettotal_sale() {
		   return this.total_sale;
	   }
	
	   public  double getprofit() {
		   spending = this.incidental_charges + this.inventory_purchase ;
		   profitt = this.total_sale - spending;
		   return profitt;
		   
	   }
	 
	   
	 
	  
	
    

}
