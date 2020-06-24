package array;

public class KthLargestAndSmallestElementInArray {
	
	static int[] Array={200,0,14,13,12,11,10,9,8,7,6,5,4,3,2,1}; 
	
	
	public static void main (String []args){
		
		int K=3;
		
	
		Array=sortAnArray.sortArray(Array);
		
		//Sorted Array
				for (int i=0;i<Array.length;i++){
					System.out.print(Array[i]+" ");
				}
				System.out.println();
		/*Array*/
		printKthLargestAndSmallestElementInArray(K,Array);
		
		
		
		
	}


	 static void printKthLargestAndSmallestElementInArray(int K,int[] sortedArray) {
		
		System.out.println("Kth smallest Element "+sortedArray[K-1]);
		
		System.out.println("Kth largest Element "+sortedArray[sortedArray.length-K]);
		
	}
	
	
	
	

}
