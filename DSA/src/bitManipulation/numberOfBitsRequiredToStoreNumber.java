package bitManipulation;

import java.util.Scanner;

public class numberOfBitsRequiredToStoreNumber {
public static void main(String []args){
	
	Scanner scan=new Scanner(System.in);
	int a, bitsRequired;
		
	
	System.out.println("Enter the number to know the number of bits required to store");
	a=scan.nextInt();
	if(a<=0){
		
		a=a*-1;
	}
	
	bitsRequired=numberOfBitsRequiredToStoreNumberFunction(a);
	
	System.out.println("The number of bits required to store the number " + a +" = "+ bitsRequired);
	
	
	
scan.close();	
}
static int numberOfBitsRequiredToStoreNumberFunction(int a){
	int count=0;
	if (a==1 || a==0){
		count=1;
	}
	
	while (a>=2){
		a=a/2;
		count++;
		
	}
	
	
	
	return count+1;
}




}




