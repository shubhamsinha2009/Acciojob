
// Question Link -- https://course.acciojob.com/idle?question=73772158-09d5-4636-aa41-def2d3158102

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 

		long[] result = new long[n];
		Stack<Long> stack = new Stack<>();

		for(int i =n-1 ;i>=0;i--){

			while(!stack.empty() && stack.peek() <= arr[i]){
				stack.pop();
			}

			if(stack.empty()){
				result[i]=-1;
				
			}else{
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
			
		}

		return result;
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
