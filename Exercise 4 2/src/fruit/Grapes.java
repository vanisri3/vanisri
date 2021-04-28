package fruit;

public class Grapes extends Fruits {
	 String colour;
	  double weight;
	  
	
	public Grapes(String name, String clr, double wght ) {
		super(name);
		this.colour = clr;
		this.weight = wght;
		
		
	}
	
	public double totalCaloricequivalent(int cp, int cfb)  {// overloading with 2 parameters
		return cp + cfb  ;
	}
	
	 public String colour() {
		 return this.colour;
	}
	
	 public double weight() {
		 return this.weight;
	}

	  public String toString() { // overriding method
		  return "colour :" + colour + "\nweight :" + weight + "g";
	  }


}
