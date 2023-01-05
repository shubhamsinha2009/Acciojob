
// Question Link -- https://course.acciojob.com/idle?question=e556af86-9b3a-48a9-92ab-5905139c9d24

import java.util.*;

class Main {
	public static long xPowerN(int x, int n){
		if(n==1) return x;
		return (long) x*(xPowerN(x,n-1));
		
	}
	
	public static void main(String[] args)
	{
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int n = sc.nextInt();
		System.out.println(xPowerN(x, n));
	}
}
