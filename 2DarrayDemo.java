class 2DarrayDemo{
	public static void main(String[] args){		
		int a1[][] = {{1,2},{3,4},{5,6}};
		
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++){
				System.out.println(a1[i][j]);
			}
			System.out.println("----");
		}
		System.out.println(" Iterating with For Each");
		for(int temp[]:a1){
			for(int x:temp){
				System.out.println(x);
			}
		}
	}
}