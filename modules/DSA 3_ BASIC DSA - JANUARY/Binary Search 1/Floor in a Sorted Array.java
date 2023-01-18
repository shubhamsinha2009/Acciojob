
// Question Link -- https://course.acciojob.com/idle?question=12a72266-1582-45fe-9d30-db3a1a0b710e


import java.util.*;
import java.io.*;

class Solution{

	public static int findFloor(int[] a ,int t){
		int n = a.length;
		int low = 0;
		int high = n-1;
		int floor = -1;

		while(low<=high){
			int mid = (low+high)/2;

			if(a[mid] == t){
				return mid;
			}else if(a[mid] < t){
				floor = mid;
				low= mid+1;
			}else{
				high = mid-1;
			}
		}

		return floor;
	}
}
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a[] = new int[n];

		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}

		Solution obj = new Solution();
		System.out.println(obj.findFloor(a,t));
    }
}
