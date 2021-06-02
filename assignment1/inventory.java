package NonAlcholicBeverage;

public class inventory {// user defined class
	

	// Pre-define class
	
	String beveragetype;
	String name ;
	double beverageprice;
	int beveragestock; 
	String datestockin;

	public inventory( String bt , String nm , double pc , int st ,String dt) {//1.4 Constructor with argument
		this.beveragetype = bt;
		this.name  = nm;
		this.beverageprice = pc;
		this.beveragestock = st;
		this.datestockin = dt;
		
		System.out.println( this.name  + "\t\t |" + this.beveragetype  +"\t\t|"  + this.beverageprice
		+ "\t\t  |\t" + this.beveragestock+ "\t    |\t" + this.datestockin +"\t|");
	
	}
	
	}


