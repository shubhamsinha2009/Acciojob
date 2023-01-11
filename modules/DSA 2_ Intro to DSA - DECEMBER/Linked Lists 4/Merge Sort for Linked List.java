
// Question Link - https://course.acciojob.com/idle?question=7ebf8ac7-1dc3-4411-8a08-c59fe324537c

import java.util.*;

class Solution {
    public static Node mergesort(Node head){
		if(head==null || head.next==null) return head ;

		Node preMid = middle(head);
		Node mid = preMid.next;
		preMid.next = null;

		Node left = mergesort(head);
		Node right = mergesort(mid);
		return merge(left,right);
    }

	public static Node merge(Node left,Node right){

		if(left==null) return right;
		if(right ==null) return left;
		
		Node head = new Node(0);
		Node dummy = head;

		
		while(left!=null &&right!=null){

			if(left.data <right.data){

				dummy.next = left;
				left =left.next;
			
			}else{
				
				dummy.next =right;
				right =right.next;
				
			}
				dummy= dummy.next;
		}

		if(left!=null){
			dummy.next=left;
		}
		if(right!=null){
			dummy.next =right;
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

