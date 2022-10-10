class myapp{

	
	public static void main(String[] args){

		AbstractDemo ad = new AbstractDemoChild();
		
		ad.display();
		//ad.show();
		
		AbstractDemo sc = new SecondChild();
		
		sc.display();
		//sc.message();
		

	}
}