package Exercise4_6;


public class Main {

	public static void main(String[] args) {
	

		System.out.println();
		
		System.out.println("=====================================================");
		System.out.println("---Grapes---");
		Grapes g = new Grapes("Grapes", 20, 26, 1 );
		//System.out.println("____________________________________________________");
		System.out.println(g);
		System.out.println();
	
		System.out.println();
		
		System.out.println("=====================================================");
		System.out.println("---Strawberry---");
		Strawberry sw = new Strawberry("Strawberry", 5, 2, 5, 50);
		//System.out.println("____________________________________________________");
		System.out.println(sw);
		System.out.println();
	
		System.out.println();
		
		System.out.println("=====================================================");
		System.out.println("---Apple---");
		Apple a = new Apple("Apple", 65, 1.99); 
		//System.out.println("_____________________________________________________");
		System.out.println(a);
		System.out.println();
		
	    System.out.println();
		
	    System.out.println("=====================================================");
		System.out.println("---Green Apple---");
		GreenApple gp = new GreenApple("Green Apple", 12, 20,"vitamin ", 's');
		
		System.out.println(gp);
		System.out.println();

		System.out.println();
			
		System.out.println("=====================================================");
		System.out.println("---Red Apple---");
		RedApple rp = new RedApple("Red Apple", 12, 20,"vitamin c", 'S');
		//System.out.println("_______________________________________________________");
		System.out.println(rp);
		System.out.println();
		
	}

		

	}


