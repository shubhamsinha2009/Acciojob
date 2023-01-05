
// Question Link - https://course.acciojob.com/idle?question=af01e904-d5e6-4709-a91b-38f6819ae8ee

import java.util.*;
import static java.lang.Math.ceil;

public class Main {
	
	
	// Time Complexity - O(2^N)
	// Space Complexity - O(n)
	// Can be optimised using dp
	
	static int fib(int n ){
		if(n<=2) return n-1;
		return fib(n-1) + fib(n-2);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fib(n));
    }
}
