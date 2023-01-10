
// Question Link - https://course.acciojob.com/idle?question=06476864-88f7-478c-bff1-94797c7556b1

import java.io.*;
import java.util.*;
class Stack
{
	Queue<Integer> queue= new LinkedList<>();
    void push(int a)
    {
        queue.add(a);
    }
    
    int pop()
    {
		if(queue.isEmpty()) return -1;
         for(int i=0;i<queue.size()-1;i++){           
            queue.add(queue.remove());
        }
        return queue.remove();
    }	
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        Stack g = new Stack();			
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                   g.push(a);
            }
            else if(QueryType == 2){
                  System.out.print(g.pop() + " ");
            }
            q--;
        }	
    }
}
