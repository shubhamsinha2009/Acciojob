
// Question link - https://course.acciojob.com/idle?question=10369ab1-c83c-4f94-9eb3-b9c9240e7abf

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int a[] = new int[n];

                for(int i =0 ; i<n ; i++){
                        a[i] = sc.nextInt();
                }
                  int sum =0 ;
             
                int max = Integer.MIN_VALUE;
                for(int i =0 ; i<n ; i++){
                        int cur = a[i];
                        sum+= cur;
                if (max < cur ){
                        max = cur;
                }
                }

                System.out.print(sum + " ");
                  System.out.print(sum/n + " ");
                  System.out.print(max);
        
	}
}
