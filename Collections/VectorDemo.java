import java.util.*;

public class VectorDemo{
	
	public static void main(String[] args){
		Vector v = new Vector();
		
		Student s1 = new Student(1,"Rose");
		Student s2 = new Student(2,"Monika");
		Student s3 = new Student(3,"Joe");
		Student s4 = new Student(4,"Phebe");
		Student s5 = new Student(5,"Rechel");
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		v.add(s5);

		Iterator  it = v.iterator();
		
		while(it.hasNext()){
			Student st = (Student)it.next();
			System.out.println(st.displayStudent());
		}

	}	
}