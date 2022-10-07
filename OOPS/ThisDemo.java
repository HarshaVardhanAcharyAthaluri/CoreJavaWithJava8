class ThisDemo {
	String msg = "Hello Iam Instance Variable";
	
	void display(){
		String msg = "Hello Iam local Variable";
		System.out.println("Without This keyword "+msg);
		System.out.println("WIth this keyword "+this.msg);
		
	}
	
	
	
	public static void main(String[] args){
		ThisDemo m = new ThisDemo();
		m.display();
		
	}
}