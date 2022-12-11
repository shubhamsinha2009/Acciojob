
// Question Link -- https://course.acciojob.com/idle?question=de770f57-b7c1-424a-a6e6-075d8fe0567a

import java.util.*;

class Solution {
    public int helpBob(int n) {
		if(n==1|| n==2) return 1;
		if(n%2!=0)
			return 2*helpBob(n-1) + helpBob(n-2);
		else
			return helpBob(n-1) + helpBob(n-2) + helpBob(n-3);
		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.helpBob(n);
        System.out.println(result);
        sc.close();
    }
}
