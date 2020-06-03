package problems;

public class IntegerPalindrome {
	
	public static void main(String [] args){
		
		
		int integer=12321;
		
		int reverseInteger=0;
		
		int temp=integer;
		
		int n=0;
		
		while (temp>0){
			
			n = temp %10;
			
			reverseInteger= reverseInteger * 10 + n;
			
			
			temp=temp /10;
		}
		
		
		if (reverseInteger == integer){
			
			System.out.println(integer +" is a Palindrome");
		}
		else{
			
			System.out.println(integer +" is not a Palindrome");
		}
		
		
		
	}
}
