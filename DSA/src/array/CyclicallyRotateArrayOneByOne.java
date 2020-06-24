package array;

public class CyclicallyRotateArrayOneByOne {
	
	
	static int []Array={9, 8, 7, 6, 4, 2, 1, 3}; 
	
	public static void main(String []args){
		
		Array  = cyclicallyRotateArray(Array, 2);
		
		
		for (int i=0;i<Array.length;i++)System.out.print(Array[i]+" ");
		
	}

	 static int[] cyclicallyRotateArray(int[] array,int  k) {
		// TODO Auto-generated method stub
		 for(int i=0;i<k;i++){
			 
			 int temp=array[array.length-1];
			 for (int j=array.length-1;j>0;j--){
				 array[j]=array[j-1];
				 
			 }
			 array[0]=temp;
			 
		 }
		 
		 
		 
		return array;
	}

	

}
