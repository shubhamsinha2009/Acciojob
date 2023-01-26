
// Question Link - https://course.acciojob.com/idle?question=01814e11-5b74-4bd5-9114-5352d8b9afef

import java.util.*;

class Solution {
    public int kSubset(int[] arr, int k) {
        Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<>();

		for(int i : arr)
			if((i%k==0 && !set.contains(i/k))|| i%k!=0) set.add(i);
		return set.size();
		
    }
}

public class Main {
    public static void main(String[] h) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int k = c.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = c.nextInt();
        }
        c.close();
        Solution Obj = new Solution();
        System.out.print(Obj.kSubset(arr, k));
    }
}
