
// Question Link -- https://course.acciojob.com/idle?question=98e9bbba-6f59-4585-a38c-6f9bd3cd972a

import java.util.*;

class Solution {
    static int count1(int size, int arr[]) {

		int low = 0;
		int high = size-1;

		if(arr[low]==0) return 0;
		if(arr[high] == 1) return size;
		
		while(low<=high){

			int mid = (low+high)/2;

			if(arr[mid]==1){
				if(arr[mid+1]==0)return mid+1;
				else low=mid+1;
			}else {
				if(arr[mid-1]==1) return mid;
				else{
					high = mid-1;
				}
			}
		}

		return -1;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.count1(n,array));
    }
}
