
// Question Link -- https://course.acciojob.com/idle?question=360a3653-9861-453b-ae65-564bdb579674

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
    static Node insert(Node head, int n, int pos, int val) {

		// Through Loop
		// return insertLoop(head,pos,val);

		// Through recursion 
		 return insertRecursion(head,pos,val);
			
    }

	static Node insertRecursion(Node dummy, int pos, int val){

		if(pos==0){
			Node newHead = new Node(val);
			newHead.next = dummy;
			return newHead;	
		}

		if(pos==1){
			Node newNode = new Node(val);
			newNode.next = dummy.next;
			dummy.next = newNode;
			return dummy;
		}

		dummy.next = insertRecursion(dummy.next,pos-1,val);
		return dummy;
	}

	static Node insertLoop(Node head, int pos, int val){
		Node newNode = new Node(val);
			if(pos ==0){
				newNode.next = head;
				head = newNode;
				return head;
			}

			int index=1;
			Node temp = head;
				while(pos!=index){
					index++;
					temp=temp.next;
					
				}

			newNode.next= temp.next;
			temp.next=newNode;

			return head;
		
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();
        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
