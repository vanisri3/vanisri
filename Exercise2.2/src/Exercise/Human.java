package Exercise;

import java. util.*;

public class Human {
	Scanner scan = new Scanner ( System.in);
			
   void Biography() { 
	   	  System.out.println("NAME :");
	   	  String name = scan.nextLine();
	   	  System.out.println("AGE:");
	   	  int age = scan.nextInt();
	   	  scan.nextLine();
	   	  System.out.println("GENDER:");
	   	  String gender = scan.nextLine();
	   	  
		}

	void BMI(){	  
		  System.out.println();
		  System.out.println("Enter your weight and height ");		
	      double weight = scan.nextDouble();
	      double height = scan.nextDouble() / 100;
	      Math.pow(height, 2);
	      double bmi = weight /  Math.pow(height, 2);; 
	   
	     System.out.printf("Your BMI is : % .2f" , bmi);		
		 System.out.println();
	       if ( bmi < 18.05) {
	    	  System.out.println("You are UNDERWEIGHT");
	       }
	       else if ( bmi >18.05 && bmi < 25.0) {
	    	   System.out.println("You are NORMAL");
	       }
	       else if (bmi > 25.0 ) {
	    	   System.out.println("You are OVERWEIGHT");
	   
	       }	       
	}   
	
	 void maritialStatus() {	
		 System.out.println();
		    System.out.println("What is your maritial status? [Single , Marrried]");
		    scan.nextLine();
			String status = scan.nextLine();
			System.out.println("My maritial status is " + status);	  
	 }
	 
	 void eatCalories (){
		 System.out.println();
			System.out.println("Enter 1 fruit you eat today and the calori");
			
			String b = scan.nextLine();
			String c = scan.nextLine();
			
			System.out.println("The fruits is " + b);
			System.out.println("Total calories is " + c + " kcal");
						
	}
	 
	 void employementStatus (){
		 System.out.println();
		 System.out.println("What is your employement status? [work , study]" );
	     String employe= scan.nextLine();     
	     		
		String work = "work";
		if (employe.equals(work) ) {
			System.out.println("what wrk are you doing ?");
			String works = scan.nextLine();
	}
		else 
		 System.out.println("Enter your school , college or university name ");
		 String study = scan.nextLine();
		
		
	 }
}

