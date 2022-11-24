
// link:"https://www.codechef.com/problems/MOBKUN"

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    while(t-- > 0){
	        
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        
	        for(int i=0; i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        
	        int start = 0;
	        int end =n-1;
	        int ans =0;
	        int min =0;
	        
	        while(start<end){
	            
	            if(a[start] == a[end]){
	                start++;
	                end--;
	                continue;
	            } 
	            
	            if(a[start] < a[end]){
	                a[end] -= a[start++]; 
	            }else{
	                a[start]-=a[end--];
	            }
	           
	           ans++;
	            
	            
	        }
	        
	        System.out.println(ans);
	        
	           
	    }
	}
}
