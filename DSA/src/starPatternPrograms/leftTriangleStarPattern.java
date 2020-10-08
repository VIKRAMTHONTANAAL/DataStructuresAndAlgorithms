package starPatternPrograms;

public class leftTriangleStarPattern {

	
	
	
	public static void main(String []args){
				
		
		
		
		int row=5;
		
		
		for(int i=0;i<row;i++){
			
			for(int j=0;j<row;j++){
				
				
				if(j>=row-1-i){
				System.out.print("*");
				}
				
				else{
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
