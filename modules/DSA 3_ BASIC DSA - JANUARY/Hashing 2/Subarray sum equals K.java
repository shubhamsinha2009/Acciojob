
// Question Link -- https://course.acciojob.com/idle?question=ffc310e8-20af-4439-b981-4c11f7ef87af

import java.io.*;
import java.util.*;
 
 class Solution
{
     static int solve(int N, int[] nums, int k){
		 HashMap<Integer,Integer> map = new HashMap<>();

        int count =0,sum=0;
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){

            sum+= nums[i];

            count += map.getOrDefault(sum-k ,0);

            map.put(sum,map.getOrDefault(sum,0)+1);


        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		Solution c = new Solution();
		
		System.out.println(c.solve(n,a,k));
	}
}
