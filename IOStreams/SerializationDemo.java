import java.io.*;

public class SerializationDemo{
	
	public static void main(String[] args) throws IOException{
		Student s = new Student(Integer.parseInt(args[0]),args[1],args[2]);
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
		System.out.println("Student Object into Stident Text");
		
		
		

	}	
}