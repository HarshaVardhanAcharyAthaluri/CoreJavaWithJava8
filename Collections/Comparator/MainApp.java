import java.util.*;

public class MainApp{
	
	public static void main(String[] args){

		Set h = new TreeSet();
		 
		h.add(new Student(4,"Joe")); 
		
		h.add(new Student(2,"Monika")); 
		
		h.add(new Student(1,"Ross")); 
		
		h.add(new Student(3,"Chandler"));
		
		h.add(new Student(6,"Phebe"));
		
		h.add(new Student(5,"Rachel"));
		
		Iterator it = h.iterator();
		
		while(it.hasNext()){
			Student st = (Student)it.next();
			System.out.println(st.displayStudent());
		}
	}	
}