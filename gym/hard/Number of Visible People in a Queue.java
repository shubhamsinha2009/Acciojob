
// Question Link -- https://course.acciojob.com/idle?question=0b817b2c-34b7-4589-a0a1-6576561c6c4f

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int heights[]=new int[n];
        for(int i=0;i<n;i++)
        heights[i]=sc.nextInt();

        Solution ob = new Solution();
        
        int ans[]=ob.solve(heights);
        
        for(int i=0;i<n;i++)
        System.out.print(ans[i]+" ");
        
        System.out.println();
        
	}
}

class Solution {
    public int[] solve(int heights[])
    {
        int n = heights.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            int height = heights[i];

            while(!stack.empty() && heights[stack.peek()] < height ){

                    int index = stack.pop();
                    ans[index]++;

            }

            if(!stack.empty()){
                int index = stack.peek();
                ans[index]++;

            }
            
            stack.push(i);
        }
        
        return ans ;
        
    }

}
