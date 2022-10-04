class myapp {
	public static void main(String[] args){
		
		System.out.println("<====== Home Needs ======>");
		 HomeNeeds hn = new HomeNeeds();
		 hn.discount(100);
		 
		 
		 System.out.println("<====== Electronics ======>");
		 Electronics ele = new Electronics();
		 ele.discount(200);
		 
		 System.out.println("<====== Garments ======>");
		 Garments g = new Garments();
		 g.discount(150);
	
	}
	
	
}