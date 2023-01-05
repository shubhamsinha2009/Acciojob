
// Question Link - https://course.acciojob.com/idle?question=f1316d07-891c-4d64-99d9-fccb4a8f940c

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int X,N;
        X = sc.nextInt();        
        N = sc.nextInt();

        System.out.println(power(X,N));		
    }

	public static long power(int x, int y)
    {
		if(y == 1) return x;

		long pow = power(x,y/2);

		if(y%2==0) return  (long) pow * pow;
		else return (long) x * pow * pow;
    }
}
