// problem1.java: Gerardo Camarena Gomez
// Problem: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//          Find the sum of all the multiples of 3 or 5 below 1000.

// Implementation: We use the mathematical identitity for the sum of geometric sequences. We get the sum of all multiples of 3, add it to the 
// 				   sum of multiples of 5, then subtract the intersection, sum of multiples of 15.



class Problem1Euler {
	public static void main (String[] args) {
		// Sum of multiples of 3 up to 1000
		int k3 = 3;
		int n3 = 333;
		int sum3 = k3 * ((n3 * (n3+1))/2);
		// Sum of multiples of 5 up to 1000
		int k5 = 5;
		int n5 = 199;
		int sum5 = k5 * ((n5 * (n5+1))/2);
		// Sum of multiples of 15 up to 1000
		int k15 = 15;
		int n15 = 66;
		int sum15 = k15 * ((n15 * (n15+1))/2);
		System.out.println(sum3+sum5-sum15);
	}
}

