
// Question Link -- https://course.acciojob.com/idle?question=368b1ab6-c205-40a8-8f94-a1c7c5e04d68

import java.util.*;

class Solution {
    public ArrayList<Integer> SubsetSums(ArrayList<Integer> arr) {

			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(0);
			for(Integer i : arr){
				ArrayList<Integer> temp = new ArrayList<>(ans);
				for(Integer a : temp){
					ans.add(i+a);
				}
			}
		return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(sc.nextInt());
	    Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.SubsetSums(arr);
        Collections.sort(ans);
        for(int a : ans)
            System.out.print(a+" ");

    }
}
