

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
        int result=maxElement(nums);
        System.out.print(result);
    }

    public static int maxElement(int[] arr){
		int maxElement = Integer.MIN_VALUE;
		return max(arr, 0, maxElement);
		
    }

	public static int max(int[] a ,int startIndex, int maxElement){
			if(startIndex == a.length) return maxElement;

		maxElement = Math.max(maxElement , a[startIndex]);

		return max(a,++startIndex,maxElement);
		
	}
}
