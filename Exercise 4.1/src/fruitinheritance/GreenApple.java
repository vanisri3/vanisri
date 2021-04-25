package fruitinheritance;

public class GreenApple extends Apple {
	
	private double weight;

	public GreenApple(String name, double pc, int q , char s, double w ) {
		super(name, pc, q, s);
		this.weight = w;
			
		
	}
	
	public double gettotalprice() {
		return super.price * super.quan;
	}
    
	public double gettotweight() {
		return this.weight * super.quan ;
	}
	
	public String toString() {
		return "Total price " + "RM " + String.format( "%.2f" , gettotalprice() )+ "\nTotal weight " + gettotweight() + "g";
	}
}

