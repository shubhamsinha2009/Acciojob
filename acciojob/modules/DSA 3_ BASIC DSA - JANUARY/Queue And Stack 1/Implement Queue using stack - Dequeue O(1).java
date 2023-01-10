
// Question Link -- https://course.acciojob.com/idle?question=dbb19e7c-f100-4b90-9e98-b3c8916d3b29

import java.io.*;
import java.util.*;

class StackQueue
{
   Stack<Integer> stack1 = new Stack<>() ;
    Stack<Integer> stack2 = new Stack<>() ;
	
    void Push(int x)
    {
	    
		transfer(stack1,stack2);
		stack1.push(x);
		transfer(stack2,stack1);
	  
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(stack1.empty()) return -1;
        return stack1.pop();
	    
    }

	 void transfer(Stack<Integer> to ,Stack<Integer> from){
       
             while (!to.empty()){
                from.push(to.pop());
             }
        
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);  
        StackQueue s = new StackQueue();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}
