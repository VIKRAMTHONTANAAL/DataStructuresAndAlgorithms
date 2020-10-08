package starPatternPrograms;

public class DiamondProgram {
	
	
	
	
	public static void main(String []args){
		int row=5;
		
		for(int i=1;i<=row-1;i++){
			
			
			
			for(int k=1;k<=row-i+1;k++){
				System.out.print(" ");
				
			}
			for (int l=1;l<=i;l++){
				System.out.print("* ");
				
			}					
			
		
		
		System.out.println();
		
		
	}
	
		
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
