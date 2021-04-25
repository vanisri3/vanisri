package fruitinheritance;

public class RedApple extends Apple {
	
	
	
	private int discount;
	private double weight;
	

	public RedApple(String name, double pc, int q, char s,int d,double w) {
		super(name, pc, q, s);
		this.discount =d;
		this.weight =w;
		
	}
	
	public double gettotalprice() {
		return super.price * super.quan;
	}
	
	public double getpriceafterdiscount() {
		return super.price - (( discount /100) * super.price) ;
	}
	
	public double gettotweight() {
		return super.quan * weight;
	}
	
	public String toString() {
		return "Total price " + "RM " + String.format( "%.2f" , gettotalprice()) +  "\nPrice after discount " + "RM" +
	            String.format( "%.2f" ,getpriceafterdiscount()) +  "\nTotal weight " + gettotweight() + "g";
	}
		
	
}
