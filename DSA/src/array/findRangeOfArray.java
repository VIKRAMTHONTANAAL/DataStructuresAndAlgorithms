package array;

public class findRangeOfArray {

	static int[] Array={200,0,14,13,12,11,10,9,8,7,6,5,4,3,2,1,-3}; 
	
	public static void main(String[]args){
		
		int minMax[]=new int[2];
		
		minMax=minAndMaxInArray.getMinAndMaxInArray(Array);
		
		System.out.println(minMax[1]-minMax[0]);
		
	}
}
