package array;

public class createWaveOfArrayUsingUnsortedArray {
	public static void main(String [] args){

		
		int numArray[]={-20,-40,10,5,4,3,-30,-10};
		
		int waveArray[]=createWaveOfArrayUsingUnsortedArrayFunction(numArray);
		
for (int i=0;i<waveArray.length;i++){
	
	System.out.print(waveArray[i]+" ");
	
}

	}
	
	
	static int[] createWaveOfArrayUsingUnsortedArrayFunction(int []numArray){
	

if(numArray[0]>numArray[1]){
	for (int i=1;i<numArray.length-1;i++){
		if (numArray[i]<numArray[i+1]){
			int temp=numArray[i];
			numArray[i]=numArray[i+1];
			numArray[i+1]=temp;
			
		}
		
		
		
		
	}
	
	return numArray;
	
}
else {
	
	return numArray;
}


		
		
		

	}
}
