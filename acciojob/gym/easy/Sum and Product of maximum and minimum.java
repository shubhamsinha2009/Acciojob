
// Question Link - https://course.acciojob.com/idle?question=0766c1ac-431b-43d2-88d7-8d74b16376a5

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int t = sc .nextInt();
             
  for(int j= 0 ; j<t ; j++){
          int n = sc.nextInt();

                int a[] = new int[n];
                for(int i = 0 ; i<n ; i++){

                        a[i] = sc.nextInt();
                        
                }

                        int max = Integer.MIN_VALUE;
                        int min = Integer.MAX_VALUE;
              for(int i = 0 ; i<n ; i++){

                       if(max< a[i])
                                max = a[i];
                      if(min > a[i])
                              min = a[i];
                }

                        
                        System.out.println((max + min) +" " + (min*max));

                        
  }

              
                
	}
}
