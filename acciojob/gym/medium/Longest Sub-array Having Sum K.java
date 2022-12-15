
// Question Link -- https://course.acciojob.com/idle?question=00d425f1-a20e-4549-afb2-4e1cd07ad3fd

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static int longestSubArray(int[] a ,int n, int k){

		// Time Complexity - O(n^2)
		// Space Complexity - O(1)

		// return bruteForce(a,n,k);

		// Time Complexity - O(n)
		// Space Complexity - O(n)
		
		return optimised(a,n,k);

		
		
	}

	public static int optimised(int[] a ,int n, int k){

					
             HashMap<Integer,Integer> map = new HashMap<>();

					int sum =0;
					 int maxLength = 0 ;
					
					for(int i =0; i<n;i++){
						sum+=a[i];
						if(sum==k) maxLength = Math.max(maxLength,i+1);
						maxLength = Math.max(maxLength, i - map.getOrDefault(sum-k,i));					
						map.putIfAbsent(sum,i);
					}

                   return maxLength;
		
	}
	public static int bruteForce(int[] a ,int n, int k){

					 int length = 0 ;
                         for(int i=0;i<n;i++){
                                   int sum =0;
                                 for(int j =i ; j<n;j++){

                                         sum+=a[j];
                                         if(sum == k){
                                                 if(length < j-i+1){
                                                        length = j-i+1;
                                                 }
                                         }
                                         
                                 }
                              
                                
                        }

                   return length;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int testCases = sc.nextInt();
                int l[] = new int[testCases];

                while(testCases-- > 0 ){

                int n = sc.nextInt();
                int s = sc.nextInt();
                int a[] = new int[n];

                for(int i=0;i<n;i++)  a[i]= sc.nextInt();
                     System.out.println(longestSubArray(a,n,s));
                }	
	}
}
