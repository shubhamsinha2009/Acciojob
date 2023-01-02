
// Question Link -- https://course.acciojob.com/idle?question=9b8027fe-ea9c-4a9c-bdfc-dfac7e278271

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Main
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
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Main llist = new Main(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < N; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
			
        Solution ob = new Solution();
		head = ob.removeAllDuplicates(llist.head);
		llist.printList(head);
    }
    
}
class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        Node dummyHead = new Node(0);
		dummyHead.next= head;
		Node prev = dummyHead;
		Node curr = head ;

		while(curr!=null){

			int data = curr.data;

			while(curr.next!=null && curr.next.data == data){

					curr=curr.next;
				
			}

			if(prev.next!=curr){
				prev.next = curr.next;
				
			}else{
				prev=prev.next;
			}
			
			curr=curr.next;

		}

		return dummyHead.next;
    }
}
