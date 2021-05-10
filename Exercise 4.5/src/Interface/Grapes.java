package Interface;

public class Grapes extends Fruit{ // subclass of Fruit
	
	 private double price;
	 private double voucher;
	private int quantity;
	
	 
	 
	public Grapes(String name , double pc, double vc ) { // constructor with argument
		super(name);
		this.price = pc;
		this.voucher = vc;
		
		
		Discount grp = new GrapeDiscount(); //new object of discount rate for Grapes
		System.out.println("Grapes discount  " + grp.ratediscount());
			
		
		
		if (this.price < 5) {
			finalprice();
			System.out.println(name);
			System.out.println("If the price is less than RM5 the finalprice is :" + "RM"  + 
			String.format( "%.2f" + finalprice()));
		}
		
		else if ( this.price > 5 && this.price < 15) {// if the price is between 6 & 14 will get RM2 off 
			double voucher = 2;
			finalprice(voucher  ); //final price will be calculated after off RM 2 from the total price
			System.out.println(name);
			System.out.println("If the price is more than RM5 and less than RM15 the final price:" + "RM" +
			String.format( "%.2f" , finalprice(voucher)));
			
		}
		
		else {   // if the price is more than RM 15 will get RM3 off
			double voucher = 3;
			
			finalprice ( voucher , grp.ratediscount());// final price will calculate aftr off voucher & discount rate
			System.out.println(name);
			System.out.println("If the price more than RM15 and less than RM20 : " +"RM" + 
			String.format( "%.2f" ,  finalprice(voucher,grp.ratediscount())));
		}
		
		
		
	}
	 	
		

		public double finalprice() { // overloading with no parameter
			return this.price;
		}
		

		public double finalprice(double voucher) { // overloading with 1 parameter
			return this.price - voucher;	
	    }
		
		public double finalprice(double voucher , double discount) {// overloading with 2 parameter
			return (this.price - voucher) -( (discount / 100) * this.price) - this.price;
		}
		
		
		public String facts () { // overriding
			return "Grapes Are Actually Berries";
		}
		
		public String toString() {// overriding
			return  "Facts    :" + facts() + "\nPrice\t :" + "RM" + String.format( "%.2f" ,price) + "\nVouchers :" + voucher ;
			
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
