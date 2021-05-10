package Interface;

public class Apple extends Fruit{ // subclass of Fruit
	
	protected int quantity;
	protected double price;
	
		public Apple(String name, int q, double p) { //Constructor with argument
			super(name);
			this.quantity = q;
			this.price = p;
			
		
		
			if (this.quantity < 10) {
				totalPrice(); //overloading with no argument
				System.out.println(name);
				System.out.println("If quantity less than 10, Total price: RM"  + String.format( "%.2f" , totalPrice()));
			
			}
				else if (this.quantity > 10 && this.quantity < 100) {
				double pp = 1.99; 
				totalPrice(pp); //overloading with one argument
				System.out.println(name);
				System.out.println("If quantity more than 10, Total price: RM" + String.format( "%.2f" , totalPrice(pp)));
			}
			
				else {
				double pp = 0.99; 
				double dd ; 
				
				Discount ds = new AppleDiscount(); // new object of discount for apple
				System.out.println("Dis" + ds.ratediscount());
				dd = ds.ratediscount();
				totalPrice(dd, pp); // overloading with 2 argument
				System.out.println(name);
				System.out.println("If quantity more than 100, Total price: RM"  + String.format( "%.2f" , totalPrice(dd,pp)));
			}
		}
		
			
			
		
		public double totalPrice() { //overloading with no parameter
			return this.price * this.quantity;
			
		}
		
		public double totalPrice(double pr) { // overloading with 1 parameter
			return pr * this.quantity;
		}
		
		public double totalPrice(double qq, double pr) { // overloading with 2 parameter
			return (pr * this.quantity) * qq;
		}
		
		public String facts() {// overriding method
			return "A large apple tree can take 8 to 10 years to produce the firs fruit";
		}
		
		public String toString() { //overriding method
			return   "Facts\t :" + facts() + "\nPrice\t :" + "RM" + String.format( "%.2f" ,price) + "\nQuantity :" + quantity ;
					
		}




		




		
	
		


}
