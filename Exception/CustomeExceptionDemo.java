class CustomeExceptionDemo{
	
	public static void main(String[] args){
		
		Integer age = Integer.parseInt(args[0]);
		
		if(age<18)
			throw new AgeNotSuffecientException(" You are not eligible as your age is lessthan 18");
		
		System.out.println("You are Eligble for this ");
		
	}
}