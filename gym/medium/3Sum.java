
// Question Link -- https://course.acciojob.com/idle?question=4a19f884-ea9e-4fe9-b240-e43c935fb8b2

import java.io.*;
import java.util.*;



class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        //Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        //Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		 Arrays.sort(nums);
        return kSum(nums,0,0,3);
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
