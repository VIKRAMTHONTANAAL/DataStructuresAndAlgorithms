package array;

import java.util.HashMap;

public class firstRepeatingElement {

	
	public static void main(String[]args){
		
	//	int array1[]={1,5,3,4,3,5,6};
	//	int array1[]={1,2,3,4};
		int array1[]={1,2,2,1,3};
		printTheFirstRepeatingElement(array1);
		
		
	}

	 static int printTheFirstRepeatingElement(int array[]) {
		 
		 HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		
		 for(int i=0;i<array.length;i++){
			 
			 if(hash.containsKey(array[i])){
				 
				 
				System.out.println(hash.get(array[i]));
				return hash.get(array[i]);
				 
			 }
			 else{
				 
				 hash.put(array[i],i);
			 }
			 
		 }
		 
		 
		 
		 
		System.out.println("-1"); 
		 return -1;
		
		
		
		
	}
	
	
	
}
