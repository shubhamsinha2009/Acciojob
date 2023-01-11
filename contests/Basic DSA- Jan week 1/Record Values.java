
// Question Link - https://course.acciojob.com/idle?question=481f654d-3285-4ebc-af28-0e041aa79d88

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String operation[]=new String[n];
        for(int i=0;i<n;i++)
        operation[i]=sc.next();
        
        Solution obj=new Solution();

        System.out.println(obj.solve(operation,n));

		sc.close();
    }
}

class Solution {

    int solve(String operation[],int n) {

		Stack<Integer> stack = new Stack<>();

		for(int i=0;i<n;i++){

				String cur = operation[i];
			
				if(cur.equals("+")){
					int v1 = stack.pop();
					int v2 = stack.peek();
					stack.push(v1);
					stack.push(v1+v2);
				}else if(cur.equals("D")){
					int v = stack.peek();
					stack.push(2*v);
				}else if(cur.equals("C")){
					stack.pop();
				}else{
					stack.push(Integer.parseInt(cur));
				}
		}

		int sum =0;
		while(!stack.empty()){
			sum+= stack.pop();
		}

		return sum;
  }
}
