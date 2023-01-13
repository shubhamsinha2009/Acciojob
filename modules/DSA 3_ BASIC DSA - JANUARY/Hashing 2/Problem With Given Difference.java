
// Question link -- https://course.acciojob.com/idle?question=803b4abc-3829-4b3b-9dab-74da720ff06a

import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) {

			HashSet<Integer> set = new HashSet<>();

		for(int i : A){

			if(set.contains(i-B) || set.contains(i+B)) return 1;
			
			set.add(i);
		}

		return 0;
		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
