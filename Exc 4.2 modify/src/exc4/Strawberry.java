package exc4;

public class Strawberry  extends Fruit{
	
	
	private double price;
	private int voucher;
	
	
	public Strawberry(String name , double p,int v) {
		super(name);
		this.price = p;
		this.voucher=v;
		
		
		vouchers(p);
		vouchers(p,v);
		
	}
	
	
	public String vouchers(double p) {// overloading with 1 parameters
				if ( p > 10)
					return ("You got RM 5  voucher ");
				else 
					return ("You don't get any vouchers ");
	}
	
	public double vouchers (double p , int v) { // overloading with 2 parameters
		 
		return p-v;
	}
	
	
	
	public String facts() { // overriding
		return "Strawberries are the only fruit that wear their seeds on the outside";
	} 
	public String toString() { //overriding
		return  "Facts :" + facts() + "\nThe voucher statement :" + vouchers(price) + "\n price using Voucher :" + "RM" + vouchers(price , voucher);
	}

	
}
