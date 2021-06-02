package NonAlcholicBeverage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
	// shop information
		 Non_AlcholicBeverage_Shop n = new Non_AlcholicBeverage_Shop ("Vanisri's Non Alcholic Beverage",2018, 
				 "01126863297", "No 234 , Jalan Mahsuri 0900 ,Padang Serai Kedah");
		 System.out.println();
		 
	
	//Product description
		   ProductDescription  benefit  = new ProductDescription (" Can improve memory, decrease fatigue, Improve your mental functioning " , 
					" Improves Skin Complexion", " Help strengthen bones and prevent osteoporosis.");
		   ProductDescription p = new   ProductDescription ("TYPE");
		  System.out.println();
			
	// Marketing
		 Marketing m = new Marketing();
		 System.out.println();
		 Marketing mt = new Marketing(40, "refreshing beverage RM15", 3);
		 System.out.println("*******************************************************");
		 Marketing mt2 = new Marketing( 60, "Stimulate beverage RM10", 5, "Water Bottle" );
		 System.out.println("*******************************************************");
		 m.print();
		 System.out.println("********************************************************");
		
// inventory of product
				System.out.println(" \t\t\t\t\tInventory Management"); 
				System.out.println("=================================================================================================");
				System.out.println("Name Of Beverage | Type of Beverage     | Beverage Price  | Inventory Stock | date stock in     |");		
				System.out.println("-------------------------------------------------------------------------------------------------");
				inventory i = new inventory ("Stimulating","Coffee",13.00 ,200,"12/2/2021");
				inventory i2 = new inventory ("Stimulating", "Tea" ,15.00,150 ,"10/2/2021");
				inventory i3 = new inventory ("Refreshing" , "water", 9.50, 50 ,"2/2/2021");
				inventory i4 = new inventory ("Refreshing" ,"syrup",16.70  ,200 ,"21/2/2021");
				inventory i5 =new inventory ("Refreshing" ,"juice", 5.50,300 ,"21/2/2021");
				inventory i6 = new inventory ("Nourishing" ,"milk", 7.00, 200  ,"5/3/2021");
			    System.out.println("-------------------------------------------------------------------------------------------------");

    //customers purchase	
		   Customer c = new Customer();
		   c.printreceipt();
		   System.out.println();

 //Employee Details
		       Employee e = new Employee();
			   Employee em = new Employee("id");
			   System.out.println();
				 		
	// Total sales
			System.out.println("***** TOTAL SALES INFORMATION IN A MONTH ********");
			
			Sales s = new Sales();
		     s.setinventory_purchase();
		     s.setincidental_charges();
		     s.settotalsale();
		     
		    System.out.println("============================================================");
			System.out.println("Total inventory spending :RM" + String.format( "%.2f" , s.getinventory_purchase()));
			System.out.println("Total incidental charges :RM" + String.format( "%.2f" , s.getincidental_charges()));
			System.out.println("Total sale :RM" +String.format( "%.2f" ,  s.gettotal_sale()));
	     	System.out.println("Total profit :RM" + String.format( "%.2f" , s.getprofit()));
	     	System.out.println("==============================================================");	
		
	}

}
