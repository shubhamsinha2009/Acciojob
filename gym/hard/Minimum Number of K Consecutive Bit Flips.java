
// Question link -- https://course.acciojob.com/idle?question=8b0cfade-665a-449c-bc67-0bb90f2e9e09

import java.util.*;
class Solution{
    public static int minKBitFlips(int[] nums, int k) {
        int numberOfFlips = 0,ans=0,n=nums.length;

        for(int i =0;i<n;i++){

            if(i>=k && nums[i-k]>1){
                numberOfFlips--;
                // restoring input
                nums[i-k] -=2;
            }

            if(numberOfFlips%2==nums[i]){
                if(i+k>n) return -1;
                nums[i]+=2;
                numberOfFlips++;
                ans++;
            }

        }
        return ans;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(Solution.minKBitFlips(arr,k));
    }
}
