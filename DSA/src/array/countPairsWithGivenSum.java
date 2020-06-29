package array;

public class countPairsWithGivenSum {

	
	
	
	public static void main(String[] args){
		
		//int array1[]={1,5,7,1};
			int array2[]={1,1,1,1};
			int K=2;
			
		
		
		System.out.println(countThePairsWithGivenSum(array2,K));
	}

	 static int countThePairsWithGivenSum(int[] array1, int k) {
		 
		 int count=0;
		 
		 for(int i=0;i<array1.length;i++){
			 
			 for(int j=0 ; j<array1.length &&j!=i;j++){
				 if(array1[i]+array1[j]==k){
					 count++;
				 }
				 
				 
				 
			 }
		 }
	
		return count;
	}
	
	
	
	
	
	
	
	
}
