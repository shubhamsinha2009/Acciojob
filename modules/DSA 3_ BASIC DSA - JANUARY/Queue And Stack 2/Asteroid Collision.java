
// Question Link -- https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff


// Question Link - https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
		  Stack<Integer> s = new Stack<>();
    int n = asteroids.length;
    for (int i = 0; i < n; i++) {
      if (asteroids[i] > 0) s.push(asteroids[i]);
	  else {
        while (
          !s.empty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])
        ) s.pop();
        if (!s.empty() && s.peek() == Math.abs(asteroids[i])) {
          s.pop();
          continue;
        }
        if (s.empty() || s.peek() < 0) s.push(asteroids[i]);
      }
    }
	int k = s.size();
    int[] result = new int[k];
    while (!s.empty()) {
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
        int asteroids[] = new int[n];
        for (int i = 0; i < n; i++)
            asteroids[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(asteroids);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}
