

// Question Link -- https://course.acciojob.com/idle?question=400e860f-4061-4caa-bc11-0b2cf75c100e

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums , nums.length);
        System.out.print(result);
    }

    public static int maxElement(int[] arr ,int n){

		if(n==1) return arr[0];

		int max = Math.max(arr[n-1], maxElement(arr,n-1));
		
		return max;
		
    }

	
}
