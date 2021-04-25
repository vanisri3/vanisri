package fruitinheritance;

public class Apple extends Fruit {
	
	protected double price;
	protected int quan;
	private char size;

	public Apple(String name, double pc,  int q , char s) {
		super(name);
		this.price = pc;
		this.quan = q;
		this.size = s;
		
		System.out.println(name + " constructor is invoked");
				
	}
	
	    public char size() {
		  return this.size;
	}
	
	    public double totprice () {
		   return  this.price * this.quan;
	}
	    
	    public String toString() {
	    	return  "Size :" + size + "\nTotal price " + "RM " +  String.format( "%.2f" ,totprice());
	    }
	
}
