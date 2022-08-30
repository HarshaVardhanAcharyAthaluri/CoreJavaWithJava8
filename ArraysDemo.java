class ArraysDemo{
	public static void main(String[] args){	
			int a[] = new int[5];
			
			a[0] = 100;
			a[1] = 200;
			a[2] = 300;
			a[3] = 400;
			a[4] = 600;
			
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);	
			}
			System.out.println(" :::=====:::");
			for(int temp:a){
				System.out.println(temp);
			}
			
			
			int a1[] = {1,2,3,4,5,6,7,8,10};
			
			for(int i=0;i<a1.length;i++){
				System.out.println(a1[i]);	
			}
			System.out.println(" :::=====:::");
			for(int temp:a1){
				System.out.println(temp);
			}
			
			
	}
}