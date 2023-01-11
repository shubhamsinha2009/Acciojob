
// Question Link -- https://course.acciojob.com/idle?question=efcb1e58-c615-48b1-a7ed-def039965808

import java.io.*;
import java.util.*;


class Solution{
    public String smallestNumber(String pattern){
         int n = pattern.length();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<n;i++){
                int num = i+1; 
               char ch = pattern.charAt(i);

               if(ch=='i'){
                    sb.append(num);
                   while(!stack.empty()) sb.append(stack.pop());
                  
               }else{
                   stack.push(num);
               }
        }
        sb.append(n+1);
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Solution Obj = new Solution();
    System.out.print(Obj.smallestNumber(str));
  }
}
