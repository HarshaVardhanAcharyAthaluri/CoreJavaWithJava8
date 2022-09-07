class StudentAvg{
	public static void main(String[] args){		
		int marks[] = {45,65,75,85};
		int temp = 0;
		for(int i=0;i<marks.length;i++){
			System.out.println(" Subject "+i+" :: "+marks[i]);
			
			 temp = temp+marks[i];
			
		}		
		System.out.println("Average : " + temp/(marks.length));

	}
}