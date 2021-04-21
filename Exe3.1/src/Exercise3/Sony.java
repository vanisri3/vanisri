package Exercise3;

import java.util.Scanner;

public class Sony extends Televisyen {
	
	
	Scanner scan = new Scanner ( System.in);
	  
	  private double price;
	  private double discount;
	  private int quantity;
	  private double voltage;
	  private double current;
	  
	
	public Sony  (  String t, double p ,int q )  {
		super (t, p,  q);
		
		System.out.println("Enter the price :");
		price = scan.nextDouble();
		
		System.out.println("Enter the disount");
		discount = scan.nextDouble();
		
		System.out.println("Enter the quantity you want");
		quantity= scan.nextInt();
		
		System.out.println("Enter the TV voltage and current");
		voltage = scan.nextDouble();
		current = scan.nextDouble();
		
	}
	
	
	public double getprice() {
		return price;
	}
	
	public double getdiscount() {
		return price - (( discount /100) * price) ;
	}
	public int getquantity() {
		return quantity;
	}
	public double totprice() {
		return price * quantity;
	}
	public double resistance() {
		return voltage / current;
	}
	
	
}
