
// Question Link -- https://course.acciojob.com/idle?question=ea7fc1c8-be76-4490-8a27-b4c5ff4fa51f

import java.util.*;

class Solution{
    public boolean balancedBrackets(String s, int n) {
   Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
	     if(Obj.balancedBrackets(s, n)){
			 System.out.println("YES");
		 }else{
			 System.out.println("NO");
		 }
    }
}
