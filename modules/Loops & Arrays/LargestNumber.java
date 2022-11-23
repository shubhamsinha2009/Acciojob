
// Question Link -- https://course.acciojob.com/idle?question=fa62af5b-0c64-410d-b84a-c8197a9cef79

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static String largestNumber(int[] nums) {

		// This question contains topics which
		// you need to read before solving -:
		// 	1. Array.sort() method
		// 	2. Convert Integer to String
		//    3. Comparator Interface (Oops)
		// 	4. Arrow Operator (Lambda Expressions)
		// 	5. String Comparison 
		// 	6. String Builder

		// Time Complexity -- O(nlogn)
		// Space Complexity -- O(n)
		
      // Get input integers as strings.
        String[] asStrs = new String[nums.length];
		
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }

          // Sort strings according to custom comparator
        Arrays.sort(asStrs, (a,b) -> (b+a).compareTo(a+b));

        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumberStr.append(numAsStr);
        }

        return largestNumberStr.toString();
    
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(largestNumber(arr));
	}
}
