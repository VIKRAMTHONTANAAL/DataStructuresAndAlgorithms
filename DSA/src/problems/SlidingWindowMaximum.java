package problems;

public class SlidingWindowMaximum {
	
	public static void printSlidingWindowMaximum(int [] arr, int k){
		
		for(int i=k-1;i< arr.length;i++){
			
			int max=arr[i];
			
			for (int j=i;j>i-k;j--){
				
				if(arr[j]>max){
					max=arr[j];
					
				}
				
				
			}
			
			System.out.print(max+" ");
			
		}
		
		
		
		
	} 
	
	
	
	
	
	
	
	public static void main(String [] args){
		
		int []arr={5,9,2,1,4,5,6,7,8,3,234,243,52,7,8,9,2,44,1234,7654,143,144,145,-1,-2,-3,-100,0,0,-12,-500,10000,-1000,-2000};
		//int []arr={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k=4;
		
		printSlidingWindowMaximum(arr,k);
		
		
		
	}
	
	
	
	

}
