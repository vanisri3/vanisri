package Exercise4_6;



public class Apple extends Fruit{
	
	protected int quantity;
	protected double price , dis;
	
	
		public Apple(String name, int q, double p) { //Constructor with argument
			super(name);
			this.quantity = q;
			this.price = p;
		
			Fruitprices ap = new AppleTotalPrice();// total price apple
			Fruitprices gp = new GrapesTotalPrice(); // total price grapes
			Fruitprices stw = new StrawberryTotalPrice();// total price strawberry
			
		
		
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
				
				
				if (name == "Apple") {
					Discount ap1 = new AppleDiscount();// apple discount
					double dd3 = ap1.ratediscount();
					System.out.println("Discount Apple " + ap1.ratediscount());
					ap1.ratediscount();
					System.out.printf("Total Price is RM%.2f", ap.totprice(quantity, dd3));
				}
				else if (name == "Grapes"){
					Discount gp1 = new GrapesDiscount(); // grapes discount
					double dd2 = gp1.ratediscount();
				    totalPrice(dd2 , pp);
					System.out.println("Discount Grapes" + gp1);
					gp1.ratediscount();
					System.out.printf("Total Price is RM%.2f", gp.totprice(quantity, dd2));
					
				}
				else {
				
					Discount stw1 = new StrawberryDiscount(); // strawberry discount
					double dd1 = stw1.ratediscount();
					totalPrice(dd1,pp);
					System.out.println("Discount strawberry :" + stw1);
					stw1.ratediscount();
					System.out.printf("Total Price is RM%.2f", stw.totprice(quantity, dd1));
					
				}
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
