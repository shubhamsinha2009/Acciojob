
// Question Link -- https://course.acciojob.com/idle?question=e16170b9-480d-4bff-be85-dacd2afc2e48

import java.io.*;
import java.util.*;

class Solution{
    boolean expBalanced(String str){

		Stack<Character> stack = new Stack<>();

		for(Character ch :str.toCharArray()){

			if(ch=='('||ch=='{'||ch=='[') stack.push(ch);
			else if(stack.empty()) return false;
			else if(ch == ')' && stack.peek() != '(' ) return false;
			else if(ch == '}' && stack.peek() != '{' ) return false;
			else if(ch == ']' && stack.peek() != '[' ) return false;
			else if(ch==')'||ch=='}'||ch==']') stack.pop(); 
			
		}
		return stack.empty() ;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solution Obj = new Solution();
        System.out.println(Obj.expBalanced(str));
    }
}
