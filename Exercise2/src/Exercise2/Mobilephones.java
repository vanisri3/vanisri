package Exercise2;

public class Mobilephones {

	public static void main(String[] args) {

		Samsung a = new Samsung(); //Create new object name as a
		   System.out.println("This phone's colour is " + a.colour);
		   System.out.println("This phone's model number is " +a.model);
		   System.out.println("This phone have "+ a.storage + " storage");
		   System.out.println("This phone size is " + a.size + " inches");
		   a.calling();
		   a.receivemessage();
		   a.sendmessage();
		   a.playsongs();
		   a.connect_bluetooth();
		   
		 
		   
		 System.out.println();
		 Apple b = new Apple(); // second object as b
		   System.out.println("This phones's colour is " + b.colour);
		   System.out.println("This phones's model number is " +b.model);
		   System.out.println("This phone have "+b.storage + " storage");
		   System.out.println("This phone's size is "+b.size + " inches");
		   b.calling();
		   b.receivemessage();
		   b.sendmessage();
		   b.playsongs();
		   b.connect_bluetooth();
		 
	}

}
