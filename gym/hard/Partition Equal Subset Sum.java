
// Question Link -- https://course.acciojob.com/idle?question=4b1b4b88-bee5-4bd2-bc15-d518860ed945

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.twoEqualSubsets(arr));
        }
        
    }
}

class Solution {
    static boolean twoEqualSubsets(int[] arr) {
		int n = arr.length;
		int sum =0;
			for(int a : arr) sum+=a;

		if(sum%2!=0) return false;
		sum/=2;
		
		return subsetSum(arr,sum);
		
    }
	
	public static boolean subsetSum(int[] arr, int sum) {
		int n = arr.length;
		Set<Integer> set = new HashSet();
		set.add(0);
		for(int i : arr){
			Set<Integer> temp = new HashSet<>(set);
			for(Integer s : temp){
				int a = s+i;
				if(a== sum) return true;
				if(a< sum ) set.add(a);
			}
		}
		return false;
    }
}
