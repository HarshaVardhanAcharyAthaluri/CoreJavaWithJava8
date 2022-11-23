import java.io.*;

public class FileReaderDemo{
	
	public static void main(String[] args){
		
		try{
		File f= new File("demo.txt");
		FileReader fr = new FileReader(f);
		
		int temp;
		while((temp= fr.read())!=-1)
		System.out.print((char)temp);
		
		}
		catch(IOException   fiex){
			System.out.println(fiex.getMessage());
		}

	}	
}