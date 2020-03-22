package bitManipulation;

public class CharacterToInteger {

	public static int characterToIntegerFunction(String num){
		int len=num.length();
		int i=0;
		int sum=0;
		boolean isPositive=true;		
		if(num.charAt(i)=='+'){
			i++;
		}
		else if(num.charAt(i)=='-'){
			isPositive=false;
			i++;		
		}		
		for (int j=i;j<len;j++){
			if(num.charAt(j)-'0'>=0 && num.charAt(j)-'0'<=9 ){
				sum=sum*10+num.charAt(j)-'0';
			}
			else {
				if(isPositive){
				return sum;
				}
				else{
					sum=-1*sum;
					return sum;					
				}
			}
			
		}		
		if(isPositive){
				return sum;
				}
		else{
			sum=-1*sum;
			return sum;
			
		}		
	}		
	public static void main(String []args){		
		System.out.println(characterToIntegerFunction("+1234 E56r"));
		System.out.println(characterToIntegerFunction("+123456"));
		System.out.println(characterToIntegerFunction("-123456"));
		System.out.println(characterToIntegerFunction("e w 1234 E56r"));		
		System.out.println(characterToIntegerFunction("456"));
		System.out.println(characterToIntegerFunction("-88297 2482521"));
		System.out.println(characterToIntegerFunction("75 6"));
		System.out.println(characterToIntegerFunction("+349A756"));
		
	}
	
	
}
