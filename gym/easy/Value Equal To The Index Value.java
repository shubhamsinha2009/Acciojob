
// Question Link -- https://course.acciojob.com/idle?question=075ea9e4-98b2-4109-80cb-1cacf65fa325

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArray[] = new int[n];
        for(int i=0;i<n;i++) {
            numArray[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = Solution.valueEqualToIndices(numArray, n);
        int m = ans.size();
        for(int i=0;i<m;i++) {
            if(i == m-1) {
                System.out.print(ans.get(i) + "\n");
            }
            else {
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}
class Solution {

    static ArrayList<Integer> valueEqualToIndices(int numArray[], int n) {
        
		ArrayList<Integer> a = new ArrayList<>();

		for(int j =0; j<n ; j++){
			
			if(j == numArray[j]){
				a.add(j);
			}
			
		}
		if(a.size() == 0){
			 a.add(-1);
		}
		return a;
    }
}
