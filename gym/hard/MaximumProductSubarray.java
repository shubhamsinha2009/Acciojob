
// Question Link -- https://course.acciojob.com/idle?question=0c0dd3e1-62fc-40fd-9a25-7d1003c2720a

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxProduct(int[] nums) {
            int maxMul = Integer.MIN_VALUE;

            int mul =1;
            int checkMul = 1;
            boolean check= false; 

          
                for(int j =0 ; j<nums.length;j++){

                    mul *= nums[j];
                    checkMul *= nums[j];

                    
                    if(maxMul < mul){
                        maxMul = mul;
                        
                    }
                     if(maxMul < checkMul){
                        maxMul = checkMul;
                        
                    }

                    
                    if(mul ==0){
                        mul = 1;
                    }
                    if(checkMul == 0){
                        checkMul =1;
                        check = false;
                    }
                    if(mul<0 && !check){
                        
                            checkMul =1;
                            check = true;
                    }
                    
                }

                return maxMul;
        
    }
}


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		while(--testCases >= 0){
			int n = sc.nextInt();
			int a[] = new int[n];

			for(int i =0 ; i<n;i++){
				a[i] = sc.nextInt();
			}

			Solution obj = new Solution();
			int ans = obj.maxProduct(a);

			System.out.println(ans);
			
		}
        
	}
}
