package Exercise;

public class Main {

	public static void main(String[] args) {
		
         Televisyen Sony = new Televisyen();
		
		System.out.println();
		System.out.println("---SONY---");
		System.out.println("The Brand is " + Sony.Brand );
		System.out.println("The type is " +  Sony.Type );
        System.out.println("The colour is " + Sony.Colour );
        System.out.println("The height is " + Sony.height + "cm");
        System.out.println("The width is " + Sony.width + "cm");

		
		System.out.println();
		
		Televisyen Samsung = new Televisyen("Samsung" , " white" ," full HD",  49.08 , 88.6);
		System.out.println("---SAMSUNG---");
		System.out.println("Brand :" + Samsung.Brand);
		System.out.println("Colour:" + Samsung.Colour);
		System.out.println("Type :" + Samsung.Type);
		System.out.println("Height :" + Samsung.height + "cm");
		System.out.println("width :" + Samsung.width + "cm");
		
		
	}

}
