package array;

public class printMissingNumber {





	public static void main(String []args){


		int array[]={1,2,3,4,5,6,7,8,10};

		printTheMissingNumber(array);




	}

	static void printTheMissingNumber(int[] array) {



		int temp=array[0];
		temp++;

		for (int i=1;i<array.length;i++,temp++){
			if(array[i]!=temp){

				System.out.println(temp);
				return;
			}



		}

		System.out.println(temp);









	}






}
