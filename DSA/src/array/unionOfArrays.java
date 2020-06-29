package array;

import java.util.HashSet;

public class unionOfArrays {

	static int countNuOfElementsInUnion=0;
	
	
	public  static void main(String[]args) {
	
		int array1[]={85,25,1,32,54,6};//,6,7
		int array2[]={85,2};
		
		
	getUnionOfArrays(array1,array2);
		
	System.out.println(countNuOfElementsInUnion);

	}

	static int[] getUnionOfArrays(int[] array1, int[] array2) {
	
		int unionArray[]=new int[array1.length+array2.length];
		
		HashSet<Integer> hash=new HashSet<Integer>();
		
		
		
		for(int i=0;i<array1.length;i++){
			
			unionArray[i]=array1[i];
			countNuOfElementsInUnion++;
			hash.add(array1[i]);
			
		}
		
		for(int i=0;i<array2.length;i++){
			
			if(!hash.contains(array2[i])){
				
			unionArray[countNuOfElementsInUnion++]=array2[i];
		}
		
		
		}
		return unionArray;
		
	}
	
	
	
	
	
	
}
