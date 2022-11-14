public class Student{
	
	private int roll;
	private String name;
	
	public Student(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
	
	public String displayStudent(){
		return "student roll :: "+ roll+ " - name :: "+name; 
		
	}

}