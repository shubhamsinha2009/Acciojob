
// Question Link - https://leetcode.com/problems/merge-intervals/

class Solution {

    public int[][] merge(int[][] intervals) {
        
        List<int[]> merged = new ArrayList<>();

        if(intervals.length == 0 || intervals == null){
            return merged.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0])); // Or use a[0] - b[0]
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] interval : intervals){

            if(interval[0]<=end){

                end = Math.max(end,interval[1]);
            }else{
                merged.add(new int[]{start,end});
                start = interval[0];
                end = interval[1];

            }

        }


            merged.add(new int[]{start,end});
            return merged.toArray(new int[merged.size()][]);


    }
}
