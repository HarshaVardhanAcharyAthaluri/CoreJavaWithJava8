import java.io.*;

public class FileOutputStreamDemo{
	
	public static void main(String[] args){
		
		try{
		FileInputStream fis = new FileInputStream("demo.txt");
			
		FileOutputStream fos = new FileOutputStream("output.txt");
		
		
		BufferedInputStream br = new BufferedInputStream(fis);
		
		int temp;
		while((temp = br.read())!=-1)
		fos.write((char)temp);
		br.close();
		
		}
		catch(IOException   fiex){
			System.out.println(fiex.getMessage());
		}

	}	
}