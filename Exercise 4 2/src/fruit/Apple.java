package fruit;

public class Apple extends Fruits{

	 
	protected double price;
	protected int quan;
	private char size;

	
		
	public Apple ( String name, double pc, int q,char s) {
		super (name);
		price = pc;
		quan = q;
		size = s;
		
		
		
	}
	    public char getsize() {
		  return this.size;
	}
	
	    public double totalprice ()  {  // overloading with no parameter
		   return  this.price * this.quan;
	}
	    
	   
	    public String toString() { // overriding method
	    	return  "Size :" + size + "\nTotal price " + "RM " +  String.format( "%.2f" ,totalprice()  );
	    }
	
}
