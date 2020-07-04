package array;

public class subArrayMaximum {

	public static void main (String [] args){
	
	int array[]={-1,-2,-3,-4};
	
	System.out.println(getSubArrayMaximum(array));
	
	
	}

	static int getSubArrayMaximum(int[] array) {
		// TODO Auto-generated method stub
		
		int max=array[0];
		
		
		
		for(int i=0;i<array.length;i++){
			
			
			if(array[i]>max){
				
				max=array[i];
			}
			
			int sum=0;
			
			for(int j=i;j<array.length;j++){
				
				
	
				
				sum=sum+array[j];
				
				
				if(sum>max){
					
					max=sum;
				}
				
				
				
			}
			
						
		}
		
		return max;

		
	}
	
	
	
	
}
