
// Question Link -- https://course.acciojob.com/idle?question=0afc59ea-2203-4382-a249-58ad9ad316bc

import java.util.*;
import java.io.*;

class Solution{
    static int minCost(int []cost, int n, int k){

		Arrays.sort(cost);

		int minCost =0;
		int l =k;
		
			for(int i =n-1; i>=0 ;i--){

				minCost+= (l/k)*cost[i];
				l++;
				
		}
		return minCost;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = input.nextInt();
        }        
        System.out.println(Solution.minCost(cost,n,k));
    }
}
