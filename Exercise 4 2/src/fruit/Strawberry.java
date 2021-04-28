package fruit;

public class Strawberry extends Fruits {

double protein , fiber,fat;
	
	int calori_protein , calori_fiber,calori_fat;
	
	public Strawberry(String name, double p,double f,double ft , int cp,int cfb, int cf) {
		super(name);
		this.protein = p;
		this.fiber = f;
		this.fat = ft;
		this.calori_protein = cp;
		this.calori_fiber = cfb;
		this.calori_fat = cf;	
		
	}
		
	public double totalCaloricequivalent(int cp, int cfb, int cf) { // overloading with 3 parameters 
		return cp + cfb + cf ;
	}
	
	public double gettotalmicronutrients() {
		return this.protein + this.fat + this.fiber;
	}
   
     
     public String toString() { // overriding methods 
    	 return  "\nTotal micronutrients " + gettotalmicronutrients()  ;
     }
}

