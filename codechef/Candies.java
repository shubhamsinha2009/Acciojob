
// Questions Link -- https://www.codechef.com/problems/CNDY

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
	    
	    while(t-- >0){
	        
	        int n = sc.nextInt();
	        int[] a = new int[2*n];
	        
	        for(int i =0 ; i< 2*n ; i++){
	            a[i] = sc.nextInt();
	        }
	        
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	      for(int i =0 ; i< 2*n ; i++){
	            
	            int value = map.getOrDefault(a[i],0);
	           if( value == 2){
	                System.out.println("No");
	                break;
	        
	           }else{
	               map.put(a[i],++value);
	           }
	        
	        if(i == 2*n-1){
	                 System.out.println("Yes");
	        }
	           
	        }
	    
	        
	        
	    }
	
	
	}
}
