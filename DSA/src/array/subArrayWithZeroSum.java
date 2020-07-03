package array;
import java.util.*;

public class subArrayWithZeroSum {
	
	
	
	
	
	public static void main(String [] args){
		
	int array[]={4,2,-3,1,6};
		//int array[]={4,2,0,-2,6};
		
		if(checkIfSubArrayWithZeroSumExists(array)){
			
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		
		
		
		
	}

	 static boolean checkIfSubArrayWithZeroSumExists(int[] array) {
		 int sum=0;
		 
		 Set <Integer> set=new HashSet<Integer>();
		

		 
		 for(int i=0;i<array.length;i++){
			 sum=array[i]+sum;
			 
			 if(array[i]==0||sum==0||set.contains(sum)){
				 
				 return true;
			 }
			 
			 set.add(sum);
		 }
		 
		 
		 
		return false;
	}
	
	
	

}
