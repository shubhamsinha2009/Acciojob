
// Question Link: https://course.acciojob.com/idle?question=ac88cc75-d94b-411e-b84d-ca0334811442

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] prevGreater(long[] arr, int n)
    { 
		long ans[] = new long[n]; 
		Stack<Long> stack = new Stack<>();

		stack.push(arr[0]);
		ans[0] = -1;
		for(int i =1;i<n;i++){
				long element = arr[i];
			while(!stack.empty() && stack.peek() < element){
				stack.pop();
			}

			if(stack.empty()){
				ans[i] = -1;
			}else{
				ans[i] = stack.peek();
			}

	
			stack.push(arr[i]);
		}

		return ans;
		
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().prevGreater(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
