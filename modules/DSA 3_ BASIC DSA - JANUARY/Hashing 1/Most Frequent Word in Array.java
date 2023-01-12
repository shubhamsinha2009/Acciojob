
// Question Link - https://course.acciojob.com/idle?question=4ba002e3-51e3-4770-abdf-94f04d3aef69

import java.io.*;
import java.util.*;

class Solution {
    public void mostFrequent(String []arr, int n) {

		int max = 0;
		String ans = "";
		HashMap<String,Integer> hash = new HashMap<>();
		for(String s : arr){
			int count = hash.getOrDefault(s,0)+1;	

			if(count>= max){
				max = count;
				ans = s;
			}

			hash.put(s,count);
		}

		System.out.println(ans);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        Solution Obj = new Solution();
        Obj.mostFrequent(arr,n);  
        System.out.println('\n');
    }
}
