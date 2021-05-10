package Interface;

public class Strawberry extends Fruit{ // subclass of Fruit
	
	
	private int carbs, sugar ,fiber;
	private double weight;
	private int quantity;

	public Strawberry(String name, int cb, int sgr, int fbr ,double w) {// constructor with argument
		super(name);
		this.carbs = cb;
		this.sugar = sgr;
		this.fiber=fbr;
		this.weight=w;
		
	
		
		if( this.weight < 30) {  
			totweight();    // overloading with no argument
			System.out.println(name);
			System.out.println("Total weight is :" + totweight() + "g");
			
		} else if (this.weight == 30 ) { 
			 int cb1 = 3;
			 int sgr1 = 4;
	         totweight( cb1, sgr1);	 // overloading with 2 argument
			System.out.println("Weight :" + totweight(cb1,sgr1) + "g");
		}	
		else {
			
			int cb1= 6;
			int sgr1= 12;
			int fbr1=15;
			totweight(cb1,sgr1,fbr1); // overloading with 3 argument
			System.out.println("Total weight :" + totweight(cb1,fbr1,sgr1) + "g");
			
			Discount st = new AppleDiscount(); // new object of discount rate for Strawberry with more weights because more weight have higher price
			System.out.println("Discount for Strawberry which contain more weights :" + st.ratediscount());
			
		}
		
	}

	public int  totweight() { // overloading with no parameter
		return carbs;
		
	}
	
	public int totweight(int cb,int sgr) { // overloading with 2 parameter
		return cb + sgr;
	}
	
	public int totweight(int cb, int sgr , int fbr) { // overloading with 3 parameter
		return cb + sgr + fbr;
	}
	
	public String facts() { // overriding
		return "Strawberries are the only fruit that wear their seeds on the outside";
	} 
	
	public String toString() {
		return  "Facts :" + facts() + "\ncarbs :"+ carbs + "\nFiber :" + fiber + "\nSugar :" + sugar;
	}

	
	
	//overriding method frm fruit cls
	public double totalPrice(double qq, double pr) {
		return pr*qq;
	}

	//overriding method frm fruit cls
	public double totalPrice() {
		int pr =13;
		return pr * this.quantity;
	}

    //overriding method frm fruit cls
	public double totalPrice(double pr) {
		double qq = 2;
		return (pr * this.quantity) * qq ;
	}



}
