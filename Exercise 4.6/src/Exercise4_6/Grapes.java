package Exercise4_6;



public class Grapes extends Apple{
	

	 private double price;
	 private int quantity;
	 private int weight ;
	
	 
	 
	public Grapes(String name , int qt ,double pc , int wght) { // constructor with argument
		super(name, qt, pc );
		this.price = pc;
		this.weight = wght;
		this.quantity = qt;
			
		
		Discount grp = new GrapesDiscount(); //new object of discount rate for Grapes
		System.out.println("Grapes discount  " + grp.ratediscount());
	}
			
		 
	

		public double totalprice() { // overloading with no parameter
			return this.price;
		}
		

		public double totalprice(double voucher) { // overloading with 1 parameter
			return this.price - voucher;	
	    }
		
		public double totalprice(double voucher , double discount) {// overloading with 2 parameter
			return (this.price - voucher) -( (discount / 100) * this.price) - this.price;
		}
		
		
		public String facts () { // overriding
			return "Grapes Are Actually Berries";
		}
		
		public String toString() {// overriding
			return  "Facts    :" + facts() + "\nPrice\t :" + "RM" + String.format( "%.2f" ,price) ;
			
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



