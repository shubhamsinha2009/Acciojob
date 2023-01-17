
// Question Link - https://course.acciojob.com/idle?question=72efea8a-6472-4705-af3d-69ada985c057

import java.util.*;

class Solution {
    static int countEqualSubarray01(int arr[], int n)
    {
        HashMap<Integer,Integer> map =new HashMap<>();
		map.put(0,1);
		int count0 = 0;
		int count1 = 0;
			int ans =0;
		for(int i:arr){
			if(i==0) count0++;
			else count1++;
			int code = count1-count0;
			int count = map.getOrDefault(code,0);
			ans+= count;
			map.put(code,count+1);
		}
         return ans;
    }   

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
    

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.countEqualSubarray01(arr,N));

    }
}
