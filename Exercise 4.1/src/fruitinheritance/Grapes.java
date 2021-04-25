package fruitinheritance;

public class Grapes extends Fruit {

	  String colour;
	  double weight;
	  
	
	public Grapes(String name, String clr, double wght ) {
		super(name);
		this.colour = clr;
		this.weight = wght;
		
		
	}
	
	 public String getcolour() {
		 return this.colour;
	}
	
	 public double getweight() {
		 return this.weight;
	}

	  public String toString() {
		  return "colour :" + colour + "\nweight :" + weight + "g";
	  }

}
