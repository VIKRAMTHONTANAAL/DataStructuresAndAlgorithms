package sorting;

public class RadixSort {

	public  static int[] radixSort(int[]arr){



		
		
		
		return arr;
	}




	public static void main (String[]args){
		int []arr={5,9,2,1,4,5,6,7,8,3,234,243,52,7,8,9,2,44,1234,7654,143,144,145,-1,-2,-3,-100,0,0,-12,-500,10000};
		arr=radixSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
