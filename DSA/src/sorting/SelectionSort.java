package sorting;

public class SelectionSort {


	public  static int[] selectionSort(int[]arr){

		for(int i=0;i<arr.length;i++){

			int min=arr[i],minPointer=i;
			for(int j=i;j<arr.length-1;j++){
				if(arr[j+1]<min){
					min=arr[j+1];
					minPointer=j+1;
				}

			}
			int temp=arr[i];
			arr[i]=arr[minPointer];
			arr[minPointer]=temp;


		}


		return arr;
	}




	public static void main (String[]args){
		int []arr={5,9,2,1,4,5,6,7,8,3,234,243,52,7,8,9,2,44,1234,7654,143,144,145,-1,-2,-3,-100,0,0,-12,-500,10000};


		arr=selectionSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");


		}




	}
}
