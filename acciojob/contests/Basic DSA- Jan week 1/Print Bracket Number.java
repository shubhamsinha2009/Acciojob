
// Question Link - https://course.acciojob.com/idle?question=b35b8b6f-f94e-4fc1-85a5-34d9e486acd7

import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(int value :  result)
            System.out.print(value + " ");
            System.out.println();
        
    }
}


class Solution {
    ArrayList<Integer> barcketNumbers(String S) {

		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
	int open =0;
		for(char ch : S.toCharArray() ){

			if(ch == '('){
				stack.push(++open);
				ans.add(open);
			}else if(ch==')'){
				int x = stack.pop();
				ans.add(x);
				
			}
		}
		return ans ;
		
    }
};
