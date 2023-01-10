
// Question Link - https://course.acciojob.com/idle?question=2d56d7c3-099b-4480-9311-f182fbab85ad

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public void merge(int[][] intervals) {
      
        List<int[]> merged = new ArrayList<>();

        if(intervals.length == 0 || intervals == null){
           return;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0])); // Or use a[0] - b[0]
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] interval : intervals){

            if(interval[0]<=end){

                end = Math.max(end,interval[1]);
            }else{
                merged.add(new int[]{start,end});
                start = interval[0];
                end = interval[1];

            }

        }

            merged.add(new int[]{start,end});

		for(int[] a: merged )
			System.out.println(a[0] +" "+ a[1]);


                
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.merge(A);
        
    }
}
