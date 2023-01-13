
// Question Link -- https://course.acciojob.com/idle?question=c47351e9-e120-488d-a193-0fdc5ab7a56b

import java.io.*;
import java.util.*;

class Solution {
    public long pairDifference(int []nums, int n, int k) {

		HashMap<Integer,Boolean> map = new HashMap<>();

		int pairs = 0;
		for(int e : nums){
			if(k==0){
				if(map.getOrDefault(e,false)){
					pairs++;
					map.put(e,false);
				}else{
					map.put(e,true);
				}
				
			}else{
				map.put(e,true);
			}
				
			
				
		};

		if(k==0) return pairs;

		for(int e:map.keySet()){
			
			if(map.getOrDefault(e-k,false))pairs++;
			if(map.getOrDefault(e+k,false))pairs++;

				map.put(e,false);
		}

		return pairs;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.pairDifference(mat,n,k));
        System.out.println('\n');
    }
}
