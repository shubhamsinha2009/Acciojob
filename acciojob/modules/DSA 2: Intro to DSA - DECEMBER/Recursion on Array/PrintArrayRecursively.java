
// Question Link -- https://course.acciojob.com/idle?question=249da881-b2a3-45a9-9e10-8b74832fb0b9

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

	public static void PrintArray(int[] arr, int n) {

		if(n==0)return ;

		PrintArray(arr , n-1);
		System.out.print(arr[n-1] +" ");
		
    }

}
