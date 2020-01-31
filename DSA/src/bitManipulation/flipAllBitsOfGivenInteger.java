package bitManipulation;
import java.util.Scanner;

public class flipAllBitsOfGivenInteger {
public static void main(String [] args){
	
	Scanner scan=new Scanner(System.in);
	int givenInteger,flippedInteger;
	System.out.println("Enter the integer to flip all its bits");
	givenInteger=scan.nextInt();
	
	flippedInteger=flipAllBitsOfGivenIntegerFunction(givenInteger);
	System.out.println("The flipped integer is "+flippedInteger);
	
	scan.close();
	
}
static int flipAllBitsOfGivenIntegerFunction(int givenInteger){
	
	
	int numberOfBitsRequired=numberOfBitsRequiredToStoreTheIntgerUsingBitTraversalFunciton(givenInteger);
	
	int []arrayOfBits=new int[numberOfBitsRequired];
	int i=0,sum=0;
	
	while (givenInteger!=0){
		if(givenInteger%2==0){
			
			arrayOfBits[i]=1;
			givenInteger=givenInteger/2;
			i++;
		}
		else{
			
			arrayOfBits[i]=0;
			givenInteger=givenInteger/2;
			i++;
		}
		
		
	}
	for (int n=0; n<numberOfBitsRequired;n++){
		
		if(arrayOfBits[n]==1){
		sum=sum+(int)(Math.pow(2, n));
		}
	}

	
	
	
	
	
	return sum;
}




static int numberOfBitsRequiredToStoreTheIntgerUsingBitTraversalFunciton(int givenInteger){
	int numberOfBits=0;
	while(givenInteger!=0){
		numberOfBits++;
		givenInteger=givenInteger>>1;
		
		
	}
	
	
	return numberOfBits;
}

}
