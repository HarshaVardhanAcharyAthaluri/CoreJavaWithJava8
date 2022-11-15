import java.util.*;

public class TreeSetDemo{
	
	public static void main(String[] args){
		
		Set h = new TreeSet();
		 h.add("Nokia");
		 h.add("Sony");
		 h.add("Samsung");
		 h.add("Motorola");
		 h.add("Apple");
		
		 System.out.println(h);
		 
		 Iterator it = h.iterator();
		 
		 while(it.hasNext()){
			  System.out.println(it.next());
		 }


	}	
}