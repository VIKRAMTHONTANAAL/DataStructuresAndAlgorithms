package array;

public class searchInArray {

	static int Array[]={1,2,3,4,5,6,7,8,9};
	
	
	public static void main(String []args){
		
	
	
	if(isElementFoundInArray(10)){
		System.out.println("FOUND Element");
	}
	else{
		System.out.println("ELEMENT NOT FOUND");
	}
	
		
	}

	private static boolean isElementFoundInArray(int N) {
		// TODO Auto-generated method stub
		for(int i=0;i<Array.length;i++){
			if(N==Array[i]){
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
}
