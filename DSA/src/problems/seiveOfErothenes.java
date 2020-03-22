package problems;

public class seiveOfErothenes {

	
	public static void seiveOfErothenesFunction(int n){
		

			
			int count=0;
			for(int j=1;j<Math.sqrt(n);j++){
				if(n%j==0){
					count ++;
				}
				
				if (count>1){
					System.out.println(n+" is not a prime number");
					return;
				}
				
			}
			
			if (count ==1){
				System.out.println(n+" is  a prime number");
			}
			
			
		}
		
		
	
	
	
	
	public static void main(String []args){
		
		seiveOfErothenesFunction(20);
		seiveOfErothenesFunction(11);
		seiveOfErothenesFunction(13);
		seiveOfErothenesFunction(23);
		seiveOfErothenesFunction(29);
		seiveOfErothenesFunction(30);
		seiveOfErothenesFunction(7);
		
	}
	
	
}
