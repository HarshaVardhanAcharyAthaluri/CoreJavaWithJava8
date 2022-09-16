class Student{
	int rollNumber = 10;
	double marks = 50.5;
	String name = "Ramu";
	
	void display(){
		System.out.println(" RollNo :: "+ rollNumber);
		System.out.println(" marks :: "+ marks);
		System.out.println(" name ::"+ name);
	}
	
	public static void main(String[] args){
		
		Student st   = new Student();
		
		st.display();
		
		
		Adress addr = new Adress();
		
		addr.display();
		
	}
	
	
}