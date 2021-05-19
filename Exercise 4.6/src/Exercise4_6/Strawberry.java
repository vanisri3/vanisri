package Exercise4_6;

public class Strawberry extends Apple {


	private int carbs, sugar ,fiber;
	private double weight;
	private int quantity;

	public Strawberry(String name, int cb, int sgr, int fbr ,double w) {// constructor with argument
		super(name, fbr, w);
		this.carbs = cb;
		this.sugar = sgr;
		this.fiber=fbr;
		this.weight=w;
		
		
		Discount sp = new StrawberryDiscount();// new object for discount rate
		System.out.println("Strawberry discount : " + sp.ratediscount());
		 
		
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


