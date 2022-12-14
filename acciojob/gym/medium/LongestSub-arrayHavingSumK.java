
// Question Link -- https://course.acciojob.com/idle?question=00d425f1-a20e-4549-afb2-4e1cd07ad3fd

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int testCases = sc.nextInt();
                int l[] = new int[testCases];

                for(int t =0 ; t<testCases ; t++){

                int n = sc.nextInt();
                int s = sc.nextInt();
                int a[] = new int[n];

                        for(int i=0;i<n;i++){
                                a[i]= sc.nextInt();
                                
                        }

                        int length = 0 ;

                 
                        
                         for(int i=0;i<n;i++){
                                   int sum =0;
                                 for(int j =i ; j<n;j++){

                                         sum+=a[j];
                                         if(sum == s){
                                                 if(length < j-i+1){
                                                         length = j-i+1;
                                                 }
                                         }
                                         
                                 }
                              
                                
                        }

                   l[t] = length ;

                }
                   for(int t =0 ; t<testCases ; t++){
                           System.out.println(l[t]);
	}
}
}
