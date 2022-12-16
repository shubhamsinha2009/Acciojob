
// Question Link - https://course.acciojob.com/idle?question=07fd2db9-1989-418c-9005-8f310db4bacc

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n =sc.nextInt();

                int a[] = new int[n];

                for(int i =0 ; i<n;i++){
                        a[i] = sc.nextInt();
                }
                int half = 0;
                      for(int i =0 ; i<n-1;i++){
                        if(a[i] > a[i+1]){
                                half = i+1;
                                break;
                        }
                }
               
             
                
                 int start =0 ;
                int secondStart = half;
                int index =0 ;
                int sortedArray[] = new int[n];

                while(index< n && start < half && secondStart < n){
                  
                        if(a[start] < a[secondStart]){

                                sortedArray[index] = a[start];
                                start ++ ;
                                            
                        } else{

                                sortedArray[index] = a[secondStart];
                                secondStart ++ ;
                               
                                
                        }
                         
                        index ++;
                        
                }
                
                      while(index< n && start < half ){
                           sortedArray[index] = a[start];
                                start ++ ;
                        index ++;
                        
                }
                      while(index< n && secondStart < n){         
                                sortedArray[index] = a[secondStart];
                                secondStart ++ ;
                               
                        index ++;
                        
                }

                 for(int i =0 ; i<n;i++){
                      System.out.print(sortedArray[i] + " ");
                }
                
                
	}
}
