package array;

public class maximumProductSubArray {	
	
	
	
	public static void main(String[] args){		
		
		int array[]={2, 3, 4, 5, -1, 0};
		System.out.println(findMaxSubArrayProduct(array));				
		
	}

	private static int findMaxSubArrayProduct(int[] array) {
	

		int max=array[0];
		
		int sum;
		
		
		
		for(int i=0;i<array.length;i++){
			
			sum=array[0];
			
			if(sum>max){
				max=sum;
				
			}
			
			for(int j=i+1;j<array.length;j++){
				
				sum=sum*array[j];
				
				if(sum>max){
					
					max=sum;
				}
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		return max;
		
		
		
	}
	
	
	private static int MaximumOfTwo(int i,int j){
		if(i>j){
			return i;
		}
		
		else{
			return j;
		} 
		
		
		
	}
	
	
	
	
	
	
	

}
