package fruitinheritance;

public class Strawberry extends Fruit {

	
	
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
	
	public double gettotalCaloricequivalent() {
		return this.calori_protein + this.calori_fiber + this.calori_fat ;
	}
	
	public double gettotalmicronutrients() {
		return this.protein + this.fat + this.fiber;
	}
   
     public double totalcal() {
    	 return this.gettotalCaloricequivalent() * this.gettotalmicronutrients();
     }
     
     public String toString() {
    	 return "Total calori equavalent " + gettotalCaloricequivalent() + "\nTotal micronutrients " + gettotalmicronutrients() +
    			 "\nTotal calories " + totalcal() + "cal";
     }
}
