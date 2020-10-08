package starPatternPrograms;

public class topDownPyramidProgram {
	
	
	
	
	public static void main(String []args){
		int row=5;
	
		
		for(int i=1;i<=row;i++){
			
				
			
				for(int k=1;k<=i;k++){
					System.out.print(" ");
					
				}
				for (int l=1;l<=row-i+1;l++){
					System.out.print("* ");
					
				}					
				
			
			
			System.out.println();
			
			
		}
		
		
	}

}
