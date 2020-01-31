package bitManipulation;

import java.util.Scanner;

public class numberOfBitsRequiredToStoreNumberUsingBitTraversal {
public static void main(String []args){
	
	Scanner scan=new Scanner(System.in);
	int a, bitsRequired;
		
	
	System.out.println("Enter the number to know the number of bits required to store");
	a=scan.nextInt();
	if(a<=0){
		
		a=a*-1;
	}
	
	bitsRequired=numberOfBitsRequiredToStoreNumberUsingBitTraversalFunction(a);
	
	System.out.println("The number of bits required to store the number " + a +" = "+ bitsRequired);
	
	
	
scan.close();	
}
static int numberOfBitsRequiredToStoreNumberUsingBitTraversalFunction(int a){
	int count=0;
	
	
	while (a!=0){
		count++;
		a=a>>1;
		
	}
	
	
	
	return count;
}




}




