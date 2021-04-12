package Exercise2SetterGetter;

public class Main {

	public static void main(String[] args) {
		
		
		 System.out.println("====Samsung====");
		 Televisyen samsung  = new Televisyen ();
    
		 samsung.setBrand("Samsung");
		 samsung.setcolour("Black");
		 samsung.setheight(62.02);
		 samsung.setwidth(110.07);
		 samsung.setvolume("high");
		 
		 System.out.println("Brand  : " + samsung.getbrand());
		 System.out.println("Colour : " + samsung.getcolour());
		 System.out.println("Height :" + samsung.getheight() + "cm");
		 System.out.println("width :" + samsung.getwidth() + "cm");
		 System.out.println("volume :" + samsung.getvolume());
		 samsung.fact();
		 
		 
		 System.out.println();
		 System.out.println("=====Sony=====");
		 
		 Televisyen sony = new Televisyen ();
		 
		 sony.setBrand("Sony");
		 sony.setcolour("White");
		 sony.setheight(74.07);
		 sony.setwidth(132.08);
		 sony.setvolume("low");
		  
		 System.out.println("Brand  :" + sony.getbrand());
		 System.out.println("Colour :" + sony.getcolour());
		 System.out.println("Height :" + sony.getheight() + "cm");
		 System.out.println("width :" + sony.getwidth() + "cm");
		 System.out.println("volume :" + sony.getvolume());
		 sony.facts();
		 
		 
		  
	}

}
