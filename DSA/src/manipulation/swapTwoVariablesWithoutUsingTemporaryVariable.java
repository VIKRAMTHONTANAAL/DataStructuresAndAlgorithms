package manipulation;
import java.util.Scanner;

public class swapTwoVariablesWithoutUsingTemporaryVariable {
	public static void main(String args[]){


		Scanner scan= new Scanner(System.in);
		int a,b;

		System.out.println("Enter variable 'a' value");
		a=scan.nextInt();
		System.out.println("Enter variable 'b' value");
		b=scan.nextInt();
		System.out.println("VALUE OF Variables before swapping"+"A = "+a+" B = "+b );
		
		swapTwoVariablesWithoutUsingTemporaryVariableFunction(a,b);



		scan.close();
	}
	
	static void  swapTwoVariablesWithoutUsingTemporaryVariableFunction(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("VALUE OF Variables after swapping"+"A = "+a+" B = "+b );
		
	}
	
}
