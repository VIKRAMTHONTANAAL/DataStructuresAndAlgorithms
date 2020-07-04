package array;

public class subArrayMaximumUsingDynamicProgramming_KandanesAlgorithm {

	public static void main (String [] args){

		int array[]={1, 2, 3, -2, 5};

		System.out.println(getSubArrayMaximum(array));


	}

	static int getSubArrayMaximum(int[] array) {
	
		int prev=array[0];
		
		int max=array[0];

		for(int i=1;i<array.length;i++){

			if((Max(array[i],prev+array[i]))>max){
				max=(Max(array[i],prev+array[i]));

			}

			prev=(Max(array[i],prev+array[i]));

		}
		return max;
	}

	static int Max(int i, int j) {
		if(i>j){
			return i;
		}else{

			return j;
		}

	}

}
