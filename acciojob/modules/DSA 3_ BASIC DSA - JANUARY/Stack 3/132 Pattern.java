
// Question Link - https://course.acciojob.com/idle?question=082fec26-a7a3-4296-adc5-2f3fe9d99f12

import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int last = Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] < last) return true;
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                last = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;       
    
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        boolean result = Obj.find132pattern(arr);
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}
