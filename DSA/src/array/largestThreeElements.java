package array;

public class largestThreeElements {
	


	
	
	
	
	
	public static void main(String [] args){
		
		int array[]={10,4,3,50,23,90};
	
		largestThreeElementsInArray(array);
		
		
		
	}

	static void largestThreeElementsInArray(int[] array) {
		
		
		
		int first=array[0];
		int second=array[0];
		int last=array[0];
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<array.length;i++){
					
			if(array[i]>first){
				
				last=second;
				second=first;
				first=array[i];
			
		
				
						
				
			}
			else if(array[i]>second){
				
				last=second;
				second=array[i];
			}
			else if(array[i]>last){
				last=array[i];
			}
				
			
			
			
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(last);
		
		
		
	}

}
