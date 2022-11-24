
// Question Link -- https://course.acciojob.com/idle?question=f7a7790c-2f0f-49ef-aadb-ee0031f88e28

import java.util.*;
class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        int target=sc.nextInt();
        int []A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        Solution ob =new Solution();
        int []ans = ob.twosum(A,n,target);
        System.out.println(ans[0]+" "+ans[1]);                        
		}
	}

}

class Solution{
 
    public int[] twosum(int arr[], int n, int target){

		int ans[] = new int[2];
		int start = 0;
		int end = n-1;

		while(start<end){
			int sum = arr[start]+arr[end];

			if(sum<target){
				start++;
			} else if(sum>target){
				end--;
			}else{
				
				return new int[]{start+1 , end+1};
			}
		}
		return null;
    }
}
