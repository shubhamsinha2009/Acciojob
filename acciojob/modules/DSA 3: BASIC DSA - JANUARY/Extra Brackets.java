
// Question Link -- https://course.acciojob.com/idle?question=1375f004-d383-4a7e-9716-e1a5e377a2ec

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean ExtraBrackets(String exp) {

		Stack<Character> stack = new Stack<>();

		for(Character ch : exp.toCharArray()){

			if(ch==')'){
				boolean count = false;
				while(stack.pop()!='('){
					count = true;
				}

				if(!count) return true; 
			}else{
				stack.push(ch);
			}
		}
		return false;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
	    Solution Obj = new Solution();
        if(Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
