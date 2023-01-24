
// Question Link -- https://course.acciojob.com/idle?question=de0f5218-8553-4465-b3f5-8d860f2c8279

import java.util.*;

class Solution {
    public ArrayList<Integer> duplicateBookIDS(int[] book) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> ans = new HashSet<>();

		for(int i : book){
			if(!set.add(i)) ans.add(i);
		}
		return new ArrayList(ans);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        ArrayList<Integer> res = Obj.duplicateBookIDS(arr);
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
