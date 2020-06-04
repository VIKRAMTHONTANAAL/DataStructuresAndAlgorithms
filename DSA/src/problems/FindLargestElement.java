package problems;

public class FindLargestElement {

	public static void main(String []args){
		
		int array[]={1,2,45,43,32,64,76,88,99,101,141,123,321,543,0,3,4};
		
		int Largest=array[0],SecondLargest=array[0];
		
		for (int i=1;i<array.length;i++){
			
			
			if(array[i]>Largest){
				SecondLargest=Largest;
				Largest=array[i];
				
				
			}
		}
		
		System.out.println(Largest+ " Largest Element");
		System.out.println(SecondLargest+ " SecondLargest Element");
		
		
		
	}
	
	
}
