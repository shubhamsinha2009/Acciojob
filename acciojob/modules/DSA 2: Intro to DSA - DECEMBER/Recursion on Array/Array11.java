

// Question Link -- https://course.acciojob.com/idle?question=fad89b8e-c73f-4a75-9de6-a5b045e60394

import java.util.*;
public class Main {
    static int array11(int[] nums, int index) {
		if(index==nums.length) return 0;

		int n = array11(nums,index+1);
		if(nums[index] == 11) return n+1;
		return n;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array11(arr, 0));
    }
}
