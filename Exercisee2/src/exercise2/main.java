package exercise2;


public class main {

	public static void main(String[] args) {
		
           
		Smartphones samsung  = new Smartphones();
		
		    samsung.colour = " Black";
		    samsung.model = "SM - A105G/DS";
		    samsung.storage =  " 32 GB";
		    samsung.size = 6.2;
		    
		   System.out.println("This phone's colour is " + samsung.colour);
		   System.out.println("This phone's model number is " +samsung.model);
		   System.out.println("This phone have "+ samsung.storage + " storage");
		   System.out.println("This phone size is " + samsung.size + " inches");
		   
		   System.out.println();
		   samsung.calling();
		   samsung.receivemessage();
		   samsung.sendmessage();
		   samsung.playsongs();
		   samsung.connect_bluetooth();
		   
		   System.out.println( "-------------------------------------------------");
		   
		   System.out.println();
			Smartphones iphone = new Smartphones();
			 iphone.colour = " white";
			 iphone.model = "MC922LL/A";
			 iphone.storage =  " 60 GB";
			 iphone.size = 5.0;
			 
		  System.out.println("This phones's colour is " + iphone.colour);
		  System.out.println("This phones's model number is " +iphone.model);
		  System.out.println("This phone have "+iphone.storage + " storage");
	      System.out.println("This phone's size is "+iphone.size + " inches");
		  System.out.println();
		  
			   iphone.calling2();
			   iphone.receivemessage2();
			   iphone.sendmessage2();
			   iphone.playsongs2();
			   iphone.connect_bluetooth2();
			   
			   System.out.println();
			   System.out.println( ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		   
			 
			   Human male = new Human();
			 male.name = " Daniel" ;
				 male.gender = 'M';
				 male.age = 25;
				 male.weight = 58.00;
				 male.height= 175.04;
		   
			 System.out.println( "My name is : " + male.name);
			 System.out.println( "My gender is :" + male.gender);
			 System.out.println( "I am " + male.age);
			 System.out.println( "My weight is :" + male.weight + " kg");
			 System.out.println( "My height is: " + male.height + " cm");
			 
				 System.out.println();
			    male.walk();
				male.eat();
				male.sleep();
				male.speak();
				
				System.out.println( "-----------------------------------------------");
				
				System.out.println();
				 Human female = new Human();
				  female.name = "Devi" ;
				  female.gender = 'F';
				  female.age = 23;
				  female.weight = 48.00;
				  female.height= 153.02;
			   
			 System.out.println( "My name is : " + female.name);
			 System.out.println( "My gender is :" + female.gender);
			 System.out.println( "I am " + female.age);
			 System.out.println( "My weight is :" + female.weight + " kg");
			 System.out.println( "My height is: " + female.height + " cm");
			 
			 System.out.println();
					 
				    male.walk2();
					male.eat2();
					male.sleep2();
					male.speak2();
	}

}
