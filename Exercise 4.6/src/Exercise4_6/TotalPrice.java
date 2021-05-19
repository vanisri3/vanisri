package Exercise4_6;


	class AppleTotalPrice implements Fruitprices{
		
		double a1 = 2.99; //price for less than 20
		double a2 = 1.99; // price for more than 20
		

		public double totprice(double qq) {
			return a1 * qq;
		}

		public double totprice(double qq, double dd) {
			return (a2 * qq)*(1-dd);
		}
	}
		
		
		class GrapesTotalPrice implements Fruitprices{
			double gp1 = 4.00;// price for less than 25
			double gp2 = 8.00; // price for more than 25
			
	
			public double totprice(double qq) {		
				return gp1* qq;
			}

			@Override
			public double totprice(double qq, double dd) {
				return ( gp2 *qq) * ( 1-dd);
			}
		}
		
		
		class StrawberryTotalPrice implements Fruitprices{
			double st1 = 10.00; // price less than 15
			double st2 = 18.00;// price more than 15
			
		

			public double totprice(double qq) {
				return st1 * qq;
			}

		
			public double totprice(double qq, double dd) {
				return (st2*qq)* (1-dd);
			}
		}
		
	
		
	


