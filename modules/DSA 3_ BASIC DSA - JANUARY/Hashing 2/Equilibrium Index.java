
// Question Link -- https://course.acciojob.com/idle?question=ca688309-71a6-4c7a-8a45-07ad8817a350

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution {
    static int findEquilibriumIndex(int[] nums) {
        
        int leftSum=0 ;
        int rightSum = 0;
        int pivotIndex = 0;

        for(int i = 1; i<nums.length;i++ ){
            rightSum += nums[i];
        }

        while( leftSum!= rightSum && pivotIndex < nums.length - 1){
          pivotIndex++;
          leftSum += nums[pivotIndex - 1];
          rightSum -= nums[pivotIndex];
        }
    if(leftSum == rightSum){
    return pivotIndex;
    }else{
    return -1 ;
    }
    }
}
