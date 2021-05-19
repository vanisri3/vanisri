package Exercise4_6;


	 class AppleDiscount implements Discount {
			public double ratediscount() { // implementation method
			return 0.15; // 15%
			}
			 
		}
		 
	 
		 class RedappleDiscount implements Discount{
			 public double ratediscount() {// implementation method
			 return 0.10;// 10%
		  }
		 }
		 
		 class GreenappleDiscount implements Discount{
			 public double ratediscount() {// implementation method
				 return 0.05; // 5%
			 }
		 }
			 
			 class GrapesDiscount implements Discount{
				 public double ratediscount() {// implementation method
					 return 0.08; // 8%
				 }
			 }
			 
			 class StrawberryDiscount implements Discount{
				 public double ratediscount() {// implementation method
					 return 0.20; // 20%
				 }

}
			 

