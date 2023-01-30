
// Question Link -- https://course.acciojob.com/idle?question=8857040e-21ae-471d-b2ee-8b01e18f681d

import java.util.*;
import java.io.*;
class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
        return kSum(nums,target,0,4);
    }

    public List<List<Integer>> kSum(int[] nums , long target, int start , int k){
        List<List<Integer>> res = new ArrayList<>();
        
        if(start==nums.length ) return res;

        long avg = target/k;

        if(nums[start] > avg || nums[nums.length-1]<avg) return res;

        if(k==2) return twoSum(nums,target,start);

        for(int i = start;i<nums.length;i++){
            if( i==start || nums[i-1]!=nums[i]){
                for(List<Integer> subset : kSum(nums,target-nums[i],i+1,k-1)){
                    subset.add(nums[i]);
                    res.add(subset);           
                }

            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums , long target, int start){
        List<List<Integer>> res = new ArrayList<>();

        int low = start, high = nums.length -1;

        while(low<high){
            int currSum = nums[low] + nums[high];

            if(currSum < target || (low > start && nums[low] == nums[low-1])) ++low;
            else if(currSum > target || (high < nums.length-1 && nums[high] == nums[high+1])) --high;
            else{
                res.add(new ArrayList<>(Arrays.asList(nums[low++],nums[high--])));
            }
        }

        return res;

   }
}

public class Main
{
	    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        List<List<Integer>> res = Obj.fourSum(nums, k);

      
        for(int i= 0; i<res.size(); i++){
           Collections.sort(res.get(i));
        }

     
        Collections.sort(res, new Comparator<List<Integer>>() {
               public int compare(List<Integer> frst, List<Integer> scnd) {
                    int i=0;
                    while(frst.get(i)==scnd.get(i)) i++;
                    return frst.get(i)-scnd.get(i);
                    }
                });

        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}
