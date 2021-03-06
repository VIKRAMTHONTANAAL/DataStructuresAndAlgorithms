package stacks;
import java.util.Scanner;

public class StaticStack {

	int []array;
	int Top=-1;
	int sizeOfStack;

	public StaticStack(int sizeOfStack){
		this.sizeOfStack=sizeOfStack;
		array=new int[sizeOfStack];
	}


	public void push(int addElement){

		if(Top==-1){

			Top=0;
			array[Top]=addElement;
		}
		else if(Top+1==sizeOfStack){

			try{

				throw new ArrayIndexOutOfBoundsException();

			}

			catch(Exception e){
				System.out.println("Stack is full, you cant push anymore");
				e.printStackTrace();
				throw e;
			} 
		}

		else{
			Top++;
			array[Top]=addElement;
		}
		


	}
	public void pop(){

		if(Top==-1){
			System.out.println("Stack is empty pop operation cannot be performed");
		}
		else{
			System.out.println("popopopopopopopopopopopopopopopo");
			System.out.println(array[Top]);
			System.out.println("popopopopopopopopopopopopopopopo");
			Top--;
		}

		if(Top==-1){
			System.out.println("Stack is empty now dont pop anymore");
		}

	}

	public void peek(){

		if (Top == -1){
			System.out.println("STACK IS EMPTY");


		}

		else{
			
			System.out.println("************");
			System.out.println(array[Top]);
			System.out.println("************");

		}
	}

	public boolean isEmpty(){
		if(Top==-1){
			return true;
		}

		else{
			return false;
		}


	}
	public boolean isFull(){

		if(Top+1==sizeOfStack){
			return true;			
		}
		else{

			return false;
		}
	}


public void printAll(){
	if(Top==-1){
		
		System.out.println("Stack is empty, nothing left to print");
	}
	else{
		System.out.println("/////////////////////////////////////////////////////////////////////");
		for (int i=Top;i>=0;i--){
			
			System.out.println(array[i]);
		}
		System.out.println("/////////////////////////////////////////////////////////////////////");
	}
	
}

public void sortAStackUsingRecursionFunction(int i){
while(i>0){
	
	
	
	sortAStackUsingRecursionFunction(i--);
}
	
	
	
}


	public static void main(String []args)throws Exception{
		try{
		Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Size of the stack to be created");
		int sizeOfStack=scan.nextInt();
		 	
		scan.close();
//		int sizeOfStack=10;

		StaticStack stack=new StaticStack(sizeOfStack);
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		stack.push(5);
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		if(stack.isFull()==true){

			System.out.println("Stack is  Full");
		}
		stack.printAll();
		stack.pop();		
		stack.pop();
		if(stack.isFull()!=true){

			System.out.println("Stack is not Full");
		}
		stack.printAll();
		stack.peek();

		if(stack.isEmpty()!=true){
			System.out.println("Stack is not Empty");

		}

	
		stack.pop();		
		stack.pop();
		stack.pop();		
		stack.pop();
		stack.pop();		
		stack.pop();
		stack.pop();		
		stack.pop();

		if(stack.isEmpty()==true){
			System.out.println("Stack is Empty");

		}
		stack.pop();
		stack.printAll();
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		stack.push(5);
		stack.push(10);
		stack.push(9);
		stack.push(8);
		
		stack.push(7);
		stack.printAll();

		stack.push(7);
		}
		
		catch (Exception e){
		e.printStackTrace();	
			throw e;
		}
	}



}
