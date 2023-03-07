import java.util.*;

class Solution {
    static int miniNumSwaps(String s, int n) {
			 int closed =0; int swaps =0;
        for(char c : s.toCharArray())
            if(c=='('){
				if(closed>0){
				 swaps+= closed;
				}
				closed--;
			}
            else closed++;
        return swaps;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String brackets = sc.next();
        int ans = Solution.miniNumSwaps(brackets, n);
        System.out.println(ans);
    }
}
