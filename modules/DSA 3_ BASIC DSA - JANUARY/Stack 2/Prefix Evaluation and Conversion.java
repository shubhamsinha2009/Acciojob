
// Question Link -- https://course.acciojob.com/idle?question=a89985d6-231c-4a56-a236-0435f67da82a

import java.util.*;
  
public class Main{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        valueOfExpression(str);

    }
    public static void valueOfExpression(String str)
    {
		System.out.println(value(str));
		System.out.println(convertInfix(str));
		System.out.println(convertPostfix(str));
		
        
    }

	public static String convertPostfix(String str){
		int n = str.length();
        Stack<String> stack = new Stack<>();

		for(int i=n-1; i>=0;i--){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				stack.push(ch+"");
			}else{
				String v1 = stack.pop();
				String v2 = stack.pop();

				String ans = v1 + v2 + ch ;

				stack.push(ans);
	
			}
		}

	    return stack.peek();
	}

	public static String convertInfix(String str){
		int n = str.length();
        Stack<String> stack = new Stack<>();

		for(int i=n-1; i>=0;i--){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				stack.push(ch+"");
			}else{
				String v1 = stack.pop();
				String v2 = stack.pop();

				String ans = "(" + v1 + ch + v2 + ")" ;

				stack.push(ans);
	
			}
		}

	    return stack.peek();
	}
	
	public static int value(String str){
		int n = str.length();
        Stack<Integer> stack = new Stack<>();

		for(int i=n-1; i>=0;i--){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				int val = ch -'0'; 
				stack.push(val);
			}else{
				int v1 = stack.pop();
				int v2 = stack.pop();

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

