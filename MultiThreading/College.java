public class College implements Runnable{
	
	int seats;
	
	College(int seats){
		this.seats = seats;
	}
	
	public synchronized void run(){
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		System.out.println(seats + "Seats avilable before Allotment to "+ name);
		
		if(seats>0){
			try{
			Thread.sleep(2000);
			System.out.println("Congrats admision alloted to "+ name);
			seats = seats-1;
			}catch(InterruptedException ex){
				ex.printStackTrace();
				}
		}
		else{
			System.out.println( "Unable to Allotment Seat to "+ name);
		}
		if(seats>0)
		System.out.println(seats + "Seats avilable After Allotment to "+ name);
		
	}


}