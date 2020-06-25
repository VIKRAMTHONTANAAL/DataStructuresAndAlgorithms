package array;

public class findDuplicatesInArray {

	static int []Array={2,3,1,2,3,2,4,4,5,6,6,7,7,7,7,8,8,8,8,8,8,8};	
	//static int []Array={2,3,0,1};
	static boolean isDuplicatesPresent=false;

	static int numberOfDuplicateElementsPresentInArray=0; 


	public static void main(String[] args) {


		int duplicates[];

		duplicates=	findDuplicatesArray(Array);


		if(isDuplicatesPresent){
			for (int i=0;i<numberOfDuplicateElementsPresentInArray;i++)
				System.out.print(duplicates[i]+" ");

		}

		else {

			System.out.println("DUPLICATES NOT PRESENT");
		}




	}



	static int[] findDuplicatesArray(int[] array) {
		// TODO Auto-generated method stub


		int duplicates[]=new int[array.length]; 

		int temp=0;


//Array Sorted
		array=sortAnArray.sortArray(array);

		for(int i=0;i<array.length;i++)System.out.print(array[i]);
		
		System.out.println();
		
		
		
		for(int i=0;i<array.length-1;i++){
			//1,2,2,2,3,3

			if(array[i]==array[i+1]){

				isDuplicatesPresent=true;
				if(temp!=array[i]){

					temp=array[i];
					duplicates[numberOfDuplicateElementsPresentInArray++]=temp;

				}
			}



		}


		return duplicates;


	}

}
