
// Question Link -- https://leetcode.com/problems/sort-array-by-increasing-frequency/description/

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)  
			map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> list = new ArrayList<>(map.keySet());

	    Collections.sort(list, (a, b) -> map.get(a) == map.get(b)? Integer.compare(b,a) : Integer.compare(map.get(a), map.get(b)));

        
        int i=0;
        for (int num : list) 
            for (int j = 0; j < map.get(num); j++) 
                 nums[i++]=num;

                 return nums;
    }
        
    }
