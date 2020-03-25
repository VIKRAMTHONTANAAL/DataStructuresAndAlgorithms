package problems;

public class Fibonacci {	
	public static int fibonacciSumUsingIteration(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int fiba,fibb,sum=0;
		fiba=0;
		fibb=1;
		for (int i=2;i<=n;i++){
			sum=fiba+fibb;
			fiba=fibb;
			fibb=sum;
		}
		return sum;
	}

	public static int fibonacciSumUsingRecursion(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}	
		return fibonacciSumUsingRecursion(n-1)+fibonacciSumUsingRecursion(n-2);
	}

	public static void main(String []args){
		System.out.println(fibonacciSumUsingIteration(9));
		System.out.println(fibonacciSumUsingRecursion(9));
	}
}
