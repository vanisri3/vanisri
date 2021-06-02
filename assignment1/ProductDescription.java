package NonAlcholicBeverage;

public class ProductDescription { // user defined class

	
	String type;
	String benefit_stimulating, benefit_Refreshing , benefit_nourishing;
	
	
	public ProductDescription( String st , String r, String n ) { // constructor with arguments
		  
		    this.benefit_stimulating = st;
		    this.benefit_Refreshing= r;
		    this.benefit_nourishing = n;
		    printinfo();
		    
	  }
	  
	  public void printinfo() { // printinfo method
		  
		  System.out.println("===WELCOME TO VANISRI'S NON-ALCHOLIC BEVERAGE SHOP===");
          System.out.println();
         
	      System.out.println("This shop sell 3 types of non-alcholic beverage");
	      System.out.println();

          System.out.println("---Benefits of the BEVERAGES ---");
          System.out.println("Stimulating Beverage  :" + this.benefit_stimulating );
          System.out.println("Refreshing Beverage :" + this.benefit_Refreshing);
          System.out.println("Nourishing Beverage  :" +  this.benefit_nourishing);
		  
	  }
            
      ProductDescription(String t) { //Constructor with one argument
		type = t;
		System.out.println("**********************************************************");
		System.out.println("\t   Beverages " + t);
		System.out.println("**********************************************************");
	   
       System.out.println("----Stimulating Type Beverage-----");
       System.out.println();
                
		System.out.println("ItemName : Coffee");
		System.out.println("Price    : RM 13.00");
		System.out.println("Brand    : Nescafé Classic Instant");
		System.out.println("Weight   :  100g");
		System.out.println("Volume   : 240ml");
		System.out.println("Shape    : Can");
		System.out.println();
                
		System.out.println("ItemName : Tea");
		System.out.println("Price    : RM 15.00");
		System.out.println("Brand    : BOH");
		System.out.println("Weight   :  20g");
		System.out.println("shape    : packet");
        System.out.println("=================================================");

	    System.out.println("----Refreshing Type Beverage-----");
        System.out.println();
		System.out.println("ItemName : mineral water ");
		System.out.println("Price    : RM 9.50");
		System.out.println("Brand    : Spritzer Mineral water");
		System.out.println("Weight   :  100g");
		System.out.println("Volume   : 500ml");
		System.out.println("shape    : Bottle");
            
        System.out.println();
	
		System.out.println("ItemName : syrup ");
		System.out.println("Price    : RM 16.70");
		System.out.println("Brand    : Monin");
		System.out.println("Weight   :  100g");
		System.out.println("Volume   : 500ml");
		System.out.println("Shape    : Bottle");
               
		System.out.println();
		
		System.out.println("ItemName : orange juice ");
		System.out.println("Price    : RM 5.50");
		System.out.println("Brand    : Tropicana");
		System.out.println("Weight   :  100g");
		System.out.println("Volume   : 500ml");
		System.out.println("Shape    : paper Bottle");
        System.out.println("=================================================");
	
		System.out.println("----Nourishing  Type Beverage-----");
        System.out.println();
		System.out.println("ItemName : milk ");
		System.out.println("Price    : RM 7.00");
		System.out.println("Brand    : Dutch lady");
		System.out.println("Weight   :  20g");
		System.out.println("Volume   : 200ml");
		System.out.println("Shape    : paper Bottle");
        System.out.println("=================================================");
	
	  }
       
   }


	

