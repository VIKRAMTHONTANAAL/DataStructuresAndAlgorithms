package array;

public class nuOfOccurences {

	static int[] Array={200,0,14,13,12,11,11,11,11,11,10,9,8,7,6,5,4,3,2,1}; 
	
	
	public static void main (String[]args){
		
		
		int nuOfOccurences=findNumberOfOccurences(Array,199);
		
		System.out.println("NU OF OCCURENECES " + nuOfOccurences);
		
	}


	 static int findNumberOfOccurences(int[] array, int n) {
	
		 int count=0;
		 
		 for(int i=0;i<array.length;i++){
			 
			 if(array[i]==n){
				 count++;
				 
			 }
			 
		 }
		 
		 return count;
		 
	}
	
	
	
	
	
	
}
