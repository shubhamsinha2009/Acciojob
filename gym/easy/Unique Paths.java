
// Question Link -- https://course.acciojob.com/idle?question=29a4b5b5-b7d0-4398-938f-776f4ed275a2

import java.util.*;

class Solution{
    public static int UniquePaths(int m, int n){
              if(m<n) {
            int temp =m;
            m=n;
            n=temp;
        }
       double res = 1;
        
        for (int i = 1; i <= n-1; i++) {
            res = res * (m-1+i) / i;
          
        }
        return (int)res;

    }

}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Solution obj = new Solution();
        int ans = obj.UniquePaths(m,n);
        System.out.println(ans);
    }
}
