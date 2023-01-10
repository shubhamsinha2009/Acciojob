
// Question Link -- https://course.acciojob.com/idle?question=a11eac7c-f247-409b-851e-7e5bc94bc2ca

import java.io.*;
import java.util.*;

class Solution{
	public long minSubarraySum(int n, int arr[]){
		 int MOD = 1000000007;
        Stack<Integer> stack = new Stack<>();
        long sumOfMinimum = 0;

        for(int i=0; i<=n;i++){

            while(!stack.empty() && (i==n || arr[stack.peek()] >= arr[i])){

                    int index = stack.pop();
                    int ngei = i;
                    int sgei = stack.empty() ? -1 :stack.peek();

                    long leftBoundary = index - sgei ;
                    long rightBoundary = ngei - index;
                    
                    long value = arr[index];
                    long contribution = (rightBoundary*leftBoundary*value)%MOD;

                    sumOfMinimum += contribution%MOD;
                    sumOfMinimum%=MOD;
                    
            }
            stack.push(i);

        }

        return sumOfMinimum;
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
		Solution Obj = new Solution();
        System.out.println(Obj.minSubarraySum(n,a));
    }
}
