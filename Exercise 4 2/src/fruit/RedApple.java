package fruit;

public class RedApple  extends Apple{
	
	private int discount;
	private double weight;
	

	public RedApple(String name, double pc, int q, char s,int d,double w) {
		super(name, pc, q, s);
		this.discount =d;
		this.weight =w;
		
	}
	
	public double totalprice( double pc , int q) { // overloading with 2 parameters
		return pc * q;
		
	}
	
	public double getpriceafterdiscount() {
		return super.price - (( discount /100) * super.price) ;
	}
	
	public double gettotweight( int q , double w) {
		return super.quan * weight;
	}
	
	public String toString() { // overriding method
		return "Total price " + "RM " + String.format( "%.2f" , totalprice()) +  "\nPrice after discount " + "RM" +
	            String.format( "%.2f" ,getpriceafterdiscount()) +  "\nTotal weight " + gettotweight(2, 25) + "g";
	}
		

}
