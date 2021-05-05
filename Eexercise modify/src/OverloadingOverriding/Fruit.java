package OverloadingOverriding;

public class Fruit {
	
protected String name;
	
	public Fruit ( String name) {
		name = name;
		System.out.println("Fruit constructor is invoked");
	}
	
	public String toString() {
		return "Fruits:" + name;
	}


}
