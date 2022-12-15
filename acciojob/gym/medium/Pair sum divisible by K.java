
// Question Link -- https://course.acciojob.com/idle?question=0031d548-b5e9-488d-a254-9a9a3536319a

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static int pairSumDivisibleByK(int[] a, int n,int k){

		// Time Complexity - O(n^2)
		// Space COmp-lexity - O(1)
		
			// return bruteForce(a,n,k);

		// Time Complexity - O(n)
		// Space Complexity - O(n)
		
			 return optimised(a,n,k);
       
	}
	public static int optimised(int[] a, int n,int k){
		
        int pairs =0;
			HashMap<Integer,Integer> hash = new HashMap<>();

				for(int i : a){
						int rem = i%k;
						pairs+= hash.getOrDefault(k-rem ,0);
						if(rem==0) pairs+= hash.getOrDefault(0,0);
						hash.put(rem,hash.getOrDefault(rem,0)+1);
				}

		return pairs;
	}
	
	public static int bruteForce(int[] a, int n,int k){
		
        int pairs =0;
                for(int i=0 ; i<n-1 ; i++){
                       
                for(int j=i+1 ; j<n ; j++){
		 int sum = a[i]+ a[j] ;

                        if(sum%k ==0){
                                pairs++;
                        }
                        
                        
                }
                        
                }
		return pairs;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k= sc.nextInt();

                int a[] = new int[n];

                for(int i=0 ; i<n ; i++)
                        a[i] = sc.nextInt();
                        
               System.out.println(pairSumDivisibleByK(a,n,k)); 
           
	}
}
