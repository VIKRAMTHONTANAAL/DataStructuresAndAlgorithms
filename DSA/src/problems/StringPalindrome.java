package problems;

public class StringPalindrome {


	public static void main(String []args){

		String string="";

		boolean isPalindrome=true;

		
		if(string.equals(""))isPalindrome=false;
		
		
		for (int i=0;i<(string.length()/2);i++){

if(string.charAt(i)!=string.charAt(string.length()-1-i)){
	
	isPalindrome=false;
}

		}


if(isPalindrome)System.out.println(string+" is a palindrome");

if(!isPalindrome)System.out.println(string+" is not a palindrome");



	}
}
