
// Question Link - https://course.acciojob.com/idle?question=50799402-ffd5-4907-9f91-555993ff4b62

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
      public static long maximumArea(long hist[], long n){

		  // Largest Rectangular Area 
		  long maxArea = 0;

		  Stack<Integer> stackOfIndices = new Stack<>();

		  // ch
		  for(long currentIndex =0;currentIndex<=n;currentIndex++){
			  long currentHeight = currentIndex==n?0:hist[(int) currentIndex];

			  // check if current Height is smaller than current bar which is top of stack 
			  // Also check for is any currentBar available in stack
			  
			  while(!stackOfIndices.empty() && currentHeight < hist[(int) stackOfIndices.peek()]){

				  // We are going to simulate bar through stack elements
				  // So current bar is in stack peek/top whose area will be calculated 
				  // as current index smaller and it has popped current bar so it becomes next smallest index
				  long nextSmallestIndex = currentIndex;

				  // Current Bar was top of stack which is popped now
				  long currentBarIndex = stackOfIndices.pop();

				  
				  long height = hist[(int) currentBarIndex];

				  // If there is nothing left in the stack we can take index value -1 
				  long previousSmallestIndex = stackOfIndices.empty()? (long) -1 : stackOfIndices.peek();

				  
				  long width = (long) (nextSmallestIndex - previousSmallestIndex - 1);

				  long areaOfPopped = height * width; 

				  maxArea = Math.max(maxArea,areaOfPopped);
				  
			  }

			  
			  stackOfIndices.push((int) currentIndex);
		  }
		  return maxArea;
    }
}
