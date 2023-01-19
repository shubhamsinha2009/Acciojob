
// Question Link -- https://course.acciojob.com/idle?question=2665b43f-7632-47bd-83ae-eaca271efc3c

import java.io.*;
import java.util.*;
import java.util.*;

class Solution{

    public static int aggressiveCows(int a[],int cows){
		Arrays.sort(a);
		int n = a.length;
			int l = a[1] -a[0];
			int h = a[n-1] - a[0];

		for(int i =2;i<n;i++){
			l= Math.min(l,a[i]-a[i-1]);
		}
		int ans = -1;

		while(l<=h){
			int mid = (l+h)/2;

			if(isPossible(a,cows,mid)){
				ans= mid;
				l=mid+1;
			}else{
				h=mid-1;
			}
			
		}
		return ans ;
		
    }

	public static boolean isPossible(int[] a, int cows,int minDist){
		int cowsPlaced = 1;
        int lastPositionPlaced = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] - lastPositionPlaced >= minDist) {
                cowsPlaced++;
                lastPositionPlaced = a[i];
            }
        }

        return cowsPlaced >= cows; 
	}


}

class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));

    }
}
