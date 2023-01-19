
// Question Link - https://course.acciojob.com/idle?question=e6a1d307-59de-4d83-b174-943c69c5b042

import java.util.*;

class Solution{
    public int findPeak(int arr[], int n)
    {
        
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] > arr[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
       
    }
}

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
				int ans = ob.findPeak(A,n);
                if(ans==0){
                    if(A[ans]>A[ans+1]){
                        System.out.println("true");
                    }
                    else{
                       System.out.println("false");    
                    }
                }
                else if(ans==n-1){
                    if(A[ans]>A[ans-1]){
                        System.out.println("true");                        
                    }
                    else{
                        System.out.println("false");                        
                    }
                }
                else{
                    if(A[ans]>A[ans+1] && A[ans]>A[ans-1]){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");                        
                    }
                }
				t--;
			}
		}
	}
}
