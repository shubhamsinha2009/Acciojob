
// Question Link - https://course.acciojob.com/idle?question=d203d755-cbed-4c79-910b-d77dec37f33b

import java.util.*;

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				int m=sc.nextInt();
				int k=sc.nextInt();
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.minDays(A,n,m,k);
				System.out.println(ans);
				t--;
			}
		}
	}

}
class Solution {
    public int minDays(int[] bloomDay,int n, int m, int k) {

        if(n<m*k) return -1;

        int low = bloomDay[0];
        int high = bloomDay[0];

        for(int i:bloomDay){
            low = Math.min(i,low);
            high = Math.max(i,high);
        }
        
        int ans = -1;

        while(low<=high){
            int mid = (low +high)/2;

            if(isPossible(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] bloomDay, int m ,int k, int mid ){
        int count1=0;
        int count2=0;

        for(int i : bloomDay){
               count2++;
                if(i>mid){
                    count2=0;
                }else if(count2 == k ){
                    count1++;
                    count2=0;
                }
        }

        return count1>=m;

		
	}
}
