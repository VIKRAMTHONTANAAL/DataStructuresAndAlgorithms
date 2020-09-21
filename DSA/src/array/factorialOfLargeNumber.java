package array;

import java.math.BigInteger;

public class factorialOfLargeNumber {
	
	
	
	public static void main(String[] args){
		
		
		System.out.println(findTheFactorialOfNumber(21));
		
		
		
		
		
		
	}
	
	
	public static BigInteger findTheFactorialOfNumber(int n)
	{
		
		BigInteger factorial=BigInteger.ONE;

		
		for( ;n>0;n--){
			
			factorial=factorial.multiply(BigInteger.valueOf(n));
		}
		
		
		return factorial;
	}
}
