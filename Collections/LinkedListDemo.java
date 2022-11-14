import java.util.*;

public class LinkedListDemo{
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		
		Student s1 = new Student(1,"Rose");
		Student s2 = new Student(2,"Monika");
		Student s3 = new Student(3,"Joe");
		Student s4 = new Student(4,"Phebe");
		Student s5 = new Student(5,"Rechel");
		
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);
		ll.add(s5);

		Iterator  it = ll.iterator();
		
		while(it.hasNext()){
			Student st = (Student)it.next();
			System.out.println(st.displayStudent());
		}

	}	
}