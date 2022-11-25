public class MyThread extends Thread{
	
	String name;
	
	public MyThread(String name){
		this.name = name;
	} 
	
	public void run(){
		
		for(int i=1;i<=10;i++){
			System.out.println(name+ " ::: "+i);
		}
	}
	
	public static void main(String[] args){
		
		MyThread mt = new MyThread("Thread1"); // One thread
		MyThread mt1 = new MyThread("Thread2"); // Second thred
		
		Thread t = new Thread(mt);
		Thread t1 = new Thread(mt1);
		
		
		t.start();
		t1.start();
		
	}
	
}