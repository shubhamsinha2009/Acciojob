
// Question Link -- https://course.acciojob.com/idle?question=05d6b1b0-d843-4974-8a19-c65be520d5a9

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static int[] twoSum(int[] A, int target) {

		int low = 0;
		int high = A.length-1;

		while(low<high){

			if(A[low]+A[high] > target){
				high--;
			} else if(A[low]+A[high] < target){
				low++;
			}else{
				return new int[]{low+1,high+1};
			}
		}

		return new int[]{low+1,high+1;
    }
	
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}



