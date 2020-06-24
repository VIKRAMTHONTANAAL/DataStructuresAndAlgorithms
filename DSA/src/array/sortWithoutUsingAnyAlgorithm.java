package array;

public class sortWithoutUsingAnyAlgorithm {

	static int[] Array={0,1,1,1,0,0,2,2,2}; 
	
	
	
	public static void main (String args[]){
		
		
		
		Array=sortArrayWithoutUsingAnyAlgorithm(Array);
		
		for (int i=0;i<Array.length;i++){
			System.out.print(Array[i]+" ");
		}
		
		
		
		
	}



	 static int[] sortArrayWithoutUsingAnyAlgorithm(int[] array) {
		// TODO Auto-generated method stub
		 
		 int count_of_0=0;
		 int count_of_1=0;
		 int count_of_2=0;
		 
		 
		 for (int i=0;i<array.length;i++){
			 
			 
			 if(array[i]==0){
				 count_of_0++;
				 
			 }
			 
			 else if(array[i]==1){
				 
				 count_of_1++;
			 }
			 
			 else if(array[i]==2){
				 
				 count_of_2++;
			 }
		 }
		 
		 
		 for(int i=0; i<array.length;i++){
			 
			 if(count_of_0>0){
				 array[i]=0;
				 count_of_0--;
			 } else if (count_of_1>0){
				 			 
				 array[i]=1;
				 count_of_1--;
			 }else if(count_of_2>0){
				 array[i]=2;
				 count_of_2--;
				 
			 }
			 
			 
		 }
		 
		return array;
	}
	
	
}
