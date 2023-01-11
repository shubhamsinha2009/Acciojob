
// Question Link -- https://course.acciojob.com/idle?question=89a5f158-cacc-427d-a317-0967668d8f2b

import java.io.*;
import java.util.*;

class StackQueue
{
    Stack<Integer> stack1 = new Stack<>() ;
    Stack<Integer> stack2 = new Stack<>() ;
	
    void Push(int x)
    {
	   stack1.push(x); 
	  
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
		if(stack1.empty() && stack2.empty()) return -1;
	  transfer();
        return stack2.pop();
	    
    }
	
	 void transfer(){
        if(stack2.empty()){
             while (!stack1.empty()){
                stack2.push(stack1.pop());
             }
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
