package array;
import java.util.*;

public class subArrayWithZeroSum {
	
	
	
	
	
	public static void main(String [] args){
		
	//int array[]={4,2,-6,1,6};
	int array[]={2,1,3,-4,-2};
	int k=0;
		
		if(checkIfSubArrayWithZeroSumExists(array,k)){
			
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		
		
		
		
	}

	 static boolean checkIfSubArrayWithZeroSumExists(int[] array,int k) {
		 int sum=0;
		 
		 Set <Integer> set=new HashSet<Integer>();
		

		 
		 for(int i=0;i<array.length;i++){
			 sum=array[i]+sum;
			 
			 if(array[i]==k||sum==k||set.contains(sum-k)){
				 
				 return true;
			 }
			 
			 set.add(sum);
		 }
		 
		 
		 
		return false;
	}
	
	
	

}
