
// Question Link - https://course.acciojob.com/idle?question=93a43cbf-871f-41bf-9af6-b67346113351

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i <n; i++)
        {
            arr[i] =sc.nextInt();
        }
        
        int[] res = new Solution().max_of_subarrays(arr, n, k);
        
        for (int i = 0; i < res.length; i++)
            System.out.print (res[i]+ " ");
        System.out.println();
    }
}

class Solution
{
    int[] max_of_subarrays(int nums[], int n, int k)
    {
        
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
