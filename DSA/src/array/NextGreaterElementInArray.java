package array;

public class NextGreaterElementInArray {


	public static void nextGreaterElementInArrayFunction(int[]arr){

		for(int i=0;i<arr.length;i++){
			int max=-1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					max=arr[j];
					break;
				}
				
			}
			System.out.println(arr[i]+ " ---> "+max);


		}



	}




	public static void main(String []args){
	//	int []arr={11,13,21,3,42,5};
		int []arr={4, 5, 2, 25, 7, 32, 8, 6};
		nextGreaterElementInArrayFunction(arr);



	}


}
