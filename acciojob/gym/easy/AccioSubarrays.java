
// Questions Link -- https://course.acciojob.com/idle?question=48f91960-ac58-41bd-a276-d4894cece11d

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int ans = Solution.accioSubarrays(arr, n);
            System.out.println(ans);
        }
    }
}
class Solution 
{
    static int accioSubarrays(int[] a, int n) 
    {
		// Time Complexity -- O(n)
		// Space Complexity - O(1)
		
          if(n <=2) return 0;

		int sum =0;
		int previousDifference = a[1]-a[0];
		int continuos =1;
		for(int i =2 ; i<n ;i++){
			int difference = a[i] - a[i-1];
			if( previousDifference == difference ){	
				sum+=continuos++;	
				
				}else{
					continuos = 1;
				}	
			previousDifference = difference;
		}
		return sum;
		
    }
}
