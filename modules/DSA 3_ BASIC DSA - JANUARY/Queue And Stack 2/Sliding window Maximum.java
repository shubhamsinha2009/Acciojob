
// Question Link -- https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263

import java.util.*;

class Solution{
    static int[] SlidingWindowMaximum(int n, int k, int[] nums){
    
        int[] ans = new int[n-k+1];
        int r = 0;
       
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i =0; i<n;i++){

            if(!deque.isEmpty() && deque.getFirst() == i-k){
                deque.removeFirst();
            }
        
            while(!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
                deque.removeLast();
            }

            deque.addLast(i);

            if(i>=k-1){
                ans[r++] = nums[deque.getFirst()];
            }

        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
