public class DemoThread implements Runnable{
	
	public void run(){
		
		for(int i=1;i<=10;i++){
			System.out.println(" Number ::: "+i);
		}
	}
	
	public static void main(String[] args){
		
		DemoThread dt = new DemoThread();
		
		Thread t = new Thread(dt);
		t.start();
		
	}
	
	
}