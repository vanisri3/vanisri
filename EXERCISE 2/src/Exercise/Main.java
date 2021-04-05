package Exercise;



public class Main {

	public static void main(String[] args) {
	
		Smartphone vivo= new Smartphone (); 
		Smartphone huawei = new Smartphone  ();
		Smartphone  samsung = new Smartphone (); 
		Smartphone  iphone = new Smartphone ();
		
		System.out.println();
		System.out.println();
		
		System.out.println(">>>>>>>> VIVO SPECIFICATION  <<<<<<<");
		vivo.printSpec( " v19" , " red", 399,55.6, 'Y');
		vivo.price_before_discount(499.55, 5);
		vivo.price_after_discount(499.55, 5, 0.1, 399);
	    vivo.average_price(399, 799, 1500, 4000, 4);
	    
		System.out.println();	
		System.out.println();
		
		System.out.println(">>>>>>>> HUAWEI SPECIFICATION <<<<<<<<");
		huawei.printSpec(" nova2i", " black", 799, 45.56, 'N');
		huawei.price_before_discount(799, 10);
		huawei.price_after_discount(799, 10, 0.15, 799);
		huawei.average_price(399, 799, 1500, 4000, 4);
		
		System.out.println();
		System.out.println();
		
		System.out.println(">>>>>>>> SAMSUNG SPECIFICATION  <<<<<<<<");
		samsung.printSpec(" Galaxy10", "grey", 1500, 60.32, 'Y');
		samsung.price_before_discount(1500, 8);
		samsung.price_after_discount(1500, 8, 0.15, 1500);
	    samsung.average_price(399, 799, 1500, 4000, 4);
	    
	    System.out.println();
	    System.out.println();
		
		System.out.println(">>>>>>>> IPHONE SPECIFICATION  <<<<<<<<");
		iphone.printSpec(" iphone12", " white", 4000, 55.25, 'N');
		iphone.price_before_discount(4000, 9);
		iphone.price_after_discount(4000,9, 0.25, 4000);
		iphone.average_price(399, 799, 1500, 4000, 4);
	
	}

}
