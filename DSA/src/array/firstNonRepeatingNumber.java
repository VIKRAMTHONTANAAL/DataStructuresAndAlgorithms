package array;

public class firstNonRepeatingNumber {
	
	static  int array2[];
	
	
	public static void main(String [] args){
		
		int array1[]={9, 4, 9 ,6 ,7, 4};
		
		printTheFirstNonRepeatingNumber(array1);
		
		
	}

	 static int printTheFirstNonRepeatingNumber(int[] array1) {
				 
		 int countOfNumberInArray2=0;
		 
		 
		array2=new int[array1.length];
		 
		 
		 
		 for(int i=0;i<array1.length;i++,countOfNumberInArray2++){
			 
			 
			 if(!isPresentInArray2ThenRemove(array1[i],countOfNumberInArray2)){
				 
				 array2[countOfNumberInArray2]=array1[i];
				 
			 }
			 else{
				 array2[i]=-100;
				 
			 }
			
			 
		 }
		 
		 for(int i=0;i<countOfNumberInArray2;i++){
			 if(array2[i]!=-100){
				 System.out.println(i);
				 return i;
			 }
			 
			 
		 }
		 
		 
		 
		 
		 
		 System.out.println("-1");
		 return -1;
		
	}

	 static boolean isPresentInArray2ThenRemove(int N,int arrayFilledTill) {
		 
		 int tombstone=-100;
		 
		 for(int j=0;j<arrayFilledTill;j++){
			 if(array2[j]==N){
				 array2[j]=tombstone;
				 
				 return true;}
			 
		 }
		 
		
		return false;
	}
	

}
