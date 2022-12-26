
// Question Link - https://course.acciojob.com/idle?question=7ebf8ac7-1dc3-4411-8a08-c59fe324537c

import java.util.*;

class Solution {
    public static Node mergesort(Node head){
		if(head==null) return null;

		if(head.next==null) return head ;

		Node preMid = middle(head);
		Node mid = preMid.next;
		preMid.next = null;

		Node l1 = mergesort(head);
		Node l2 = mergesort(mid);
		return merge(l1,l2);
    }

	public static Node merge(Node l1,Node l2){

		if(l1==null && l2 ==null) return null;
		Node head = new Node(0);
		Node dummy = head;

		
		while(l1!=null && l2!=null){

			if(l1.data <l2.data){

				dummy.next = l1;
				l1 =l1.next;
			
			}else{
				
				dummy.next = l2;
				l2 =l2.next;
				
			}
				dummy= dummy.next;
		}

		if(l1!=null){
			dummy.next=l1;
		}
		if(l2!=null){
			dummy.next = l2;
		}

		return head.next;
	}

	public static Node middle(Node head){
		
		Node slow = head,fast= head;

		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}

		return slow;
	}
}


class Node{
    int data;
    Node next = null;
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
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
