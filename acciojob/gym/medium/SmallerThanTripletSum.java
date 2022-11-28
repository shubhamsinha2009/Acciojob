

// Question Link -- https://course.acciojob.com/idle?question=0579040b-f013-4c85-988a-07130a995397

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = Solution.threeSumSmaller(n,A,target);
        System.out.println(ans);
    }
}
class Solution {
    static int threeSumSmaller(int n, int[] a, int target) {
      
		int ans =0;
		for(int i =0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k =j+1 ; k<n;k++){

				if(a[i] + a[j]+a[k] < target){
					ans++;
					
				}

					
				}

			
			}
		}
		return ans ;
		
    }
}
