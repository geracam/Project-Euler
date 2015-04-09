// problem2.java: Gerardo Camarena Gomez
// Problem: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

// Implementation: We use the mathematical identitity for the sum of geometric sequences. We get the sum of all multiples of 3, add it to the 
// 				   sum of multiples of 5, then subtract the intersection, sum of multiples of 15.



public class problem2 {
	public static void main (String[] args) {
		System.out.println(fibonacciLimiter());
	}

	public static int fibonacciLimiter(){
		int sum = 0;
		for (int i=0; ; i++){
			int fib = fibonacci(i);
			if (fib > 4000000)
				break;
			if (fib % 2 ==0)
				sum += fib;
		}
		return sum;
	}

	private static int fibonacci(int maxNum){
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < maxNum; i++){
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		return num1;
	}
}