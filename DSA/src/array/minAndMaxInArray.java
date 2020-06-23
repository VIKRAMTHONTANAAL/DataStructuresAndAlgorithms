package array;

public class minAndMaxInArray {

	
	static int[] Array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,200}; 
	
	public static void main(String []args){
		
		int minMaxElements[]=new int[2];
		//a[0]= min, a[1]= max
		
		minMaxElements=getMinAndMaxInArray(Array);
		
		
		System.out.println("MIN ELEMENT = "+minMaxElements[0] );
		System.out.println("MaX ELEMENT = "+minMaxElements[1] );
		
	}

	private static int[] getMinAndMaxInArray(int[] array) {
		// TODO Auto-generated method stub
		
		int[] minMaxArray=new int[2];
		
		minMaxArray[0]=array[0];
		minMaxArray[1]=array[0];
		
		for(int i=0;i<array.length;i++){
			if(array[i]<minMaxArray[0]){
				minMaxArray[0]=array[i];
			}
			if(array[i]>minMaxArray[1]){
				minMaxArray[1]=array[i];
				
			}
			
		}
		
		return minMaxArray;
		
		
		
		
		
		
		
		
	}
}
