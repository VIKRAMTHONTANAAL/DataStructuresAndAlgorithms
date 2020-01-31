package array;

public class maxProductOfTwoIntegersInGivenArray {
	public static void main(String [] args){

		
		int numArray[]={-10, -3, 5, 6, -2};
		
maxProductOfTwoIntegersInGivenArrayFunction(numArray);
		


	}
	
	
	static void maxProductOfTwoIntegersInGivenArrayFunction(int []numArray){
		int maxProduct, integer1,integer2;
		integer1=numArray[0];
		integer2=numArray[1];
		maxProduct=numArray[0]*numArray[1];
		for(int i=0;i<numArray.length-1;i++){

			if(maxProduct<numArray[i]*numArray[i+1]){
				integer1=numArray[i];
				integer2=numArray[i+1];
				maxProduct=numArray[i]*numArray[i+1];

			}


		}




		System.out.println("The integer 1 is"+ integer1 + " The integer 2 is "+ integer2);
		System.out.println("The Max Product is "+ maxProduct);

	}
}
