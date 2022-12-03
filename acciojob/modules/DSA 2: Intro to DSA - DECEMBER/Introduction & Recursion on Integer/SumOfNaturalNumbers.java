
// Question Link -- https://course.acciojob.com/idle?question=6e19b00c-df61-4125-902c-f479f6b242d2

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int  n = sc.nextInt();

                int sum = sum(n);
                 System.out.print(sum);
	}

        public static int sum (int n)
	{
                if (n==1)return 1;
                return n + sum(n-1);
	}
}
