package OverloadingOverriding;

public class Apple extends Fruit{
	

	protected int quantity;
	protected double price;
	
		public Apple(String name, int q, double p) { 
			super(name);
			this.quantity = q;
			this.price = p;
			
		
		
			if (this.quantity < 10) {
				totalPrice(); 
				System.out.println(name);
				System.out.println("If quantity less than 10, Total price: RM"  + String.format( "%.2f" , totalPrice()));
			
			}
				else if (this.quantity > 10 && this.quantity < 100) {
				double pp = 1.99; 
				totalPrice(pp);
				System.out.println(name);
				System.out.println("If quantity more than 10, Total price: RM" + String.format( "%.2f" , totalPrice(pp)));
			}
			
				else {
				double pp = 0.99; 
				double dd = 0.1; 
				totalPrice(dd, pp); 
				System.out.println(name);
				System.out.println("If quantity more than 100, Total price: RM"  + String.format( "%.2f" , totalPrice(dd,pp)));
			}
		}
		
			
			
		
		public double totalPrice() {
			return this.price * this.quantity;
			
		}
		
		public double totalPrice(double pr) {
			return pr * this.quantity;
		}
		
		public double totalPrice(double qq, double pr) {
			return (pr * this.quantity) * qq;
		}
		
		public String facts() {
			return "A large apple tree can take 8 to 10 years to produce the firs fruit";
		}
		
		public String toString() {
			return   "Facts :" + facts() + "\nPrice\t\t :" + "RM" + String.format( "%.2f" ,price) + "\nQuantity\t :" + quantity ;
					
		}
		

	}


