package OverloadingOverriding;

public class Strawberry extends Fruit{
	
	private int carbs, sugar ,fiber;
	private double weight;

	public Strawberry(String name, int cb, int sgr, int fbr ,double w) {
		super(name);
		this.carbs = cb;
		this.sugar = sgr;
		this.fiber=fbr;
		this.weight=w;
		
		
		if( this.weight == 30) {
			totweight();
			System.out.println(name);
			System.out.println("Total weight is :" + totweight() + "g");
			
		} else if (this.weight < 30 ) {
			 int cb1 = 3;
			 int sgr1 = 4;
	         totweight( cb1, sgr1);	
			System.out.println("Weight :" + totweight(cb1,sgr1) + "g");
		}	
		else {
			
			int cb1= 6;
			int sgr1= 12;
			int fbr1=15;
			totweight(cb1,sgr1,fbr1);
			System.out.println("Total weight :" + totweight(cb1,fbr1,sgr1) + "g");
		}
		
			
		
	
	}

	public int  totweight() {
		return carbs;
		
	}
	
	public int totweight(int cb,int sgr) {
		return cb + sgr;
	}
	
	public int totweight(int cb, int sgr , int fbr) {
		return cb + sgr + fbr;
	}
	
	public String facts() { // overriding
		return "Strawberries are the only fruit that wear their seeds on the outside";
	} 
	
	public String toString() {
		return  "Facts :" + facts() + "\ncarbs :"+ carbs + "\nFiber :" + fiber + "\nSugar :" + sugar;
	}

}
