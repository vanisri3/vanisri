package Interface;

public class GreenApple extends Apple{ // subclass of Apple
	
	private String nutrien;
	private char size;

	public GreenApple(String name, int q, double p, String n, char s) { // constructor with argument
		super(name, q, p);
		this.nutrien = n;
		this.size=s;
		
		
		Discount gp = new GreenappleDiscount();// new object for discount rate
		System.out.println("Green Apple discount is  " + gp.ratediscount());
		
	
	}
	
	public String nutrien() {
		return this.nutrien;
		
	}
	
	public double price() {
		return super.price * super.quantity;
	}
	
	public char sizeApple() {
		return this.size;
	}
	
	
	public String facts() { // overriding
		return "Green Apple is a Great Weight Loss Aid" ;
	}
	
	public String toString() { // overriding method
		return "Facts\t   : " + facts() +  "\nNutrien\t   : " + nutrien + "\nFruit Size : " + size;
	}

}
