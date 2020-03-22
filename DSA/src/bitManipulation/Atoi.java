package bitManipulation;

public class Atoi {

	public static int atoiFunction(String num){
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
				return Integer.MAX_VALUE;
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
		System.out.println(atoiFunction("+1234 E56r"));
		System.out.println(atoiFunction("+123456"));
		System.out.println(atoiFunction("-123456"));
		System.out.println(atoiFunction("e w 1234 E56r"));		
		System.out.println(atoiFunction("456"));
	}
	
	
}
