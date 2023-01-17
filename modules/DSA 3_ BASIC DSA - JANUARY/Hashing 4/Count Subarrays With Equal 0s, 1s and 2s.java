
// Question Link -- https://course.acciojob.com/idle?question=adb9b9f3-7409-4c5a-a694-3c43c5653fb4

import java.util.*;

class Solution {
    static int countEqualSubarray012(int arr[], int n)
    {
       HashMap<String,Integer> map =new HashMap<>();
		map.put("0#0",1);
		int count0 = 0;
		int count1 = 0;
		int count2=0;
			int ans =0;
		for(int i:arr){
			if(i==0) count0++;
			else if(i==2) count2++;
			else count1++;
			int d1= count1-count0;
			int d2= count2-count1;
			String code= d1+"#"+d2;
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
        System.out.println(Obj.countEqualSubarray012(arr,N));

    }
}

