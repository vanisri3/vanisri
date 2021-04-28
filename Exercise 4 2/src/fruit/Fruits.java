package fruit;

public class Fruits {

protected String name;
	
	public Fruits ( String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
	}
	
	public String toString() {
		return "Fruits:" + name;
	}
}
