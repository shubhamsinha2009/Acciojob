
// Question Link -- https://course.acciojob.com/idle?question=a4831d62-d207-48a3-92c1-0f8deacabfdf

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    System.out.println(reverseParentheses(s));
  }

  public static String reverseParentheses(String s) {
    int n = s.length();
        Stack<Character> stack = new Stack();

        for(int i =0 ; i<n;i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                StringBuilder sb = new StringBuilder();
                while(!stack.empty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
                
                for(int j =0 ; j< sb.length();j++) stack.push(sb.charAt(j));
            }else{
                stack.push(ch);
            }

            
        }
        
        StringBuilder sb = new StringBuilder();

        while(!stack.empty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString() ;

  }
}
