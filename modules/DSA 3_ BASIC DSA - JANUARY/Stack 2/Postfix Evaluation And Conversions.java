
// Question Link -- https://course.acciojob.com/idle?question=e508251a-37f6-412c-8d06-7e9219a293f7

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluation(exp);
  }
}

class Solution{
    public void evaluation(String str){
	    System.out.println(value(str));
		System.out.println(convertInfix(str));
		System.out.println(convertPrefix(str));
    }

	public static String convertPrefix(String str){
		int n = str.length();
        Stack<String> stack = new Stack<>();

		for(int i=0; i<n;i++){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				stack.push(ch+"");
			}else{
				String v2 = stack.pop();
				String v1 = stack.pop();

				String ans = ch + v1 + v2 ;

				stack.push(ans);
	
			}
		}

	    return stack.peek();
	}

	public static String convertInfix(String str){
		int n = str.length();
        Stack<String> stack = new Stack<>();

		for(int i=0; i<n;i++){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				stack.push(ch+"");
			}else{
				String v2 = stack.pop();
				String v1 = stack.pop();

				String ans = "(" + v1 + ch + v2 + ")" ;

				stack.push(ans);
	
			}
		}

	    return stack.peek();
	}
	
	public static int value(String str){
		int n = str.length();
        Stack<Integer> stack = new Stack<>();

		for(int i=0; i<n;i++){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				int val = ch -'0'; 
				stack.push(val);
			}else{
				int v2 = stack.pop();
				int v1 = stack.pop();

				int ans = eval(v1,v2,ch);

				stack.push(ans);
	
			}
		}

	    return stack.peek();
	}
	
	public static int eval(int v1 , int v2 , char o ){

		if(o=='+'){
			return v1 + v2;
		}else if(o == '-'){
			return v1 - v2;
		}else if(o == '/'){
			return v1/v2;
		}else{
			return v1*v2;
		}
	}
}                         
