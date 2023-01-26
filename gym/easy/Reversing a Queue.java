
// Question Link - https://course.acciojob.com/idle?question=078c0dfb-4d92-4573-baf0-f6fb0d8ce1f1

import java.util.*;
import java.util.LinkedList;

class Solution {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
			if(q.isEmpty()) return q;
				Integer pop = q.poll();
			reverseQueue(q);
			q.offer(pop);
			return q;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(scn.nextInt());
        }
        scn.close();
        Solution Obj = new Solution();
        Queue<Integer> ans = Obj.reverseQueue(q);
        while (!ans.isEmpty()) {
            System.out.print(ans.peek() + " ");
            ans.remove();
        }
    }
}
