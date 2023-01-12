
// Question Link -- https://course.acciojob.com/idle?question=cfcb12b8-f817-4be3-8420-48ea92ed19bc

import java.io.*;
import java.util.*;

class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {

		HashMap<Integer,Integer> map = new HashMap<>();

			for(int i : nums){
				int count = map.getOrDefault(i,0)+1;
				if(count == k){
					
					System.out.println(i);
					return;
						}
					map.put(i,count);
			}

		System.out.println(-1);
			
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
    }
}
