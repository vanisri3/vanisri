package fruit;

public class GreenApple extends Apple {
	
	private double weight;
	private String vitamin;

	public GreenApple(String name, double pc, int q , char s, double w ) {
		super(name, pc, q, s);
		this.weight = w;
			
		
	}
	
	public double totalprice(double pc , int q) { // overloading with 2 parameters
		return price * quan;
	}
    
	public double gettotweight() {
		return this.weight * super.quan ;
	}
	
	public String getvitamin() { // overloading with no parameter
		return this.vitamin;
	}
	
	public void getvitamin(String v) { //overloading with 1 parameter
		System.out.println("vitamin" + v);
	}
	
	public String toString() { // overriding method
		return "Total price " + "RM " + String.format( "%.2f" , totalprice() )+ "\nTotal weight " + gettotweight() + "g";
	}

}
