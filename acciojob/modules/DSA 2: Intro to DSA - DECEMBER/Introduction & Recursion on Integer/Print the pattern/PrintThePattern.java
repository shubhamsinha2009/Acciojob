
// Question Link -- https://course.acciojob.com/idle?question=4264540d-6f27-44db-b1ac-04aafebb025d

import java.io.*;
import java.util.*;

class Main
{

	public static void solve(int n)
    {
       if(n==0) return;

		solve(n-1);	
        printNTimes(n);
		System.out.println();
    }
	public static void printNTimes(int n)
    {
       if(n==0) return;
        printNTimes(n-1);
		System.out.print("* ");
		
    }
	
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}
