package example2;

public class main {

	public static void main(String[] args) {
		Class1 c = new Class1(); //Create new object name as c
   System.out.println(c.x);
   System.out.println(c.s);
   c.printHi();
   
   
   Class1 d = new Class1 (); // create second object as d
    System.out.println( d.x);
    System.out.println(d.s);
    d.printHi();
    
    class2 e = new class2();
    e.printSum();
	}

}
