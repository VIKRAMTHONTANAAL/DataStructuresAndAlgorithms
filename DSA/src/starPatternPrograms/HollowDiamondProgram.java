package starPatternPrograms;

public class HollowDiamondProgram {
	
	
	
	
	public static void main(String []args){
		int row=5;
		
		for(int i=1;i<=row-1;i++){
			
			
			
			for(int k=1;k<=row-i+1;k++){
				System.out.print(" ");
				
			}
			
			for (int l=1;l<=i;l++){
				
				if(i>=3 && (l!=1 && l!=i)){
					System.out.print("  ");
				}
			
				else{
					System.out.print("* ");}
				
			}					
			
		
		
		System.out.println();
		
		
	}
	
		
		for(int i=1;i<=row;i++){
			
				
			
				for(int k=1;k<=i;k++){
					System.out.print(" ");
					
				}
				for (int l=1;l<=row-i+1;l++){
					if(i<=3 && l!=1 && l!=row-i+1){
						
						System.out.print("  ");
					}
					
					else{
					System.out.print("* ");
					}
				}					
				
			
			
			System.out.println();
			
			
		}
		
		
	}

}
