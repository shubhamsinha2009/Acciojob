
// Question Link -- https://course.acciojob.com/idle?question=04c37721-2db1-494d-b1f6-7cdffa50450f

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                        int gcd = gcd(a,b);
                                

                System.out.println(gcd);
		
	}
        public static int gcd (int a , int b) 
	{
		if (b==0) return a ;

                return gcd(b,a%b);
	}
}
