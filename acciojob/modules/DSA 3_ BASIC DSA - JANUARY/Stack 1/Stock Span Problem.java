
// Question Link - https://course.acciojob.com/idle?question=dee87292-2cca-4f9c-9501-973000b81a15

import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {

		int n = a.length;
		int[] ans = new int[n];

		Stack<Integer> stack = new Stack<>();

		for(int i =0;i<n;i++){
			
		int price = a[i];
        while(!stack.empty() && price >= a[stack.peek()]) stack.pop();

        int index = stack.empty() ? -1 : stack.peek();
        stack.push(i);
       
          ans[i]= i -index ; 
		
		}
		return ans;
    }
}
