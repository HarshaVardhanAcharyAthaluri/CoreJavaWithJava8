import java.util.*;

public class IteratorDemo{
	
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Lakshmi");
		al.add("Shayam");
		al.add("Pravalika");
		al.add("Veena");
		al.add("Anu");
		al.add("Raju");
		System.out.println(" Iterating the elements with For");
		for(int i = 0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println(" Iterating the elements with ForEach");
		for(Object item:al){
			System.out.println(item.toString());
		}
		System.out.println(" Iterating the elements with Iterator");
		Iterator it= al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}	
}