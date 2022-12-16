
// Question Link -- https://course.acciojob.com/idle?question=0757114b-55f1-4694-8c98-65cc3ca28d37

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.decodeString(str);
    }
}
class Solution {
    public static void decodeString(String s) {
       Stack<String> stack = new Stack<>();
       for (Character c: s.toCharArray()){
           if(c!=']'){
               stack.push(String.valueOf(c));
           } else {
               StringBuilder sb = new StringBuilder();
               while (!stack.isEmpty() && !stack.peek().equals("[")){
                   sb.insert(0, stack.pop());
               }
               String str = sb.toString();
               sb.setLength(0);
               stack.pop();

               while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                   sb.insert(0, stack.pop());
               }
               int num = Integer.parseInt(sb.toString());
               for (int i=0; i<num; i++){
                   stack.push(str);
               }
           }
       }
       String ans = String.join("", stack);
       System.out.println(ans);
    }
}
