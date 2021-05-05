package OverloadingOverriding;

public class Main {

	public static void main(String[] args) {
	
		
		
		System.out.println();
		
		System.out.println("---Grapes---");
		Grapes g = new Grapes("Grapes", 13, 1 , 2);
		System.out.println("________________________________________________");
		System.out.println(g);
		System.out.println();
		
		System.out.println();
		
		System.out.println("---Strawberry---");
		Strawberry sw = new Strawberry("Strawberry", 5, 2, 5, 50);
		System.out.println("________________________________________________");
		System.out.println(sw);
		System.out.println();
		
		System.out.println();
		
		System.out.println("---Apple---");
		Apple a = new Apple("Apple", 65, 1.99); 
		System.out.println("_________________________________________________");
		System.out.println(a);
		System.out.println();
		
	    System.out.println();
		
		System.out.println("---Green Apple---");
		GreenApple gp = new GreenApple("Green Apple", 5, 15, "Vitamin C", 'B' );
		System.out.println("__________________________________________________");
		System.out.println(gp);
		System.out.println();
	
		
		System.out.println();
		
		System.out.println("---Red Apple---");
		RedApple rp = new RedApple("Red Apple", 12, 20,"vitamin c", 'S');
		System.out.println("___________________________________________________");
		System.out.println(rp);
		System.out.println();
		
		
	
		
		
	}

}
