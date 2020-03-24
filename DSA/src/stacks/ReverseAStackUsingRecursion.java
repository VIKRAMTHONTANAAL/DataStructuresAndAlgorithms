package stacks;
import java.util.Stack;

public class ReverseAStackUsingRecursion {

	public static Stack<Integer> ReverseAStackUsingRecursiveFunction(Stack<Integer> s){
		if(s.empty()){
			return s;
		}
		int x=s.pop();
		ReverseAStackUsingRecursiveFunction(s);
		s=insertAtBottom(x,s);
		return s;
	}


	public static Stack<Integer> insertAtBottom(int x,Stack<Integer>s) {
		if(s.empty()){
			s.push(x);
			return s;
		}
		int o=s.pop();
		insertAtBottom(x,s);
		s.push(o);
		return s;
	}


	public static void main(String [] args){


		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Stack Elements before reversing");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Peek --->"+s.peek());
		System.out.println("After Reversing the stack");
		s=ReverseAStackUsingRecursiveFunction(s);
		System.out.println("Peek --->"+s.peek());
		System.out.println("Stack Elements After reversing");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		

	}

}
