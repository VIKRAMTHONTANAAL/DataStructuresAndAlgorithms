package searching;

public class minimumElementInASortedAndRotatedArrayUsingBinarySearch {

	public static void main(String []args){

		//int array[]={};
		//	4,5,1,2,3
		//
		//10,20,30,40,50,5,7
		int array[]={3, 4, 5, 1, 2};
		System.out.println(findMinimumElementInASortedAndRotatedArrayUsingBinarySearch(array,0,array.length-1));

	}

	public static int findMinimumElementInASortedAndRotatedArrayUsingBinarySearch(int[] array, int low, int high) {

		if(high-1==low){
			if(array[high]<array[low])return array[high];
			else {
				return array[low];
			}
			
		}
		
		if(low==high || array[low]<array[high])
		{

			return array[low];
		}

		int	mid=(low+high)/2;

		if (array[mid]>array[low]){

			return findMinimumElementInASortedAndRotatedArrayUsingBinarySearch(array,  mid+1, high);
		}
		else{

			return findMinimumElementInASortedAndRotatedArrayUsingBinarySearch(array, low , mid);

		}

	}






}
