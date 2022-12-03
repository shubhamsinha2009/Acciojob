
// Question Link - https://course.acciojob.com/idle?question=b9ab1535-75ae-4b9f-b6ca-a1ae2429d630

import java.util.*;
import static java.lang.Math.ceil;

public class Main {
	
	
	// Time Complexity - O(2^N)
	// SPace Complexity - O(n)
	// Can be optimised using dp
	
	static final int mod = 1000000007;
	
	static long NthEvenFibonacci(long n) {

		if(n<=1) return 2*n;
		return (4*NthEvenFibonacci(n-1) + NthEvenFibonacci(n-2))%mod;
	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}
