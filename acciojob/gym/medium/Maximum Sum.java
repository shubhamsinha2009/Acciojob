
// Question Link -- https://course.acciojob.com/idle?question=06b725f6-b68c-4f4a-ae0f-db18ce5ee4d4

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int MOD = (int) Math.pow(10,9) + 7 ;
    public static int maximumSum(int[] nums, int[][] requests) {
       int n = nums.length;
        int counts[] = new int[n];

        for(int[] request : requests){
            int start = request[0] ;
            int end = request[1]+1;
            counts[start]++;
            if(end<n) counts[end]--;
        }

        for(int i=1;i<n;i++) counts[i] += counts[i-1];

        Arrays.sort(nums);
        Arrays.sort(counts);

        long ans =0;

        for(int i=0;i<n;i++){
            ans+= (long) counts[i]*nums[i];
            ans %= MOD;
        }
        return (int) ans%MOD;
        
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        long m = Long.parseLong(br.readLine().trim());
        int[][] ops = new int[(int)m][2];
        for(int i=0; i<m; i++){
          String inputLine1[] = br.readLine().trim().split(" ");
          ops[i][0]=Integer.parseInt(inputLine1[0]);
          ops[i][1]=Integer.parseInt(inputLine1[1]);
        }
        System.out.println(maximumSum(arr, ops));
	}
}



