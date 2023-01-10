
// Question Link - https://course.acciojob.com/idle?question=fb442623-31f7-48b8-b60f-34076c3b3d5e

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.prisonerAndHeights(h));
        
    }
}

class Solution {

    public int prisonerAndHeights(int[] h) {
		int n = h.length;
		Stack<Integer> stack = new Stack<Integer>();

			int maxCount = 0;
			int maxIndex = -1;
		
		for(int i=0;i<n;i++){
			int height = h[i];
			int count =0;

			while(!stack.empty() && stack.peek() < height){
					stack.pop();
					count++;
			}

			if(!stack.empty()) count++;

				if(count > maxCount){
					maxCount = count;
					maxIndex = i;
				}

			stack.push(height);

    }

		return maxIndex;
}
}
