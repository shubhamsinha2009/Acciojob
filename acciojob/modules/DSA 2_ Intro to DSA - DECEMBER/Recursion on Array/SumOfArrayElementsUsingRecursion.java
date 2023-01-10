

// Question Link -- https://course.acciojob.com/idle?question=5689bae3-022f-40f8-b89f-a118f520c45f

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sumofArrayRec(arr, n));
    }

	public static int sumofArrayRec(int[] arr, int n) {
        if(n==1) return arr[0];
		return arr[n-1] + sumofArrayRec(arr,n-1);
    }
}
