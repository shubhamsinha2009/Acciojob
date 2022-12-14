
// Questions Link -- https://course.acciojob.com/idle?question=b88bee5b-1099-40a3-89c4-3f218cfc9600

import java.util.*;
class Solution {
	
    public void sortByFrequency(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)  
			map.put(num, map.getOrDefault(num, 0) + 1);
        
        List<Integer> list = new ArrayList<>(map.keySet());
		
	    Collections.sort(list, (a, b) -> map.get(a) == map.get(b)? Integer.compare(b,a) : Integer.compare(map.get(a), map.get(b)));

        int[] res = new int[nums.length];
		
        for (int num : list) 
            for (int j = 0; j < map.get(num); j++) 
                 System.out.print(num+" ");
    }
}
		
		// Collections.sort(list, (a, b) -> {
		// 	 if(map.get(a) == map.get(b)){ 
		// 		 return Integer.compare(b,a); 
		// 	 }
		// 	 else{
		// 		 return Integer.compare(map.get(a), map.get(b));
		// 	 }
		//   });  

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.sortByFrequency(arr);
        sc.close();
    }
}
