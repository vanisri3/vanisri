package OverloadingOverriding;

 

public class Grapes extends Fruit {
	
	 private double price;
	 private double voucher;
	 private int discount;
	 


	public Grapes(String name , double pc, double vc , int ds) {
		super(name);
		this.price = pc;
		this.voucher = vc;
		this.discount = ds;
		
		
		if (this.price < 5) {
			finalprice();
			System.out.println(name);
			System.out.println("If the price is less than RM5 the finalprice is :" + "RM"  + 
			String.format( "%.2f" + finalprice()));
		}
		
		else if ( this.price > 5 && this.price < 15) {
			double voucher = 2;
			finalprice(voucher  );
			System.out.println(name);
			System.out.println("If the price is more than RM5 and less than RM15 the final price:" + "RM" +
			String.format( "%.2f" , finalprice(voucher)));
			
		}
		
		else {
			double voucher = 3;
		//	int discount =1;
			finalprice ( voucher , discount );
			System.out.println(name);
			System.out.println("If the price more than RM15 and less than RM20 : " +"RM" + 
			String.format( "%.2f" ,  finalprice(voucher,discount)));
		}
		
		
		
	}
	 	
		

		public double finalprice() {
			return this.price;
		}
		

		public double finalprice(double voucher) {
			return this.price - voucher;	
	    }
		
		public double finalprice(double voucher , int discount) {
			return (this.price - voucher) -( (discount / 100) * this.price) - this.price;
		}
		
		
		public String facts () { // overriding
			return "Grapes Are Actually Berries";
		}
		
		public String toString() {
			return  "Facts :" + facts() + "\nPrice\t\t :" + "RM" + String.format( "%.2f" ,price) + "\nVouchers\t :" + voucher + "\nDiscount\t :" + discount;
			
		}
		
	

}
		 
		
		
		

	
	
	


