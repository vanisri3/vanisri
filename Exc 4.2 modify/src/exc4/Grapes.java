package exc4;

public class Grapes extends Fruit{
	
	
	private double price;
	private int quan;
	private int discount;
	

	public Grapes(String name, double p, int q, int dis) {
		super(name);
		this. price = p;
		this.quan = q;
	    this.discount = dis;
		
		
		totalprice (p,q);
		totalprice(p,q,dis);
		totalprice( p);
		
	}
	
	
	
	public double totalprice (double p, int q) { // overloading with 2 parameters
		return (p*q);
	}
	
	public double totalprice (double p , int q, int dis ) { // overloading with 3 parameters
		return  dis/ 100 *( p * q );
	}
	
	
	public String totalprice (double p) {  //overloading  with 1 parameters
		if ( p > 15)
			return ( " congrats you got discount");
		else 
			return ( " Sorry you did't get any discounts");
	}
	
	public String facts () { // overriding
		return "Grapes Are Actually Berries";
	}
	
	
     public String toString() { // overriding 
 	 return  "Facts :" + facts() + "\nTotal price " +  "RM " + totalprice(price, quan)  + 
		    "\nPrice " + "RM " + totalprice(price, quan , discount) +
    		 "\nPrice wit discount" + totalprice(price);
    
     }
	
	
}
