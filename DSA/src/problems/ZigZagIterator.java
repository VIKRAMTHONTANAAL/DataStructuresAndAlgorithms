package problems;

public class ZigZagIterator {






	public static void zigZagIterator(int []arr1,int arr2[]){

		boolean flag=false;
		int i=0,j=0;


		while(i<arr1.length & j<arr2.length){
			flag=!flag;

			if(flag){

				System.out.print(arr1[i]+" " );
				i++;
			}
			else{

				System.out.print(arr2[j]+" ");
				j++;
			}


		}

		while (j<arr2.length){
			System.out.print(arr2[j]+" ");
			j++;
		}
		while(i<arr1.length){
			System.out.print(arr1[i]+" ");
			i++;
		}




	}




	public static void main(String[]args){


		int arr1[]={1,2,7,8,9,10,11,12,13};
		int arr2[]={3,4,5,6};

		zigZagIterator(arr1,arr2);


	}
}
