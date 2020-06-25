package array;

public class findCommonElementsInThreeSortedArray {

	static int nuOfCommonElements=0;
	
	static int[] array1={1 ,5 ,10 ,20, 40 ,80};	
	static int[] array2={6, 7, 20, 80, 100};
	static int[] array3={3, 4, 15, 20, 30, 70, 80, 120};
	

	
	public static void main(String []args){
		
		int commonElements[];
		array1=sortAnArray.sortArray(array1);
		array2=sortAnArray.sortArray(array2);
		array3=sortAnArray.sortArray(array3);

		
		commonElements=findCommonElementsInThreeSortedArrays(array1,array2,array3);

		if(nuOfCommonElements>0){
			for(int i=0;i<nuOfCommonElements;i++){
				
				System.out.print(commonElements[i]+" ");
				
			}
			System.out.println();
			
		}
		else{
			
			System.out.println("THERE ARE NO COMMON ELEMENTS IN THE ARRAYS");
		}
		
		
	}


	static int[] findCommonElementsInThreeSortedArrays(int[] array1, int[] array2, int[] array3) {
	
		int commonElements[]=new int[array1.length];
		
		int temp=0;
		
		//1,5,10,20,40,80
		//6,7,20,80,100
		//3,4,15,20,30,70,80,120
		
		
		for(int i=0,j=0,k=0;i<array1.length;i++){
			
			while(array2[j]<array1[i] && j<(array2.length-1)){
				
				j++;
			}
			
			if(array2[j]==array1[i]){
				while(array3[k]<array2[j]&& k<(array3.length-1)){
					k++;
					
				}
				if(array3[k]==array2[j]){
					
					
					
					if(temp!=array3[k]){
						temp=array3[k];
					
					commonElements[nuOfCommonElements++]=array3[k];
					
					}
					
					
				}
				
				
			}
			
		
			
			
			
			
			
		}
		
		
		
		return commonElements;
	}
	
	
	
}
