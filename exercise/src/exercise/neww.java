package exercise;

import java.io.PrintStream;
import java.util.Scanner;

public class neww {

	public static void main(String[] args) {
  

String type []= {" burger", " pizza", " kfc"};

		 System.out.println("  \t\t----WELCOME TO THE CAFE---- ");
		Scanner scan= new Scanner ( System.in);
		 System.out.print( " enter name :" + "  ");
		 String name= scan.nextLine ();
		 
		 System.out.print(" enter id : " + " ");
		 int id = scan.nextInt();
		 
		 System.out.println();
		 System.out.println("\tMenu\t  Price");
		 System.out.println("  A. BURGER       RM 2.00");
		 System.out.println("  B. PIZZA        RM 4.00");
		 System.out.println("  C. KFC          RM 6.00");
		 
              order();
	}

	private static void order() {
		
		double price [] = {2.00 , 4.00 , 6.00};
		Scanner scan= new Scanner ( System.in);
		System.out.print(" Choose your food by enter A,B,C ");
		//Scanner scan= new Scanner ( System.in);
		String type = scan.nextLine();
		System.out.print(" enter quantity");
		int quatity = scan.nextInt();
		
		int quantity=scan.nextInt();
		int pricee = 0;
		double total = pricee * quantity ;
		
	
		
	}

}
