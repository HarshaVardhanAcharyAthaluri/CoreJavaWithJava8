import java.util.*;

public class HashMapDemo{
	
	public static void main(String[] args){
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"Joe");
		hm.put(2,"Chandler");
		hm.put(3,"Rachel");
		hm.put(4,"Ross");
		hm.put(5,"Pheebe");
		hm.put(6,"Monika");
		
		System.out.println("Size :: "+hm.size());
		System.out.println(hm.containsKey(5));
		System.out.println(hm);
		System.out.println(hm.get(4));
		System.out.println(hm.get(6));
		hm.remove(5);
		System.out.println(hm.containsKey(5));
		System.out.println("Size :: "+hm.size());
		System.out.println(hm);
		
		hm.put(6,"Unkmown");
		hm.put(7,"Unkmown");
		System.out.println(hm);
		
		
		Set s = hm.keySet();
		
		Iterator it =s.iterator();
		
		while(it.hasNext()){
			Integer key = (Integer)it.next();
			System.out.println("Key :: "+ key + " Value :: "+ hm.get(key));
			
		}
		
		
		
	}	
}