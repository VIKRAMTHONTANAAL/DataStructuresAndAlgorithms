package manipulation;
import java.util.Scanner;

public class swapThreeVariablesWithoutUsingTemporaryVariable {
	public static void main(String args[]){


		Scanner scan= new Scanner(System.in);
		int a,b,c;

		System.out.println("Enter variable 'a' value");
		a=scan.nextInt();
		System.out.println("Enter variable 'b' value");
		b=scan.nextInt();
		System.out.println("Enter variable 'c' value");
		c=scan.nextInt();
		System.out.println("VALUE OF Variables before swapping "+"A = "+a+" B = "+b+" C = "+c );
		
		swapThreeVariablesWithoutUsingTemporaryVariableFunction(a,b,c);



		scan.close();
	}
	
	static void  swapThreeVariablesWithoutUsingTemporaryVariableFunction(int a,int b,int c){
		
		
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		
		
					
		System.out.println("VALUE OF Variables after swapping"+"A = "+a+" B = "+b+" C = "+c );
		
	}
	
}
