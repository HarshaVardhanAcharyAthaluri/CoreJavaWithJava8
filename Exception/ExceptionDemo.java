public class ExceptionDemo{
	
	public static void main(String[] args){

		
		System.out.println(" Statement 1");
		try{
		System.out.println(" Divison Operation " + 14/0);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println(" Statement 2");
		
		
		System.out.println(" Statement 3");
		
		
		
	}
	
	
	
}