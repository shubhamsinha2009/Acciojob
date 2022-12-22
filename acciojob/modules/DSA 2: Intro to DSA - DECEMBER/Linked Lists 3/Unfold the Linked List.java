
// Question Link -- https://course.acciojob.com/idle?question=5a9b74ab-5b0d-48ee-9f86-8ea64b016649

import java.io.*;
import java.util.*;
 
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
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {

		Node dummy = head;
		Node temp = new Node(0);
		Node dummy2 = temp;
		Node prev = null;

		while(dummy!=null && dummy.next!=null){
			
			dummy2.next = dummy.next;
			dummy.next= dummy.next.next;
			dummy2 = dummy2.next;
			prev = dummy;
			dummy= dummy.next;
			
		}
		
		temp =temp.next;		
		temp = reverse(temp);
		prev.next = temp;

		printLL(head);
		
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

	public static void printLL(Node head){
		
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	
	}
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
