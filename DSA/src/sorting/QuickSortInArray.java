package sorting;

public class QuickSortInArray {
	
	static int[] Array={200,0,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		
		

		Array=quickSortAnArray(0,Array.length-1,Array);
		
		for (int i=0;i<Array.length;i++){
			System.out.print(Array[i]+" ");
		}
		
	}


 static int[] quickSortAnArray(int low,int high,int[] array) {
		// TODO Auto-generated method stub
	 
	 int k=0;
	 
	if(low<high){
		 
		 k=partition(low,high,array);
		 
		 quickSortAnArray(low,k,array);
		 
		 quickSortAnArray(k+1,high,array);		 
		 
		 
	 }
	 
	 
	 return array;
	}


 static int partition(int low, int high, int[] array) {
	// TODO Auto-generated method stub
	 
	 
	 int i=low;
	 int j=high;
	 
	 while(i<j){
		 
		do{
			i++;
		}while(array[i]<array[low]&&i<high);
		 
		
		 while(array[j]>array[low]){
			 j--;
		 }
		 
		 
		 if(i<j){
			 
		array=	 swap(i,j,array);
			 
		 }
		 
		 
		 
		 
	 }
	 
	 swap(j,low,array);
	 
	 
	 return j;


}


static int [] swap(int i, int j,int[] array) {
	// TODO Auto-generated method stub
	int temp=array[i];
	array[i]=array[j];
	array[j]=temp;
	
	return array;
	
	
}

}
