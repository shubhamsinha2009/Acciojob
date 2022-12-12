
// Question Link -- https://course.acciojob.com/idle?question=52936fff-9a86-45e6-a952-ce5918f9035f


import java.util.*;
import java.io.*;

class Solution{
	
	static void quickSort(int[] arr,int start,int end){
		if(start>=end) return;
		
		int pivotIndex = findPivotPosition(arr,start,end);
		quickSort(arr,start,pivotIndex-1);
		quickSort(arr,pivotIndex+1,end);
		
    }

	static int findPivotPosition(int[] a,int start, int end ){

		int i = start;
		int pivot = a[end];

		for(;start<end;start++)
			if(a[start] <pivot) 
				swap(a,start,i++);

		swap(a,i,end);
		return i;
	}

	static void swap(int[] a , int i, int j){
		if(i==j) return ;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr,0,n-1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
