package sorting;

public class InsertionSort {
	public  static int[] insertionSort(int[]arr){
		for(int i=1;i<arr.length;i++){
	int j=i;
			while(j>=1 && arr[j]<arr[j-1]){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
				
			}
	
		
		
		}
		return arr;
	}
	public static void main (String[]args){
		int []arr={5,9,2,1,4,5,6,7,8,3,234,243,52,7,8,9,2,44,1234,7654,143,144,145,-1,-2,-3,-100,0,0,-12,-500,10000,-1000,-2000};
		arr=insertionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
