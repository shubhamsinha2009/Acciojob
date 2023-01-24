
// Question Link -- https://course.acciojob.com/idle?question=ff5cc783-d70d-461a-b8df-3e1753a4d489

import java.util.*;

class Solution {
    public int[] MovingBombs(int[] a) {

		Stack<Integer> s = new Stack<>();
		int n =a.length;
		for(int i=0;i<n;i++){
			if(a[i] > 0) s.push(a[i]);
			else{
				while(!s.empty() && s.peek()>0 && s.peek() < Math.abs(a[i])){
					s.pop();
				}
				if(!s.empty() && s.peek() == Math.abs(a[i])){
					s.pop();
					continue;
				}
				if(s.empty() || s.peek()<0) s.push(a[i]);
			}
		}

		int k = s.size();
		int[] result = new int[k];
		while(!s.empty()){
			result[--k] = s.pop();
		}
		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.MovingBombs(arr);
        for (int j : result)
            System.out.print(j + " ");
        System.out.println();
        sc.close();
    }
}
