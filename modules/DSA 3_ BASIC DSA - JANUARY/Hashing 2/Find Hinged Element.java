
// Question Link -- https://course.acciojob.com/idle?question=864309e9-49cf-4bd9-b2a5-1fa5989e3cf9

import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) {

		int[] leftMax = new int[n];
			leftMax[0] = Integer.MIN_VALUE;

			// Fill leftMax[1..n-1]
			for (int i = 1; i < n; i++)
				leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
					
			// Initialize minimum from right
			int rightMin = Integer.MAX_VALUE;

			// Traverse array from right
			for (int i = n - 1; i >= 0; i--)
			{
				// Check if we found a required element
				if (leftMax[i] < arr[i] && rightMin > arr[i])
					return i;

				// Update right minimum
				rightMin = Math.min(rightMin, arr[i]);
			}
				
			// If there was no element matching criteria
			return -1;

	}
}
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}
