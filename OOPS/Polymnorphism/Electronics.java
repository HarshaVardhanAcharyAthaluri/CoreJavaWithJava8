class Electronics extends Discount{
	
	void discount(int price){
		
		double dicountedPrice = (price*20)/100;
		
		double finalPrice = price - dicountedPrice;
		
		System.out.println("Actual Price : " + price);
		System.out.println("FinalPrice after 20% Discount: " + finalPrice);
	}
}