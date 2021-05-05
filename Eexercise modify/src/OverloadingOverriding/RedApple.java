package OverloadingOverriding;

public class RedApple extends Apple{
	
	private String nutrien;
	private char size;

	public RedApple(String name, int q, double p , String n, char s) {
		super(name, q, p);
		this.nutrien = n;
		this.size= s;
		
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
	
	public String facts() {// overriding
		 return "Red  apples are high in dietary fiber " ;
			
	}
	
	public String toString() {
		return "Facts :" + facts() +  "\nNutrien :" + nutrien + "\nSize of the fruit :" + size;
	}

}
