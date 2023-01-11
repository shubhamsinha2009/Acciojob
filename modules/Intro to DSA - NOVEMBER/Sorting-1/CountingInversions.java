
// QUestion Link - https://course.acciojob.com/idle?question=e6b71cf6-d111-4207-8d64-3f1865f6caeb

import java.util.*;
class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.CountingInversions(A,0,n-1);
                System.out.print(ans);
                System.out.println();
				t--;
			}
		}
	}

}
class Solution {
    public int CountingInversions(int[] arr,int l,int r) {	
		 return mergeSort(arr,l,r);
}

	static int mergeSort(int[] arr,int l,int r){
		int swaps =0;
		if(l>=r) return swaps;
			int mid = l + (r-l)/2 ;
			swaps+=mergeSort(arr,l,mid);
			swaps+=mergeSort(arr,mid+1,r);
			swaps+=merge(arr,l,mid,r);
		return swaps;
        }
static int merge(int[] arr, int l, int mid,int r){

	int merged[] = new int[r-l+1];
	int p1 = l, p2 = mid + 1,p3 = 0,swaps =0;

	while(p1<=mid && p2<=r){
		if(arr[p1] <= arr[p2]) merged[p3++] = arr[p1++];
		else{ 
			merged[p3++] = arr[p2++];
			swaps+= mid - p1 +1 ;
			}
	}

	while(p1<=mid) merged[p3++] = arr[p1++];
	while(p2<=r) merged[p3++] = arr[p2++];

	for(int i=0;i<merged.length;i++) arr[i+l]=merged[i];
	return swaps;

	
}	
}
