
// Question Link - https://course.acciojob.com/idle?question=16734653-1efc-4add-9c55-cd019a8e339a

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int ans = sumDigit(n);
        System.out.println(ans);      
		sc.close();
    }

	static int sumDigit(int n ) {

		if(n==0) return 0;

		return n%10 + sumDigit(n/10);
		
    } 
}
