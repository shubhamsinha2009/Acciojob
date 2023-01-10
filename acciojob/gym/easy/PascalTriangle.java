
// Question Link - https://course.acciojob.com/idle?question=12f0a018-3366-4117-a52d-4baec8223a21

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Obj = new Solution();
        ArrayList<ArrayList<Integer>> triangle = Obj.pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {

		ArrayList<ArrayList<Integer>> t = new ArrayList<>();
		ArrayList<Integer> row, pre = null;
        
		for(int i =0 ; i<numRows;i++){
			row = new ArrayList<Integer>();
			for(int j=0;j<=i;j++){

				if(j==0 || j==i){
					row.add(1);
				}else{
					row.add(pre.get(j) + pre.get(j-1));
				}
				
			}			
			pre = row;
			t.add(row);
		}
		return t;
    }
}
