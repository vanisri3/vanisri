package Interface;

public abstract class Fruit { // superclass as abstract class
	
		protected String name;
			
			public Fruit ( String name) {
				name = name;
				
			}
			
			
	    // method that no have implementation
		public abstract double totalPrice();
		public abstract double totalPrice(double pr);
		public abstract double totalPrice(double qq, double pr);
	

}
