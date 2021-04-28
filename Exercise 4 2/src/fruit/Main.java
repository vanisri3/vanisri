package fruit;



public class Main {

	public static void main(String[] args) {
		

		Fruits f = new Fruits("Fruit");
		System.out.println(f);
		
		System.out.println();
		
		System.out.println("---Apple---");		
		Apple a = new Apple( "Apple" , 8.08 , 3 , 'B' );
		System.out.println(a);
   
    	
		System.out.println();
	
		System.out.println("---Grapes---");
		Grapes g = new Grapes("Grapes" ,"Purple" ,60);
		System.out.println(g);
		System.out.println("Total quavelent " + g.totalCaloricequivalent(5, 2));
		
		System.out.println();
		
		System.out.println("---Strawberry---");
		Strawberry s = new Strawberry("Strawberry " ,1.0, 3.0, 0.5, 2, 1, 2);
		System.out.println(s);
		System.out.println("Total equavelent " + s.totalCaloricequivalent(2, 1, 2));
		
		
		System.out.println();
		
		System.out.println("---Green Apple---");
		GreenApple gp = new GreenApple("Green Apple" , 13.50 ,5 ,'s', 16.0);
		System.out.println(gp);
		gp.getvitamin( " The fruit contain vitamin " + "c");
	
		System.out.println();
		
		System.out.println("---Red Apple---");
		RedApple rp = new RedApple( "red apple" , 10.00, 2,'B' ,5,25);
     	System.out.println(rp);



	}

}
