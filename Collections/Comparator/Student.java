public class Student implements Comparable{
	
	private int rollNumber;
	private String name;
	
	public Student(int rollNumber,String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public String displayStudent(){
		return "student roll :: "+ rollNumber+ " - name :: "+name; 
		
	}

	public 	int compareTo(Object obj){
				Student st  = (Student)obj;
				if(this.rollNumber<st.rollNumber)
					 return -1;
				else if(this.rollNumber>st.rollNumber)
					return 1;
				else
					return 0;
	}

}