package sorting;

public class BubbleSort {



	public static int [] bubbleSort(int[]arr){

		int n=arr.length;
		while(n>0){
			for(int i=0;i<n-1;i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			n--;
		}
		return arr;
	}



	public static void main(String []args){

		int []arr={5,9,2,1,4,5,6,7,8,3,234,243,52,7,8,9,2,44,1234,7654,143,144,145,-1,-2,-3,-100,0,0,-12};


		arr=bubbleSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");


		}




	}

}
