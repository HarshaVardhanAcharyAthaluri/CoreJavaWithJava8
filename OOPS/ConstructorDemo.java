class ConstructorDemo{
	
	ConstructorDemo(){
		System.out.println("Hello I'm Default Constructor");	
	}
	
	ConstructorDemo(String name){
	System.out.println("Hello "+ name);	
	}

	ConstructorDemo(String greet, String name, int time){
	System.out.println("Hello "+ name + " " + greet + " It's " + time + "AM/PM");	
	}
	

	public static void main(String[] args){
		
		ConstructorDemo  m = new ConstructorDemo();
		ConstructorDemo  m1 = new ConstructorDemo("Harsha");
		ConstructorDemo  m2 = new ConstructorDemo("Harsha","Good Morning",8);
		
	
		
	}
}