import java.io.*;

public class FileInputStreamDemo{
	
	public static void main(String[] args){
		
		try{
		FileInputStream fis = new FileInputStream("demo.txt");
		BufferedInputStream br = new BufferedInputStream(fis);
		int temp;
		while((temp = br.read())!=-1)
		System.out.print((char)temp);
		br.close();
		}
		catch(IOException   fiex){
			System.out.println(fiex.getMessage());
		}

	}	
}