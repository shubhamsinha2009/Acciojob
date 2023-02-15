
// Question Link -- https://course.acciojob.com/idle?question=e0420aa8-f4e9-4a99-abe5-0cf0b05b3ce1

import java.util.*;

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int matrix[][], Pair query[]) {
		
		for(int i=0;i<matrix.length;i++){
			for(int j =0;j<matrix[0].length;j++){	
			if(i-1>=0)	matrix[i][j]+= matrix[i-1][j];
			if(j-1>=0)	matrix[i][j]+= matrix[i][j-1];
			if(i-1>=0 && j-1>=0) matrix[i][j] -= matrix[i-1][j-1];	
			}
		}
		
		/* for(int[] a:matrix){
			for(int b : a){
				System.out.print(b+" ");
			}
			System.out.println();
		} */

		List<Integer> list = new ArrayList<>();

			for(Pair p : query){
				int row2=p.row2,row1=p.row1,col2=p.col2,col1=p.col1;
				int ans = matrix[row2][col2];
				if(row1>0) ans-= matrix[row1-1][col2];
				if(col1>0) ans-= matrix[row2][col1-1];
				if(row1>0 && col1>0) ans+= matrix[row1-1][col1-1];
				list.add(ans);			
			}
		return list;
		
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p=new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i]=p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for(int x: ans)
        System.out.println(x);
        sc.close();
    }
}
