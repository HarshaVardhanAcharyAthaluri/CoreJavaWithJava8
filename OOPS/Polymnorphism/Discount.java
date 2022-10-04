class Discount{
	
	void discount(int price){
		
		double dicountedPrice = (price*10)/100;
		
		double finalPrice = price - dicountedPrice;
		
		System.out.println("Actual Price : " + price);
		System.out.println("FinalPrice after 10% Discount: " + finalPrice);
	}

}