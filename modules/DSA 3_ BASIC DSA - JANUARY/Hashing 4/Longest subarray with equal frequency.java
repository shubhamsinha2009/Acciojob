
// Question link - https://course.acciojob.com/idle?question=617c656f-342f-4dd1-b9e0-5c1469fad4a7
import java.util.*;

import java.util.*;

class Solution{
    public static int longestSubarray(int[] arr){
		int n = arr.length;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int max =0;
		HashMap<String,Integer> map = new HashMap<>();
		map.put("0#0",-1);
		for(int i =0;i<n;i++){
				int element =arr[i];

			if(element ==0){
				count0++;
			}else if(element ==1){
				count1++;
			}else{
				count2++;
			}

		int d0 = count1-count0;
		int d1 = count2-count1;

		String code = d0+"#"+d1;

			if(map.containsKey(code)){
				int index = map.get(code);
				int len = i -index;
				max = Math.max(max,len);
			}else{
				map.put(code,i);
			}
				
		}
		return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj =  new Solution();
        System.out.println(Obj.longestSubarray(arr));
    }
}
