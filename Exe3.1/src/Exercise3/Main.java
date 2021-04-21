package Exercise3;

public class Main {

	public static void main(String[] args) {
		
		 
	    System.out.println("------SAMSUNG----");
		Televisyen objTV = new Televisyen ( "HD", 1850 ,2);
		System.out.println(objTV );
		System.out.println("Total : " + objTV.total());
		
		System.out.println();
		
		System.out.println("-----SONY-------");
		Sony objsony = new Sony( "LED", 1500,5);
		System.out.printf("\nThe total price : " + "RM " + "%.2f" ,objsony.totprice());
		System.out.printf("\nPrice after discount :" +  "RM " + "%.2f" , objsony.getdiscount());
	    System.out.println("\nThe total voltage : " + objsony.resistance() + "volt");
		
		System.out.println();
		System.out.println(objsony  );
}
}
