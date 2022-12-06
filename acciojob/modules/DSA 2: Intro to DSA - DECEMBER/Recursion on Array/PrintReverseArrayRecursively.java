

// Question Link -- https://course.acciojob.com/idle?question=65eafce1-0855-4edb-a0be-6907192010ca

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintReverseArray(arr, n);
    }

	public static void PrintReverseArray(int[] arr, int n) {
        if(n==0) return ;
		System.out.print(arr[n-1]+" ");
		PrintReverseArray(arr,n-1);
    }

  }
