
// Question Link - https://course.acciojob.com/idle?question=6511efbc-c1a3-4b49-9868-d9ce82656410

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
		Node newhead=ob.deleteOddNodes(llist.head);
		llist.printList(newhead);
    }
}

class Solution
{
 
    public static Node deleteOddNodes(Node head) {

		Node dummyHead = new Node(0);
		dummyHead.next = head;
		Node temp =head;
		Node prev = dummyHead;
		while(temp!=null ){
				if(temp.data%2 != 0){
					prev.next = temp.next;
					
				}else{
					prev = prev.next;
					
				}
						
			temp=temp.next;
		}
		
		return dummyHead.next;
}
}

