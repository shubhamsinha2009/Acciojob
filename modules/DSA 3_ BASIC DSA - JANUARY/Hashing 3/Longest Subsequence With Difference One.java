
// Question link -- https://course.acciojob.com/idle?question=1ca1c62e-19c2-4ef6-9f62-0fb652b756dc

import java.util.*;

class Accio {
    public int longestSubsequence(int[] arr) {
		int difference = 1;
        HashMap<Integer, Integer> hash = new HashMap();
        int max = 1;

        for(int i :arr){
           int n1 = hash.getOrDefault(i-difference,0)+1;
			int n2 = hash.getOrDefault(i+difference,0)+1;
			int n  = Math.max(n1,n2);
            hash.put(i,n);
            max = Math.max(max,n);
			// System.out.println(hash);
        }
        return max ;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
    	for(int i=0;i<N;i++)
	    nums[i] = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestSubsequence(nums));
    }
}
