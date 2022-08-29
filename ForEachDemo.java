class ForEachDemo{
	public static void main(String[] args){	
			int a[] = {1,2,3,4,5,6,7,8,9,10};
			
			//FOR LOOP
			for(int i=0;i<a.length;i++){
				System.out.println(" FOR LOOP Numbers ::: " + a[i]);
			}
			
			//FOR-EACH LOOP
			for(int res:a){
			System.out.println("FOR EACH LOOP Numbers ::: " + res);		
			}
	}
}