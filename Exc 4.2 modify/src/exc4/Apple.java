package exc4;

public class Apple extends Fruit{

	
	protected double price;
	protected int quan;
	private char size;
	private int discount ;

	
	
	
	public Apple ( String name, double pc, int q,char s ,int d) {
		super (name);
		price = pc;
		quan = q;
		size = s;
		discount = d;
		
		totalprice( pc,q);
		totalprice (pc,q,d);
		totalprice();
		
	}
	
	    public double totalprice() { // overloading with no parameters 
	    	return price;
	    }
	   
	    public double totalprice (double pc ,int q)  {  // overloading with 2 parameters
		   return price * quan;
	}
	    
	    public double  totalprice ( double pc,int q , int d) { // overloading with 3 parameters
	    	return discount/100  * (pc* q);
	    	
	    }
	    
	    public String facts() { // overriding method 
	    	return "A large apple tree can take 8 to 10 years to produce the firs fruit";
	    }
	    public String toString() { // overriding method
	    	return "Facts :" +  facts() +   "\nPrice" +"RM" +  totalprice() + "\nSize :" + size + "\nTotal price " + "RM " +  String.format( "%.2f" ,totalprice(price, quan))+
	    			 "\nTotal "+ "RM" +      totalprice(price , quan , discount) ;
	    			    
	    }
	
}
