
// Question link -- https://course.acciojob.com/idle?question=b21cba45-2a97-4492-82f7-5e23ed20ac00

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	  public static void main (String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int [][] arr= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        Solution obj= new Solution();
	        
	        System.out.println(obj.orangesRotting(arr));
		}
}
class Solution{        
	 public static int orangesRotting(int[][] grid) {
  Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minutes = -1;
        int freshCount = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2) queue.offer(new int[]{i, j}); //gathering rotten oranges to queue
                else if(grid[i][j] == 1) freshCount++;
            }
        }

        if(freshCount == 0) return 0; //there is no fresh orange.
        if(queue.size() == 0) return -1; //there is noting to rotten.

        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size(); //Rotten oranges simultaneously affect adjacent fresh oranges.
            for(int i = 0; i < size; i++) {
                //if using queue.size() instead of size, it will be not working properly, beacuse queue is changeable.
                int[] now = queue.poll();
                for (int[] dir : dirs) { //find fresh oragnes from adjacent directions.
                    int x = now[0] + dir[0];
                    int y = now[1] + dir[1];

                    if (x > grid.length - 1 || x < 0 || y > grid[0].length - 1 || y < 0) continue;
                    if (grid[x][y] == 1) {
                        queue.offer(new int[]{x, y});
                        grid[x][y] = 2; //rotten..!!
                        freshCount--;
                    }
                }
            }
        }
        //if freshCount is not 0, it means that all fresh orange couldn't be rotten.
        return freshCount != 0 ? -1 : minutes;
}
}
