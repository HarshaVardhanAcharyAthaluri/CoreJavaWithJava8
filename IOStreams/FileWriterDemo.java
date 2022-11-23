import java.io.*;

public class FileWriterDemo{
	
	public static void main(String[] args){
		
		try{
		File f= new File("output.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello All Iam File write a simple way to write the content");
		fw.flush();
		fw.close();
		
		
		}
		catch(IOException   fiex){
			System.out.println(fiex.getMessage());
		}

	}	
}