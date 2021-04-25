package fruitinheritance;

public class Fruit {

	private String name;
	
	public Fruit ( String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
	}
	
	
	public String toString() {
		return "Fruits:" + name;
	}
	
	
}

