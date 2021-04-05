package Exercise;

public class Smartphone {

	String brand;
	double price;
	String colour;
	double weight;
	char fingerprint;
	int quantity;
	
	
	void printSpec( String brand, String colour,int price, double weight, char print) {
		System.out.println(" Brand      \t:" + brand);
		System.out.println(" colour     \t:" + colour);
		System.out.println(" price      \t:" + " RM "+ price);
		System.out.println(" weight     \t: " + weight + "g");
		System.out.println(" fingerprint\t: " + print);
	
		System.out.println("=============================================");
	}
	
		void price_before_discount( double price, int s) {
			double  total = price * s;
			System.out.printf("Total price  before discount is : RM% .2f " , total);
			System.out.println();
						
    }
		
		void price_after_discount( double price, int quan, double d, double p ) {
		double totall = price * quan;
		double dis= d * totall;
			
			System.out.printf( "Total price after discount is : RM% .2f " , (totall - dis) ) ;
			System.out.println();
						
			
	}
		
	   void average_price ( double price,double price1 , double price2, double price3, int e ) {
		   double average = price + price1 + price2  + price3 / 4;
		   System.out.printf( "The  average price is : RM% .2f " ,   average  );
		   System.out.println();
		   System.out.println("---------------------------------------------");
		   
    }
	   
}
