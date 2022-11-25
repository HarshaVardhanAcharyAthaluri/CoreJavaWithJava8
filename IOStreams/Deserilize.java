import java.io.*;

public class Deserilize {
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("student.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		Student s = (Student)obj;
		
		System.out.println(s.rollNumber);
		System.out.println(s.name);
		System.out.println(s.pinnumber);
		
	}
	
	
	
}