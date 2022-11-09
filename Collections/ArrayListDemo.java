import java.util.ArrayList;

public class ArrayListDemo{
	
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Raju");
		al.add("Vivek");
		al.add(770); 
		al.add(16.7);
		al.add(true);
		al.add("Vivek");
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains(770));

		System.out.println("Get WIth index :: "+al.get(2));
		
		System.out.println("IsEMpty :: " + al.isEmpty());
		
		al.remove(16.7);
		
		System.out.println(al);
		
		al.remove("Raju");
		
		System.out.println(al);
		
		al.clear();
		
		System.out.println("Aftrer Clear");
		
		System.out.println("IsEMpty :: " + al.isEmpty());
		
		System.out.println(al);
		
		
		
		
	}
	
	
	
}