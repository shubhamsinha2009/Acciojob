
// Question Link -- https://course.acciojob.com/idle?question=9391bb3a-b600-416a-a140-45647675ce52

import java.io.*;
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	
}
class Main
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
            String S[] = br.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
    
		
		    String S1[] = br.readLine().split(" ");
			insertion llist = new insertion(); 
			int a1=Integer.parseInt(S1[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = Integer.parseInt(S1[i]);
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		Node newhead=ob.removeNthFromEnd(llist.head, n);
		llist.printList(newhead);
    }
}

class Solution
{
    public static Node removeNthFromEnd(Node head, int n) {

		// Through Loop
		// return removeLoop(head,n);

		// Through Recursion
		 return removeRecursion(head,n);
}
	public static Node removeRecursion(Node head , int n){
		
		if(head==null) return head;
		
		Node start = new Node(0);
		start.next =head;
        helper(start, n);
        return start.next;
		
	}

	public static int helper(Node node, int n) {
        if (node.next == null) return 1;
		
        int nextPos = helper(node.next, n);
		
        if (nextPos == n) node.next = node.next.next;
		
        return nextPos + 1;
    }
	
	public static Node removeLoop(Node head , int n ){

		Node start = new Node(0);
			start.next = head;
		Node beforeN = start;
		Node afterN= start;
		

		while(n>=0){
			afterN = afterN.next;
			n--;
		}

		while(afterN != null){
			afterN = afterN.next;
			beforeN = beforeN.next;
		}

		beforeN.next = beforeN.next.next;
		return start.next ;
		
	}
}

