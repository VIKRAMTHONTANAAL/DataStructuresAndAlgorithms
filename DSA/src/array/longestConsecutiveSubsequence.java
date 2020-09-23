package array;

public class longestConsecutiveSubsequence {



	public static void main(String []args){



		int array[]={1, 9, 3, 10, 4, 20, 2};//

	

		System.out.println(	findTheLongestConsecutiveSubsequence(array));

	}

	private static int findTheLongestConsecutiveSubsequence(int[] array) {


		int n=0;		
		//Array Sorted using insertion Sort
		for(int i=1;i<array.length;i++){
			int j=i;
			while(j>0){
				if(array[j-1]>array[j]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				j--;
			}
		}

		int max=0;
		int count=0;
		for(int i=0;i<array.length-1;i++){

			if(array[i]+1==array[i+1]){
				count++;
				if(count >max){
					max=count;
				}

			}
			else{
				count=0;
			}




		}
System.out.println();

		return max+1;
	}

}
