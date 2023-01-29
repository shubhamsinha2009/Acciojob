
// Question Link -- https://course.acciojob.com/idle?question=d11d79ad-5d80-4921-b71e-e7e9f9b7dda4

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int sum = Integer.parseInt(line[1]);
        int[] arr = new int[n];
        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        Solution sol = new Solution();
        Boolean ans = sol.subsetSum(arr, sum);
        if(ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class Solution {
    public boolean subsetSum(int[] arr, int sum) {
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
