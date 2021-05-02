package exc4;

public class GreenApple extends Apple{

	int carbs,sugar , fiber;
	double weight;

	
	public GreenApple( String name, double pc, int q,char s ,int d,int cb,int sgr,int fb ,double w) {
		super(name, pc, d, s, d);
		
		this.carbs = cb;
		this.sugar = sgr;
		this.fiber = fb;
		this.weight =w;
	  
		setweight();
		setweight(cb , sgr , fb);
	}
	
	public double  setweight() { // overloading with no parameters
		return weight;
	}

	public int setweight(int carbs, int sugar , int fiber) { // overloading with 3 parameters 
		return this.carbs + this.fiber + this.sugar;
	 }
	
	
	public String facts() { // overriding
		return "Green Apple is a Great Weight Loss Aid" ;
	}
	
	public String toString() {// overriding
		return "Fact :" + facts() + "\nweight :" + setweight() + "g" + "\nWeight after sum the nutriens " + setweight(carbs, carbs, carbs) ;
	}
	 
	 
	  
	 
	
		
}
