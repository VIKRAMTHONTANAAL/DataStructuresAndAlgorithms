package stacks;
import java.util.Scanner;

public class SortAStackUsingRecursion {

	
	
	public static void main(String []args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int sizeOfStack=scan.nextInt();
		scan.close();
		StaticStack stack=new StaticStack(sizeOfStack);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(15);
		stack.sortAStackUsingRecursionFunction(sizeOfStack);
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
