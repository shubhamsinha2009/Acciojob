
// Question link -- https://course.acciojob.com/idle?question=24317ca0-60e5-4823-9108-e0edfd4e3f08

import java.util.*;
import java.io.*;
class Solution
{
    public static int solve(int n,int maxOperations,int nums[])
    {
       
        int low = 1; int high = nums[0];
    
        for(int i : nums) high = Math.max(i,high);

        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(isPossible(nums,mid,maxOperations)){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] nums,int mid,int maxOperations){
        
        int sum =0;

        for(int i:nums){

            sum+= (i-1)/mid;
        }
            return sum<= maxOperations;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr;
        arr= new int[n];
        for(int i = 0; i < n; i++)arr[i]=input.nextInt();
        System.out.println(Solution.solve(n,m,arr));
    }
}
