package NonAlcholicBeverage;

import java.util.Scanner;

public class Employee { // User defined class
	
	String name, id, address, position, shift;
    char gender;
    double salary, epf;
    int workinghour , overtime;
    
  
    public Employee(String n, String p,String s,String id,char g ,int wh ){// constructor with argument
		 this.name = n;
		 this.position = p;
		 this.shift = s;
		 this.id = id ;
		 this.gender= g;
		 this.workinghour= wh; 
	 }
    
	public Employee(){// constructor with no arguments
		    System.out.println("*** EMPLOYEE DETAILS ****");

	 }
	 
	
	 public  Employee(String id){ // constructor with 1 argument
          id = id;
           
           
            System.out.println("Below is employee id ");
            System.out.println("1.s2345");
			System.out.println("2.s4567");
			System.out.println("3.s7899");
			System.out.println("Please Enter employee ID to search their details:");
			 Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
                     
              if (choice==1) { // admin can see employee details by enter their id
             System.out.println("=================================================");
			 System.out.println("Name : Haaziq" );
		     System.out.println("Gender : M");
		     System.out.println("Id : s2345");
			 System.out.println("Position : Inventory Control Specialist");
			 System.out.println("Shift :Night");
			 System.out.println("Working hour : 12");
             System.out.println("================================================");
             System.out.println("Basic salary :  RM1800 " );
             System.out.println("Overtime payment : RM32" );
             System.out.println("Epf deduction : RM82 ");
             System.out.println("==============================================");
             System.out.println("Net Salary : RM1750");
             System.out.println("==============================================");
                                               
			}
			else if (choice==2) {
             System.out.println("===============================================");
			 System.out.println("Name : Salena " );
		     System.out.println("Gender : F");
			 System.out.println("Id : s4567");
			 System.out.println("Position : Cashier");
			 System.out.println("Shift :Morning");
			 System.out.println("Working hour : 8");
             System.out.println("===============================================");
             System.out.println("Basic salary :  RM1400 " );
             System.out.println("Overtime payment : RM50" );
             System.out.println("Epf deduction : RM60 ");
             System.out.println("================================================");
             System.out.println("Net Salary : RM1390");
             System.out.println("================================================");
                               
			}
			else {
                System.out.println("====================================");
		
                 System.out.println("Name : Ady " );
				 System.out.println("Gender : M");
				 System.out.println("Id : s7899");
				 System.out.println("Position : CustomerService Representative");
				 System.out.println("Shift :Morning");
				 System.out.println("Working hour : 12");
                 System.out.println("====================================");
                 System.out.println("Basic salary :  RM1600 " );
                 System.out.println("Overtime payment : RM60" );
                 System.out.println("Epf deduction : RM65 ");
                 System.out.println("======================================");
                 System.out.println("Net Salary : RM1595");
                 System.out.println("================================");
			}
	  }
	
	
	
}