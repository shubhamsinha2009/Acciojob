
// Question Link -- https://course.acciojob.com/idle?question=0378f33a-da1c-40b3-b5b1-70cd1132c3a8

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

                for(int i=0;i<n;i++){
                        a[i] = sc.nextInt();
                        
                }

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                
                for(int i=0;i<n;i++){

                        if(min> a[i]){
                                min=a[i];
                        }
                        if(max<a[i]){
                                max=a[i];
                        }
                }

                if(max - min <= k ){
                       System.out.println(max-min); 
                }else{
                        
                

              int  avg = (max + min)/2;
                
             for(int i=0;i<n;i++){

                     if( a[i] > avg   ){
                             a[i] -= k;
                     }else{
                             a[i]+= k;
                             
                     }
       
                }
                
                  min = Integer.MAX_VALUE;
                 max = Integer.MIN_VALUE;

                for(int i=0;i<n;i++){

                        if(min> a[i]){
                                min=a[i];
                        }
                        if(max<a[i]){
                                max=a[i];
                        }
                }
                        System.out.println(max-min); 
	}
}
}
