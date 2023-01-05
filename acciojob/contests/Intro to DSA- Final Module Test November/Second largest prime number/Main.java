
// Question Link -- https://course.acciojob.com/idle?question=6e1969c9-8f67-4591-9400-ad57bcf2f2c3

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	static int secondLargestPrime(int arr[]){

		// Time Complexity -- O(n)
		// Space COmplexity -- O(n)

		int n = arr.length;
		int secondLargest = -1;
		int largest =-1;

		for(int i =0;i<n;i++){

			if(isPrime(arr[i])){
				
				if(arr[i]>largest){
					secondLargest = largest;
					largest = arr[i];
					
				} else if( arr[i]> secondLargest && arr[i] < largest){
					secondLargest = arr[i];
				}
				
			}
		}
		return secondLargest;
	}

	static boolean isPrime(int n){
		if (n <= 1)
            return false;
 
        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;
 
        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        // Check from 5 to square root of n
        // Iterate i by (i+6)
		
        for (int i = 5; i*i <= n; i = i + 6){
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
			}
        return true;
	}
}
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
  
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0 ; i < n ; i++){
		  arr[i]= sc.nextInt();
		}

		Solution Obj = new Solution();
		System.out.print(Obj.secondLargestPrime(arr));
	}
}
