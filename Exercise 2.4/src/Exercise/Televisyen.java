package Exercise;

import java.util.Scanner;

public class Televisyen {
	
	String Brand,Colour,Type;
	double height,width;
	
	
	Scanner scan = new Scanner ( System.in);
	

	//Default constructor
	Televisyen(){
		
		System.out.println("Enter the Televisyen brand:");
		this.Brand = scan.nextLine();	
		
		System.out.println("Enter the Televisyen colour:");
		this.Colour = scan.nextLine();
		
		System.out.println("Enter the Type of the televisyen:");
		this.Type = scan.nextLine();
		
		System.out.println("Enter the height of the Televisyen");
		this.height= scan.nextDouble();
		
		System.out.println("Enter the width of the Televisyen");
		this.width = scan.nextDouble();
		
	}
	
	//Parameterized constructor
	   Televisyen( String brand ,String colour, String type, double height,double width){
		  this.Brand = brand;
		  this.Colour = colour;
		  this.Type = type;
		  this.height = height;
		  this.width = width;
		
	}

}
