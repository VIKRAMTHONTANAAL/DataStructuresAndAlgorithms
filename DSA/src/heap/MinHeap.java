package heap;

public class MinHeap {

	static int heapArray[];
	int sizeOfHeapArray;
	static int endPointer=-1;

	MinHeap(int size){
		sizeOfHeapArray=size;
		heapArray=new int[sizeOfHeapArray];
	}

	int peek(){		
		return heapArray[0];
	}

	int getMin(){

		int min=heapArray[0];
		sinkDown();
		return min;	

	}


	void sinkDown() {
		heapArray[0]=heapArray[endPointer--];

		for (int i=0, n=0;i<endPointer/2 && heapArray[getMinOfChilds(i)]<heapArray[i];i=n){
			n=getMinOfChilds(i);
			swap(i,getMinOfChilds(i));
			

		}


	}

	boolean add(int n){
		heapArray[++endPointer]=n;
		swimUp();		

		return true;


	}

	void swimUp(){


		for(int i=endPointer;i>0;i=getParent(i)){

			if (heapArray[i]<heapArray[getParent(i)]){
				swap(i,getParent(i));
			}

		}


	}


	boolean swap(int index1, int index2){

		int temp=heapArray[index1];		
		heapArray[index1]=heapArray[index2];
		heapArray[index2]=temp;		
		return true;
	}



	int getParent(int n){
		return (n-1)/2;		

	}

	int getMinOfChilds(int n){

		if(heapArray[(2*n)+1]<=heapArray[(2*n)+2]){
			return ((2*n)+1);
		}
		else{
			return ((2*n)+2);
		}
	}

	
	void printAll(){
		for(int i=0;i<=endPointer;i++){
			System.out.print(heapArray[i]+" ");
		}
		System.out.println();
	}
	public static void main(String []args){

		MinHeap heap=new MinHeap(10);
		//CRUD Operations - Create, Retrieve, Update, Delete
		heap.add(100);
		System.out.println(heap.peek());


		heap.add(90);
		System.out.println(heap.peek());
		heap.add(80);
		System.out.println(heap.peek());
		heap.add(70);
		System.out.println(heap.peek());
		heap.add(60);
		System.out.println(heap.peek());
		heap.add(50);
		System.out.println(heap.peek());
		heap.add(40);
		System.out.println(heap.peek());
		heap.add(30);
		System.out.println(heap.peek());
		heap.add(20);
		System.out.println(heap.peek());

		heap.printAll();
		System.out.println(heap.getMin());
		
		heap.printAll();
		System.out.println(heap.getMin());
		
		heap.printAll();
		System.out.println(heap.getMin());
		
		heap.printAll();
		System.out.println(heap.getMin());
		
		heap.printAll();
		System.out.println(heap.getMin());
		
		heap.printAll();
		System.out.println(heap.peek());
	
		heap.printAll();


	}


}
