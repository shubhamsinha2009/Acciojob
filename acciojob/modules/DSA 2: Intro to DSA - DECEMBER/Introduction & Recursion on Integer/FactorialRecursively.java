
// Question Link -- https://course.acciojob.com/idle?question=f661b0e4-7bc4-469b-b148-8b77c9bca468

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();
    }

    public static long factorial_recursive(int n) {
		if(n==0) return 1;
		if(n<=2) return n;
		return (long) n*factorial_recursive(n-1);
    }
}
