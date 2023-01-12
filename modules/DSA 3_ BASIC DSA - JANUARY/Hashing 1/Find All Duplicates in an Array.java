
// Question Link -- https://course.acciojob.com/idle?question=0b7eb158-d439-4415-bbae-fe874f3437a2

import java.util.*;

class Solution {
    public void allDuplicates(int n, int[] arr) {

		HashSet<Integer> hash = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();

		for(int i : arr){

			if(hash.contains(i)){
				list.add(i);
			}
			hash.add(i);
		}
		Collections.sort(list);

		for(Integer i : list) System.out.print(i+" ");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.allDuplicates(n, arr);
        sc.close();
    }
}
