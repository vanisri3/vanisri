package exc4;


public class Main {

	public static void main(String[] args) {
		

		Fruit f = new Fruit("Fruit");
		System.out.println(f);
		
		System.out.println();
		
		
	    System.out.println();
	        
		System.out.println("---Apple---");		
		Apple a = new Apple( "Apple" , 8.08 , 3 , 'B', 5 );
		System.out.println(a);

		 System.out.println();
		 
     	System.out.println("---Grapes---");
		Grapes g = new Grapes ( "Grapes" , 40.00, 2,10);
     	System.out.println(g);
         
        System.out.println();
        
        System.out.println("----Strawberry----");
        Strawberry st = new Strawberry("Strawberry", 28, 8);
        System.out.println(st);
		
		System.out.println();
		
		System.out.println("---Green Apple---");
		GreenApple gp = new GreenApple("Green Apple" , 13.50 ,5 ,'s', 16 ,25,19,4 , 50);
		System.out.println(gp);
		
	    System.out.println();
		
		System.out.println("---Red Apple---");
		RedApple rp = new RedApple( "red apple" , 10.00, 2,'B', 5, 500, 8, 10);
     	System.out.println(rp);
     	
     	
        
	}
	
	

}
