package Exercise4_6;

public abstract class Fruit {
	
	protected String name;
	
	public Fruit ( String name) {
		name = name;
		
	}
	
	
// method that no have implementation
public abstract double totalPrice();
public abstract double totalPrice(double qq);
public abstract double totalPrice(double qq, double dd);


}
