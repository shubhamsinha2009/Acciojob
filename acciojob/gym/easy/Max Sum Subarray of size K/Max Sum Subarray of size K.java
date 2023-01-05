
// Question Link -- https://course.acciojob.com/idle?question=00ad64c7-02b1-4306-bbf7-8e925ea1e978

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();

                int a[] = new int[n];

                for(int i =0;i<n ;i++){
                                a[i] = sc.nextInt();
                        
                }

                int sum = 0 ;
                int maxSum =0 ;
                

                for(int i =0;i<k ;i++) maxSum += a[i];
                sum = maxSum;
                 for(int i =k;i<n ;i++){
                             sum += a[i] - a[i-k ];
							maxSum = Math.max(maxSum,sum);   
                }

                System.out.println(maxSum);
	}
}
