
// Question Link -- https://course.acciojob.com/idle?question=d13a53f3-b01e-4808-b2f4-6a078e1b36cc

import java.util.*;
import java.io.*;

class Solution {
static void mergeSort(int[] arr,int l,int r){
		if(l>=r) return;
			int mid = l + (r-l)/2 ;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
        }
static void merge(int[] arr, int l, int mid,int r){

	int merged[] = new int[r-l+1];
	int p1 = l, p2 = mid + 1,p3 = 0;

	while(p1<=mid && p2<=r){
		if(arr[p1] < arr[p2]) merged[p3++] = arr[p1++];
		else merged[p3++] = arr[p2++];
	}

	while(p1<=mid) merged[p3++] = arr[p1++];
	while(p2<=r) merged[p3++] = arr[p2++];

	for(int i=0;i<merged.length;i++) arr[i+l]=merged[i];

	
}	
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
