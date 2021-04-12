package Exercise2SetterGetter;

public class Televisyen {
	
	String brand;
	String colour;
	double height;
	double width;
	String volume;
	
	// setter method
	public void setBrand ( String brand ) {	
		this.brand = brand;
	}
	 
	public void setcolour ( String colour) {
		this.colour = colour;
	}
 
	public  void setheight ( double height ) {
		this.height = height;
	}
	
	public  void setwidth ( double width) {
		this.width = width;
	}
	
	public  void setvolume ( String volume ) {
		this.volume = volume;
	}
	
	
	// getter method
	public String getbrand() {
		return this.brand;
	}
	
	public String getcolour () {
		return this.colour;
	}
	
	public double getheight() {
		return this.height;
	}
	
	public double getwidth() {
		return this.width;
	}
	public String getvolume() {
		return this.volume;
	}
	
	public void fact () {
		System.out.println("Samsung has the best TV designs in market");
	}
	
	public void facts () {
		System.out.println("Sony TV have better picture qualities compare to other TV");
	}
}
