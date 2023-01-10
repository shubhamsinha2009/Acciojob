
// Question Link - https://course.acciojob.com/idle?question=9c94428f-1965-4a4b-b4be-969a7cbc250e

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluate(exp);
  }
}

class Solution{
    public void evaluate(String exp){

			System.out.println(solve(exp));

			convert(exp);
    }

	public static void convert(String exp){

		Stack<String> postfix = new Stack<>();
		Stack<String> prefix = new Stack<>();

		Stack<Character> operators = new Stack<>();

		for(Character ch : exp.toCharArray()){

			if(Character.isDigit(ch)){

				prefix.push(ch+"");
				postfix.push(ch+"");
			}else if(ch == '('){
				operators.push(ch);
			}else if(ch == ')'){

				while(operators.peek() != '('){

					eval(operators,prefix,postfix);
					
				}

				operators.pop();
			}else{
				while(shouldPop(operators,ch)){
					
					eval(operators,prefix,postfix);
				}

				operators.push(ch);
			}
		}

		while(!operators.empty()){
			eval(operators,prefix,postfix);
		}

		System.out.println(postfix.peek());
		System.out.println(prefix.peek());
		
	}

	public static boolean shouldPop(Stack<Character> operators , Character ch){
		return (!operators.empty() && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek()));
	}
	public static void eval(Stack<Character> operators , Stack<String> prefix ,Stack<String> postfix){
					char o = operators.pop();

					String postv2 = postfix.pop();
					String postv1 = postfix.pop();
					String ans=  postv1 + postv2 + o;

					postfix.push(ans);
					
					String prev2 = prefix.pop();
					String prev1 = prefix.pop();
					String ans2=  o + prev1 + prev2;

					prefix.push(ans2);
	}

	public static int solve(String exp){

		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();


		for(Character ch : exp.toCharArray()){

			
			if(Character.isDigit(ch)){
				operands.push(ch -'0');
			
			}else if(ch=='('){
				operators.push(ch);
			}else if(ch == ')'){

				while(operators.peek() != '('){
					eval(operands,operators);
				}

				operators.pop();
			
			}else{

				while(shouldPop(operators,ch)){
					eval(operands,operators);
				}

				operators.push(ch);
			}
	
		}
		
		while(!operators.empty()){
				eval(operands,operators);
			}
		return operands.peek();
		
	}

	public static int precedence(char o){

		if(o=='*' || o =='/') return 2;
		else return 1 ;
	}

	public static void eval(Stack<Integer> operands ,Stack<Character> operators){

		int v2 = operands.pop();
		int v1 = operands.pop();
		char o = operators.pop();

				int ans = calculate(v1,v2,o);

			operands.push(ans);
	}

	public static int calculate(int v1 , int v2 , char o ){

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
