import java.io.*;

public class Student implements Serializable{
	 public int rollNumber;
	 public String name;
	 public transient String pinnumber;
	
	public Student(int rollNumber,String name,String pinnumber){
		this.rollNumber = rollNumber;
		this.name = name;
		this.pinnumber = pinnumber;
	}
	
	
}