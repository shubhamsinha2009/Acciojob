
// Question Link -- https://course.acciojob.com/idle?question=5435d3a1-ebd0-4b1c-85f8-d4b600f468b6

import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			Solution g = new Solution();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
        sc.close();
		
	}
}

class Solution
{
	Stack<int[]> stack;
    
	Solution()
	{
		stack = new Stack<>();
	}

	void push(int val){
       int min = stack.empty() ? val : Math.min(stack.peek()[1],val);
        stack.push(new int[]{val,min} );	
    }
	
	int pop(){
		if(stack.empty()) return -1;
		 return stack.pop()[0];
	}

    int getMin(){
         if(stack.empty()) return -1;
        return stack.peek()[1];
	}	
}
