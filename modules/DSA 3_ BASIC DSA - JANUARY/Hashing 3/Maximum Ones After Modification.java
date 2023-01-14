
// Question Link -- https://course.acciojob.com/idle?question=357fe3fe-d5d6-4a39-abc2-9f6060497eac

import java.util.*;

class Accio {
    public int longestOnes(int[] nums, int k) {

	// Approach 1 : Time Complexity - O(2*n)
		// int n = nums.length;
  //       int numberOfZeros = 0;
  //       int max = 0;
  //       for(int i =0,j=0;i<n;i++){
  //               int number = nums[i]; 
                
  //               if(number==0) numberOfZeros++;

  //           while(numberOfZeros>k){
  //               if(nums[j]==0) numberOfZeros--;
  //               j++;
  //           }

  //           max  = Math.max(max,i-j+1);

  //       }

  //       return max ;

		// Approach 2: Time Complexity - O(n) // Window Size Matters

		int n = nums.length;
        int numberOfZeros = 0;
        int max = 0;
        int i =0,j=0;
        for(;i<n;i++){
                int number = nums[i]; 
                
                if(number==0) numberOfZeros++;

            if(numberOfZeros>k){
                if(nums[j]==0) numberOfZeros--;
                j++;
            }
        }
        return i-j;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
    	for(int i=0;i<N;i++)
	    A[i] = sc.nextInt();
        int B = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestOnes(A, B));
    }
}
