package array;

public class sortAnArray {

	static int[] Array={200,0,14,13,12,11,10,9,8,7,6,5,4,3,2,1}; 
	
	public static void main(String[]args){
		
		
		
		sortArray(Array);
		
		//Sorted Array
		for (int i=0;i<Array.length;i++){
			System.out.print(Array[i]+" ");
		}
		
		
		
		
		
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub

		for(int i=0;i<(array.length-1);i++){
			int min=Array[i];
			int minIndex=i;
			
			for(int j=i+1;j<array.length;j++){
				
				if(Array[j]<min){
					min=Array[j];
					minIndex=j;
					
				}
				
						}
			
			swap(i,minIndex);
			
			
		}
		
		
	}
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
		int temp=Array[i];
		Array[i]=Array[j];
		Array[j]=temp;
		
	}
	
	
}
