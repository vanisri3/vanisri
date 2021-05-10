package Interface;

public class RedApple extends Apple { // subclass of Apple
	
	private String nutrien;
	private char size;

	public RedApple(String name, int q, double p , String n, char s) { // constructor with arguments
		super(name, q, p);
		this.nutrien = n;
		this.size= s;
		
		Discount rd = new RedappleDiscount(); // new object rate discount for RedApple
		System.out.println("Red Apple discount : " + rd.ratediscount());
		
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
	
	public String facts() {// overriding method
		 return "Red  apples are high in dietary fiber " ;
			
	}
	
	public String toString() {// overrif=ding method
		return "Facts\t   :" + facts() +  "\nNutrien\t   :" + nutrien + "\nSize fruit :" + size;
	}


}
