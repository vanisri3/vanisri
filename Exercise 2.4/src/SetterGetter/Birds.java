package SetterGetter;

import java.util.Scanner;

public class Birds {
	
	Scanner in = new Scanner (System.in);
	
	String wingSize;
	String colour;
	int claws;
	String TailSize;
	
	// setter method
	public void setwingSize( ) {	
		System.out.println("Enter wing size");
		this.wingSize= in.nextLine();
	}
	 
	public void setcolour () {
		System.out.println("What is the parrot colour");
		this.colour = in.nextLine();
	}
 
	public  void setclaws (  ) {
		System.out.println("Enter how many claws parrot have");
		this.claws = in.nextInt();
	}
	
	public  void setTailSize() {
		System.out.println("what is the tail size");
		this.TailSize = in.nextLine();
	}
	
	
	
	// getter method
	public String getwingSize() {
		return this.wingSize;
	}
	
	public String getcolour () {
		return this.colour;
	}
	
	public double getclaws() {
		return this.claws;
	}
	
	public String getTailSize() {
		return this.TailSize;
	}
	
}
