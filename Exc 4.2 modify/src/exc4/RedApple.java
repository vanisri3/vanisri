package exc4;

public class RedApple extends Apple {
	
	
	private int mass;
	private int quan1;
	private int quan2;
	

	public RedApple(String name, double pc, int q, char s,int d,int m,int qq  , int qqq) {
		super(name, pc, q, s, d);
	
		this.mass=m;
		this.quan = q;
		this.quan1=qq;
		this.quan2 =qqq;
		
		average(m,q);
		average(m,q,qq);
	    average ( m,q,qq,qqq);
		
	}
	
	public int average (int m , int q) { //overloading with  2 parameters
		return m/q;
	}
	
	public int average(int m,int q,int qq) {// overloading with 3 parameters
		return  m / ( q +  qq) ;
	}
	
	public int average(int m, int q, int qq, int qqq){// overloading with 4 parameters 
		return m/ ( q + qq + qqq);
	}
	
	public String facts() {// overriding
		 return "Red  apples are high in dietary fiber " ;
			
	}

	public String toString() { // overriding
		return "Facts:" + facts () +  "\nAverage for 5 apples: " + average(mass, quan) + "gram"
				+ "\nAverage for 8 apple :" + average(mass, quan, quan1) + "gram"
				+ "\nAverage for 10 apple: " + average(mass, quan, quan1, quan2) + "gram";
	}
	
	
	
	

}
