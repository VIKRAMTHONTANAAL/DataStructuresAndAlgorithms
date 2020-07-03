package array;

public class rearrangeArrayInAlternatingPositiveAndNegativeItems {

	public static void main (String []args){

		//int array[]={1, 2, 3, -4, -1, 4};

		int array[]={-5, -2, 5, 2, 4, 7,1,8,0,-8};
		int rearrangedArray[];


		rearrangedArray=rearrangeTheArrayInAlternatingPositiveAndNegativeItems(array);


		for(int i=0;i<rearrangedArray.length;i++){

			System.out.print(rearrangedArray[i]+" ");			


		}

	}

	static int[] rearrangeTheArrayInAlternatingPositiveAndNegativeItems(int array[]) {


		int k=0,l=0;

		for(int i=0;i<array.length;i++){


			if(i%2==0){

				if(!(array[i]<0)){
					k=i;

					if(k<array.length){

						do{
							k++;

						}while(k<array.length && array[k]>=0);


						if(k<array.length)array=swap(i,k,array);

					}

				}			



			}else{

				if(!(array[i]>0)){

						l=i;

					if(l<array.length){


						do{
							l++;

						}while(l<array.length && array[l]<0);


						if(l<array.length)	array=swap(i,l,array);		




					}




				}







			}






		}





		return array;




	}



	private static int[] swap(int i, int k,int array[]) {
		// TODO Auto-generated method stub

		int temp=array[i];
		array[i]=array[k];
		array[k]=temp;

		return array;

	}









}

