
// Question Link -- https://course.acciojob.com/idle?question=2ee2a709-fb2f-4acd-b328-a7a74a556edb

import java.util.HashMap;
import java.io.*;
import java.util.*;

class Solution {
   public int maxLen(int arr[])
	{
		HashMap<Integer,Integer> map = new HashMap<>();

		int preSum=0;
		int max=0;
		map.put(0,-1);
		for(int i =0; i<arr.length;i++){
			preSum+= arr[i];
			max = Math.max(i-map.getOrDefault(preSum,i),max);
			map.putIfAbsent(preSum,i);	
		}
		return max;
	}
}

class Main {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution Obj = new Solution();
		System.out.println(Obj.maxLen(nums));
	}
}
