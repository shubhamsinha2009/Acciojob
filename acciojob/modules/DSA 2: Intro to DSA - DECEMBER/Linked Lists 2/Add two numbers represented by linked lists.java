
// Question Link -- https://course.acciojob.com/idle?question=f9ebb6a0-0789-4aea-bc82-d875b1b7ae88


import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{

    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
		if(head1 == null && head2==null) return null;
			 // Reverse them
			head1 = reverse(head1);
			head2 = reverse(head2);

		Node dummyHead = new Node(0);
        Node curr = dummyHead;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

			dummyHead = dummyHead.next;

			return reverse(dummyHead);
	    
        
    }

	public static Node reverse(Node curr){

		Node newHead =null;
		
		while(curr!=null){
			Node temp = curr.next;
			curr.next=newHead;
			newHead = curr;
			curr = temp;
		}
		return newHead;
		
	}
    
}
