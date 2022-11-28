
// Questions Link - https://course.acciojob.com/idle?question=72595616-7c8d-4378-ac4c-128c6aed1d8d

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int num = sc.nextInt();

                int a[] = new int [n];
                
                
                for(int i = 0 ; i<n ; i++){

                        a[i] = sc.nextInt();
 
                }

                 for(int i = 0 ; i<n ; i++){

                        if(num == a[i]){
                                System.out.print(i+1);
                                break;
                        }

                         if(i==n-1){
                                 System.out.print(-1);
                         }
 
                }

	}
}
