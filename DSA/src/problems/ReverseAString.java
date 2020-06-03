package problems;

public class ReverseAString {
	
	public static void main(String []args){
		
		String string="abcde";
		
		String reverseString=reverseAStringUsingForLoop(string);
		
		System.out.println(reverseString);
		
		reverseString=reverseAStringUsingStringBuilder(string);

		System.out.println(reverseString);
	}

	
	
	
	private static String reverseAStringUsingStringBuilder(String string) {
		
		return new StringBuilder(string).reverse().toString();
		
		
	}

	private static String reverseAStringUsingForLoop(String string) {
			
		int lengthOfString=string.length();
		String reverseString="";
		
		
		char reverseInteger[]=new char[lengthOfString];
		
		
		for(int i=0 ;i<lengthOfString;i++ ){
			
			
			reverseInteger[i]=string.charAt(lengthOfString-1-i);
			
			reverseString= reverseString+string.charAt(lengthOfString-1-i);
					
		}
		
		
		return reverseString;	
		
	}
	
}
