
// Question Link - https://course.acciojob.com/idle?question=346dcf47-f0b0-48b9-9e25-c0a004837b34

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
               long fact = fact(n);
              

                System.out.println(fact);
	}

        public static long fact(int n)
	{
			if(n==0) return 0;
			if(n <=2) return n;
	        return n*fact(n-1);
	}
}
