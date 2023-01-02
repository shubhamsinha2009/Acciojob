
// Question Link -- https://course.acciojob.com/idle?question=b5189133-5945-452d-a8c6-f4714fe88724

import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> getPaths(int[][] maze) {

		ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();

		helper(maze.length-1,maze[0].length-1,list,ans,maze,0);

		return ans;
		
    }

	public void helper(int row , int col ,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans,int[][] maze,int sum){

		if(row<0 || col <0 ) return ;

		if(row==0&&col==0){
			list.add(maze[row][col]);
			sum+=maze[row][col];
			if(sum%3==0 || sum%5==0){
				ans.add(new ArrayList<>(list));
			}
			list.remove(list.size()-1);
			return;
		}
			list.add(maze[row][col]);
			
			helper(row-1,col,list,ans,maze,sum+maze[row][col]);
			helper(row,col-1,list,ans,maze,sum+maze[row][col]);
			helper(row-1,col-1,list,ans,maze,sum+maze[row][col]);
		
			list.remove(list.size()-1);
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                maze[i][j] = sc.nextInt();
        }
        Solution Obj = new Solution();
        ArrayList<ArrayList<Integer>> res = Obj.getPaths(maze);
        Collections.sort(res, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int result = 0;
                for (int i = 0; i <= o1.size() - 1 && result == 0; i++) {
                    result = o1.get(i).compareTo(o2.get(i));
                }
                return result;
            }
        });
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++)
                System.out.print(res.get(i).get(j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
