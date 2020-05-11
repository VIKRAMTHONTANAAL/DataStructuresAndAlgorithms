package array;

public class minSubArray {
	
	
	
	
	public static void main(String[] args){
		
		int Array[]={10,4,3,5,6,3,8,1};
		
		//int Array[]={3, -4, 2, -3, -1, 7, -5};
		int k=3;
		int minSum=0;
		
	minSum=findTheMinimumContiguousSubArrayOfSizeK(Array,k);
	System.out.println(">>>>>>>>>>>>>>Minimum>"+minSum+">>>>>>>>>>>>>");
				
		
	}
	public static int findTheMinimumContiguousSubArrayOfSizeK(int []Array,int k){
		
		int minSum=Array[0]+Array[1]+Array[2];
		
		
		for(int i=1;i<Array.length-k;i++ ){
			int count=0;
		     int     sum=0;
			for(int j=i;count<k;j++,count++){
				sum=sum+Array[j];
											
			}
			if(sum<minSum){
				minSum=sum;
			}
			
			
		}
		
		
		
		return minSum;
	}
	
	
	
	
	
	

}
