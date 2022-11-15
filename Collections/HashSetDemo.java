import java.util.*;

public class HashSetDemo{
	
	public static void main(String[] args){
		
		Set h = new LinkedHashSet();
		 h.add("Apple");
		 h.add("Sony");
		 h.add("Motorola");
		 h.add("Nokia");
		 h.add("Samsung");
		 h.add("Apple");
		 h.add(null);
		 System.out.println(h);
		 
		 Iterator it = h.iterator();
		 
		 while(it.hasNext()){
			  System.out.println(it.next());
		 }


	}	
}