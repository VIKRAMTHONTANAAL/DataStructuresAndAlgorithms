package queues;
import java.util.Scanner;

public class StaticQueue {
	int sizeOfQueue;
	int array[]=new int[sizeOfQueue];
	int Front=-1,Rear=-1;


	public StaticQueue(int sizeOfQueue){
		this.sizeOfQueue=sizeOfQueue;

	}

	public void enqueue(int addElement){
		if(Front==-1&&Rear==-1){
				Front++;
				Rear++;
				array[Rear]=addElement;
			
		}
		else if(Rear+1==sizeOfQueue){
			try{

				throw new ArrayIndexOutOfBoundsException();

			}

			catch(Exception e){
				System.out.println("Queue is full, you cant add anymore");
				e.printStackTrace();
				throw e;
			} 
			
		}
		else{
			Rear++;
			array[Rear]=addElement;			
			
		}
			}
	
	public void printAll(){
		if(Front==-1&Rear==-1){
			System.out.println("Queue is empty nothing to print");
		}
		else{
			
			System.out.println("///////////////////////////////////////////////////");
			for(int i=Rear;i>=0;i--){
				
			System.out.print(array[i]+"		");	
				
			}
			System.out.println("///////////////////////////////////////////////////");
		}
		
		
	}
	
	public boolean isEmpty(){
		
		if(Front==-1&Rear==-1){
			return true;
		}
		return false;
				
	}
	
	public boolean isFull(){
		
		if(Rear+1==sizeOfQueue){
		return true;	
		}
		return false;
	}
	
	public void dequeue(){
		if(Front==-1&&Rear==-1){
			System.out.println("Queue is empty cannot perform dequeue operation");
			
		}
		else{
			System.out.println("dequeuedequeuedequeuedequeuedequeue");
			System.out.println(array[Front]);
			System.out.println("dequeuedequeuedequeuedequeuedequeue");
			Front++;
		}
		
	}
	

	public static void main(String []args){
		int sizeOfQueue=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the queue you want to be created");
		sizeOfQueue=scan.nextInt();
		scan.close();

		StaticQueue queue=new StaticQueue(sizeOfQueue);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);

		if(queue.isFull()==true){

			System.out.println("Queue is full");

		}
		queue.printAll();
		queue.dequeue();
		queue.dequeue();

		queue.printAll();

		if(queue.isFull()!=true){

			System.out.println("Queue is not full");
		}

		if(queue.isEmpty()!=true){

			System.out.println("Stack is not empty");
		}
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.printAll();
		if(queue.isEmpty()==true){

			System.out.println("Stack is empty");
		}



		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.printAll();
		if(queue.isFull()==true){

			System.out.println("Queue is full");

		}
		queue.enqueue(10);

	}






}
