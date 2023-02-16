
// Question Link -- https://course.acciojob.com/idle?question=f2ca55fd-3a7f-4a15-8e96-fd47960a21c9

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int nums[]=new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
	        }
	        Solution obj = new Solution();
	        long ans[] = obj.ProductOfArrayExceptSelf(n,nums);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
  public long[] ProductOfArrayExceptSelf(int n, int[] nums){
        
        long p=1;
        int z =0;
        int zi=-1;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]==0){
                z++;
                zi=i;
            }
            else p*=nums[i];
        } 
        long[] pro = new long[nums.length];
        if(z>1)return pro;
        if(z==1){
            pro[zi]=(int)p;
            return pro;
        }
        for(int i=0;i<nums.length;i++){
            long s = p/nums[i];
			pro[i] = (int) s;
        }
        return pro;
}
}
