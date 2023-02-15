
// Question Link -- https://course.acciojob.com/idle?question=394beaf0-a22e-4e5d-81ca-9b29ea03f57e


 import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	   public static void main(String args[]) {
		  
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[][] trips = new int[n][3];
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < 3; j++) {
		                trips[i][j] = sc.nextInt();
		            }
		        }
		        int k = sc.nextInt();
	           
	        Solution obj= new Solution();
	        System.out.println(obj.carPooling(trips,k));
	    }
}
class Solution{
  
    public boolean carPooling(int[][] trips, int capacity) {

			TreeMap<Integer,Integer> treeMap = new TreeMap<>();

			for(int trip[] : trips){
				int count = treeMap.getOrDefault(trip[1],0) + trip[0];
				treeMap.put(trip[1],count);
				int count2 = treeMap.getOrDefault(trip[2]+1,0) - trip[0];
				treeMap.put(trip[2]+1,count2);
			}

			int prev = 0;
			for(Integer value : treeMap.values()){
					value+= prev;
					if(value>capacity) return false;
					prev = value;
			}
		return true;
		
}
}
