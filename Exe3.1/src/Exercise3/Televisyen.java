package Exercise3;

import java.util.Scanner;

public class Televisyen {
	
	 private String type;
	 private double price;
	 private int quantity;
	
	 
	 Scanner scan = new Scanner ( System.in);
		
	
	public Televisyen ( String t,  double p ,int q){	
	
		type =t;
		price=p;
		quantity = q;
   }
	
	public String gettype() {
		return type;
		
	}
	
	public double getprice () {
		return price;
	}
	
	public int getquantity() {
		return quantity;
	}

	
	
	public double total () {
		return price * quantity;
	}
	
	public String toString() {
		return "Type\t: " + type  + "\nprice\t: " +  "RM" + price;
	}
	
	
	}
	


