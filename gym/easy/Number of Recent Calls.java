
// Question Link -- https://course.acciojob.com/idle?question=265d7578-83d0-472a-8439-f71eaea871eb

import java.io.*;
import java.util.*;

class Solution {

    public int[] recentCalls(int[] arr) {

		RecentCounter rc = new RecentCounter();
		int ans[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			ans[i] = rc.ping(arr[i]);
		}
			return ans;
    }
	
}
class RecentCounter {

    Queue<Integer> queue ;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.offer(t);

        while(!queue.isEmpty()&& t-3000 > queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution Obj = new Solution();
        int[] ans = Obj.recentCalls(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
