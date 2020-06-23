package array;

public class reverseAnArray {
	
	static int[] Array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,200}; 
	
	
	public static void main(String []args){
		
		
		
		
		reverseArray(Array);
		
		
		
		for (int i=0;i<Array.length;i++){
			System.out.print(Array[i]+",");
		}
		
		
		
	}


	private static void reverseArray(int[] array) {
		// TODO Auto-generated method stub
		//Lets do inplace reversing of Array
		
		
		//1 2 3 4 5
		//5 4 3 2 1
		
		
		for(int i=0;i<(Array.length/2);i++){
			
			swap(i,Array.length-1-i);
			
		}
		
		
		
		
		
		
	}


	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
		int temp=Array[i];
		Array[i]=Array[j];
		Array[j]=temp;
		
	}

}
