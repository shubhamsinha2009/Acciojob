
// Question Link -- https://course.acciojob.com/idle?question=9fa66613-25ce-4390-99a0-d3ae2f3825ba

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.getMaxMarker(arr, n, m);
        System.out.println(ans);
    }
}
class Solution 
{
    static int getMaxMarker(ArrayList<Integer> arr, int n, int m) 
    {
       int low = 0;
		int high = 0;

		for(Integer i:arr){
			high = Math.max(high,i);
		}
		int ans =-1;
		while(low<=high){
			int mid = (low+high)/2;
			//	System.out.println("mid:" + mid);
			if(isPossible(arr,m,mid)){
				ans = mid;
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return ans;
    }

	static boolean isPossible(ArrayList<Integer> arr, int m,int mid){

		int sum =0;

		for(int i =0;i<arr.size();i++){
			int element = arr.get(i);
			//	System.out.println("ele: " + element);
					if(element > mid) sum+= element-mid;
			// System.out.println("sum: "+ sum);
					if(sum>=m) return true;
		}
		return false;
	}
}
