package array;

/**
 * @author vt29
 *
 */
public class PrintDuplicateElementsInTheArrayWithTimeComplexityOfN {
public static void printDuplicateElementsInTheArray(int arr[]){
	
	for(int i=0;i<arr.length;i++){
	if(arr[Math.abs(arr[i])]>=0){
		arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
		
	}
	else if(arr[Math.abs(arr[i])]!=Integer.MIN_VALUE){
		System.out.print(Math.abs(arr[i])+ " ");
		arr[Math.abs(arr[i])]=Integer.MIN_VALUE;
	}
	
	}
	
	
}

	public static void main(String []args){
		int arr[]={1,2,2,2,2,2,2,2,3,3,3,3,4,4,5,6,7,6,5,8,9,10};
		printDuplicateElementsInTheArray(arr);
		
	}
	
}
