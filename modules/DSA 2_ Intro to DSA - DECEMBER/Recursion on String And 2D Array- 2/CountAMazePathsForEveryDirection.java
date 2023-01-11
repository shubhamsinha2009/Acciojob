
// Question Link -- https://course.acciojob.com/idle?question=2875c8b1-6a6b-4946-9aed-ce1ac886f2e0

import java.util.*;

class Solution {

    static int countAllPathHelper(int x, int y, int n, int m, boolean[][] visited){
            
        if(x>n || y > m || x<1 || y <1) return 0;
        if(visited[x][y])return 0;
        if(x==n && y==m)return 1;

        visited[x][y]= true;

		int count =0 ;
        // horizontal
       count+= countAllPathHelper(x+1,y,n,m,visited);
		count+= countAllPathHelper(x-1,y,n,m,visited);
        //Vertical
       count+=  countAllPathHelper(x,y+1,n,m,visited);
       count+=  countAllPathHelper(x,y-1,n,m,visited);
        //Diagonal
       count+=  countAllPathHelper(x+1,y+1,n,m,visited);
       count+=  countAllPathHelper(x+1,y-1,n,m,visited);
       count+=  countAllPathHelper(x-1,y+1,n,m,visited);
       count+=  countAllPathHelper(x-1,y-1,n,m,visited);
        
        visited[x][y]= false;

        return count;
    }
    static int countAllPath(int n, int m)
    {
      
        boolean[][] visited = new boolean[n+1][m+1];

       return countAllPathHelper(1,1,n,m,visited);
        
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.countAllPath(n,m));
    }
}
