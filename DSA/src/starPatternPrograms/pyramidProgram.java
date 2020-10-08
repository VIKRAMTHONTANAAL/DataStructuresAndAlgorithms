package starPatternPrograms;

public class pyramidProgram {
	
	
	
	
	public static void main(String []args){
		int row=5;
	
		
		for(int i=1;i<=row;i++){
			
				
			
				for(int k=1;k<=row-i+1;k++){
					System.out.print(" ");
					
				}
				for (int l=1;l<=i;l++){
					System.out.print("* ");
					
				}					
				
			
			
			System.out.println();
			
			
		}
		
		
	}

}
