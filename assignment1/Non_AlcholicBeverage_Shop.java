package NonAlcholicBeverage;

public class Non_AlcholicBeverage_Shop { // user defined class

	 // predefined class
	 String ShopName ,phonenenumber, location;
	 int yearestablished ;
	 
	 
	   public Non_AlcholicBeverage_Shop(String sn , int y , String p, String l) {// constructor with argument
		   this.ShopName = sn;
		   this.yearestablished = y;
		   this.phonenenumber = p;
		   this.location= l;
		   
		   printInfo();
		   
		   
	   }
	   public void printInfo() { // print info method
		   System.out.println("=============== Information of Shop =======================");
		   
		   System.out.println("Shop Name :" + this.ShopName);
		   System.out.println("Year Shop Established :" + this.yearestablished);
		   System.out.println("Phone number of shop : " + this.phonenenumber);
		   System.out.println("Location :" + this.location);
		   
		   System.out.println("===========================================================");
	   }
}
	  

