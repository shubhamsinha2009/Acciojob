
// Question Link -- https://course.acciojob.com/idle?question=fe25c939-1b3d-4b7f-a338-9149f1e1fe23

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
                
                int a[] = new int [n];
                
                
                for(int i = 0 ; i<n  ; i++){

                        a[i] = sc.nextInt();
 
                }

                int m = 0;
                
                  
                for(int i = 0 ; i<n  ; i++){

                        if(a[i] <= 0){
                                m++;
                        }
                       
 
                }

                if(m<=k){
                        System.out.print("YES");
                }else{
                          System.out.print("NO");
                }
                
	}
}
