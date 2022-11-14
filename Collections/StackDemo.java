import java.util.*;

public class StackDemo{
	
	public static void main(String[] args){
		
		Stack s = new Stack();
		
		s.push("Apple");
		s.push("Samsung");
		s.push("Sony");
		s.push("BlackBerry");
		s.push("Motorola");
		
		System.out.println("Stack :: "+ s);
		
		System.out.println("first pop  :: "+ s.pop());
		System.out.println("Second pop  :: "+ s.pop());
		
		System.out.println("Stack  :: "+ s);
		
		System.out.println("peek of stack  :: "+ s.peek());
		System.out.println("Stack :: "+ s);
		

	}	
}