
// Quhttps://course.acciojob.com/idle?question=f9ebb6a0-0789-4aea-bc82-d875b1b7ae88estion Link - https://course.acciojob.com/idle?question=f9ebb6a0-0789-4aea-bc82-d875b1b7ae88

import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class NodeParameters{
	int headData;
	Node reverseNode;
	int length;

	NodeParameters(int headData,Node reverseNode, int length){
		this.headData = headData;
		this.reverseNode = reverseNode;
		this.length= length;
	}

	
}

class Main{
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node first = new Node(val);
        Node tail = first;
        for(int i=0; i<n-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        int m = sc.nextInt();
        val = sc.nextInt();
        Node second = new Node(val);
        tail = second;
        for(int i=0; i<m-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        Solution g = new Solution();
        Node res = g.subtract(first, second);
        printList(res);
    }
}

class Solution{   
    static Node subtract(Node head1, Node head2)
    {
       if(head1 == null && head2==null) return null;
			 // Reverse them
		NodeParameters head1Para = reverseAndGiveParameters(head1);
		NodeParameters head2Para = reverseAndGiveParameters(head2);

		head1 = head1Para.reverseNode;
		head2 = head2Para.reverseNode;

		if(head2Para.length > head1Para.length || ((head2Para.length == head1Para.length) && head2Para.headData > head1Para.headData)){
			Node temp = head1;
			head1= head2;
			head2 = temp;
		} 
		
		Node dummyHead = new Node(0);
        Node curr = dummyHead;
		

        while (head1 != null || head2 != null ) {
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;
			
            int diff =  x - y;
			if(diff<0){
				diff+=10;
				head1.next.data--;
			}
            
            curr.next = new Node(diff);
            curr = curr.next;
            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

			dummyHead = dummyHead.next;

			NodeParameters dummyPara = reverseAndGiveParameters(dummyHead);

				dummyHead = dummyPara.reverseNode;

		while(dummyHead.data == 0 && dummyHead.next!=null){
			dummyHead = dummyHead.next;
		}
	    return dummyHead;
    }

	public static NodeParameters reverseAndGiveParameters(Node curr){

		Node newHead =null;
		int length=0;
		int headData = curr.data;
		
		while(curr!=null){
			Node temp = curr.next;
			curr.next=newHead;
			newHead = curr;
			curr = temp;
			length++;
		}
	
		NodeParameters np = new NodeParameters(headData,newHead,length);
			return np;
	}
}
