class myapp extends Greet{
	
	String msg = "Hello Iam Instance variable in MyApp";
	
	void display(){
		String msg = "Hello Iam Local variable in MyApp";
		System.out.println(msg);
		System.out.println(this.msg);
		System.out.println(super.msg);
		
	}
	
	public static void main(String[] args){
		myapp m = new myapp();
		m.display();
		
	}
}