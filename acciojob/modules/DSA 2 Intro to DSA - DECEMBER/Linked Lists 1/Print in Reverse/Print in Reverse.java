
// Question Link -- https://course.acciojob.com/idle?question=cec8fd82-e5ae-4c8a-b52d-b44325b9c27d

import java.util.*;
import java.io.*;

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
}
public class Main {
    public static void reverse(Node curr){

		Node temp = reverseLL(curr);

		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
    }

	public static Node reverseLL(Node curr){

		// Through Loops 
		// return reverseLoop(curr);

		// Through Recursion
		 return reverseRecursion(curr);
	
	}

	public static Node reverseRecursion(Node curr){

		if(curr.next==null||curr==null) return curr;
		Node newHead = reverseRecursion(curr.next);

		curr.next.next = curr;
		curr.next =null;
		
		return newHead;
	}

	public static Node reverseLoop(Node curr){

		Node newHead =null;
		
		while(curr!=null){
			Node temp = curr.next;
			curr.next=newHead;
			newHead = curr;
			curr = temp;
		}
		return newHead;
		
	}
	
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }
}
