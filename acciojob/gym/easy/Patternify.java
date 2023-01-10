
// Question Link - https://course.acciojob.com/idle?question=06af582c-28c2-4cba-a055-2982c886b5af

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = Solution.printPatt(n);
        for(int i=0;i<n;i++) {
            System.out.println(ans[i]);
        }
    }
}

class Solution {
    static String[] printPatt(int N) {

		String[] s = new String[N];
		for(int i =0 ; i<N; i++){
				s[i]="";
			for(int j = 0;j<N-i;j++){
				s[i] += "*";
			}
			
		}
		return s;
    }

}
